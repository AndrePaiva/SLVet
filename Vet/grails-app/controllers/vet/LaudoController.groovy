package vet


import static org.springframework.http.HttpStatus.*

import org.grails.plugin.easygrid.Easygrid;

import grails.transaction.Transactional
import vet.ArquivoLaudo
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
@Easygrid
class LaudoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def arquivoLaudoService
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Laudo.list(params), model:[laudoInstanceCount: Laudo.count()]
    }

    def show(Laudo laudoInstance) {
        respond laudoInstance
    }

    def create() {
		Laudo laudo = new Laudo(params)
		laudo.arquivo = new ArquivoLaudo()
        respond laudo
    }
	
	@Transactional
	def upload(ArquivoLaudo arquivoLaudoInstance) {
		def file = request.getFile('arquivo.arquivo')
//		def arquivoLaudoInstance = new ArquivoLaudo()
		if(file.empty) {
			flash.message = "File cannot be empty"
		} else {
			arquivoLaudoInstance.nomeArquivo = file.originalFilename
			arquivoLaudoInstance.arquivo = file.getBytes()
			arquivoLaudoInstance.uploadData = new Date()
//            arquivoLaudoInstance.save()
			arquivoLaudoInstance.save flush:true
		}
//		redirect (action:'index')
	}
	
    @Transactional
    def save(Laudo laudoInstance) {
        if (laudoInstance == null) {
            notFound()
            return
        }

        if (laudoInstance.hasErrors()) {
            respond laudoInstance.errors, view:'create'
            return
        }
//		laudoInstance.arquivo.nomeArquivo ="AAA"
//		laudoInstance.arquivo.uploadData = new Date()
//		arquivoLaudoService.save(laudoInstance.arquivo)
		upload(laudoInstance.arquivo)
        laudoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'laudo.label', default: 'Laudo'), laudoInstance.id])
                redirect laudoInstance
            }
            '*' { respond laudoInstance, [status: CREATED] }
        }
    }

    def edit(Laudo laudoInstance) {
        respond laudoInstance
    }

    @Transactional
    def update(Laudo laudoInstance) {
        if (laudoInstance == null) {
            notFound()
            return
        }

        if (laudoInstance.hasErrors()) {
            respond laudoInstance.errors, view:'edit'
            return
        }

        laudoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Laudo.label', default: 'Laudo'), laudoInstance.id])
                redirect laudoInstance
            }
            '*'{ respond laudoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Laudo laudoInstance) {

        if (laudoInstance == null) {
            notFound()
            return
        }

        laudoInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Laudo.label', default: 'Laudo'), laudoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'laudo.label', default: 'Laudo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	def laudoGrid = {
    domainClass Laudo
	
    columns {
		
        id {
            type 'id'
            enableFilter false
			jqgrid {
				hidden true
			}
        }
       animal{
		   filterProperty 'animal.nome'
		   label 'Animal'
			value{it?.animal?.nome}
		}
		
	   /*veterinario{
		   filterProperty 'veterinario.nome'
		   label 'Veterinario'
			value{it?.veterinario?.nome}
		}
        */
		data{
			enableFilter false
			label 'Data'
		}
		
		arquivo{
			sortable false
			enableFilter false
			label 'Laudo'
			value{it?.arquivo?.nomeArquivo}
		}
		
		arquivoID{
			value{it?.arquivo?.id}
			jqgrid {
				hidden true
			}
		}
		
        }
    }
}
