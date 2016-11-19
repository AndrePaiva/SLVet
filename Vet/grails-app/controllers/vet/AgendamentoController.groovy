package vet


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class AgendamentoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def jsonEvent(){
		
		List agendamentos = Agendamento.list()
		
		
		render agendamentos as JSON
	}
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Agendamento.list(params), model:[agendamentoInstanceCount: Agendamento.count()]
    }

    def show(Agendamento agendamentoInstance) {
        respond agendamentoInstance
    }

    def create() {
        respond new Agendamento(params)
    }

    @Transactional
    def save(Agendamento agendamentoInstance) {
        if (agendamentoInstance == null) {
            notFound()
            return
        }

        if (agendamentoInstance.hasErrors()) {
            respond agendamentoInstance.errors, view:'create'
            return
        }
		agendamentoInstance.title = (agendamentoInstance.animal.cliente.nome.split(" ")[0]) + " - " + agendamentoInstance.animal.nome
        agendamentoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'agendamento.label', default: 'Agendamento'), agendamentoInstance.id])
                respond agendamentoInstance, view:'index'
            }
            '*'{ respond agendamentoInstance, [status: CREATED] }
        }
    }

    def edit(Agendamento agendamentoInstance) {
        respond agendamentoInstance
    }

    @Transactional
    def update(Agendamento agendamentoInstance) {
        if (agendamentoInstance == null) {
            notFound()
            return
        }

        if (agendamentoInstance.hasErrors()) {
            respond agendamentoInstance.errors, view:'edit'
            return
        }

        agendamentoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Agendamento.label', default: 'Agendamento'), agendamentoInstance.id])
                redirect agendamentoInstance
            }
            '*'{ respond agendamentoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Agendamento agendamentoInstance) {

        if (agendamentoInstance == null) {
            notFound()
            return
        }

        agendamentoInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Agendamento.label', default: 'Agendamento'), agendamentoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'agendamento.label', default: 'Agendamento'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
