package vet



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ArquivoLaudoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ArquivoLaudo.list(params), model:[arquivoLaudoInstanceCount: ArquivoLaudo.count()]
    }

    def show(ArquivoLaudo arquivoLaudoInstance) {
        respond arquivoLaudoInstance
    }

    def create() {
        respond new ArquivoLaudo(params)
    }

    @Transactional
    def save(ArquivoLaudo arquivoLaudoInstance) {
        if (arquivoLaudoInstance == null) {
            notFound()
            return
        }

        if (arquivoLaudoInstance.hasErrors()) {
            respond arquivoLaudoInstance.errors, view:'create'
            return
        }

        arquivoLaudoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'arquivoLaudo.label', default: 'ArquivoLaudo'), arquivoLaudoInstance.id])
                redirect arquivoLaudoInstance
            }
            '*' { respond arquivoLaudoInstance, [status: CREATED] }
        }
    }

    def edit(ArquivoLaudo arquivoLaudoInstance) {
        respond arquivoLaudoInstance
    }

    @Transactional
    def update(ArquivoLaudo arquivoLaudoInstance) {
        if (arquivoLaudoInstance == null) {
            notFound()
            return
        }

        if (arquivoLaudoInstance.hasErrors()) {
            respond arquivoLaudoInstance.errors, view:'edit'
            return
        }

        arquivoLaudoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ArquivoLaudo.label', default: 'ArquivoLaudo'), arquivoLaudoInstance.id])
                redirect arquivoLaudoInstance
            }
            '*'{ respond arquivoLaudoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ArquivoLaudo arquivoLaudoInstance) {

        if (arquivoLaudoInstance == null) {
            notFound()
            return
        }

        arquivoLaudoInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ArquivoLaudo.label', default: 'ArquivoLaudo'), arquivoLaudoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'arquivoLaudo.label', default: 'ArquivoLaudo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	
/*	def index() {
		params.max = 10
		[arquivoLaudoInstanceList: ArquivoLaudo.list(params), arquivoLaudoInstanceTotal: ArquivoLaudo.count()]
	}*/
	@Transactional
	def upload() {
		def file = request.getFile('arquivo')
		def arquivoLaudoInstance = new ArquivoLaudo()
		if(file.empty) {
			flash.message = "File cannot be empty"
		} else {
            arquivoLaudoInstance.nomeArquivo = file.originalFilename
            arquivoLaudoInstance.arquivo = file.getBytes()
			arquivoLaudoInstance.uploadData = new Date()
//            arquivoLaudoInstance.save()
			save(arquivoLaudoInstance)
		}
//		redirect (action:'index')
	}
	
	def download(long id) {
		ArquivoLaudo arquivoLaudoInstance = ArquivoLaudo.get(id)
		if ( arquivoLaudoInstance == null) {
			flash.message = "Document not found."
			redirect (action:'index')
		} else {
			response.setContentType("APPLICATION/OCTET-STREAM")
			response.setHeader("Content-Disposition", "Attachment;Filename=\"${arquivoLaudoInstance.nomeArquivo}\"")

			def outputStream = response.getOutputStream()
			outputStream << arquivoLaudoInstance.arquivo
			outputStream.flush()
			outputStream.close()
		}
	}
}
