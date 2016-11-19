package vet


import static org.springframework.http.HttpStatus.*

import org.grails.plugin.easygrid.Easygrid;
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
@Easygrid
class PessoaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def pessoaService
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Pessoa.list(params), model:[pessoaInstanceCount: Pessoa.count()]
    }

    def show(Pessoa pessoaInstance) {
        respond pessoaInstance
    }

    def create() {
        respond new Pessoa(params)
    }

    @Transactional
    def save(Pessoa pessoaInstance) {
        if (pessoaInstance == null) {
            notFound()
            return
        }

        if (pessoaInstance.hasErrors()) {
            respond pessoaInstance.errors, view:'create'
            return
        }

        pessoaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pessoa.label', default: 'Pessoa'), pessoaInstance.id])
                redirect pessoaInstance
            }
            '*' { respond pessoaInstance, [status: CREATED] }
        }
    }

    def edit(Pessoa pessoaInstance) {
        respond pessoaInstance
    }

    @Transactional
    def update(Pessoa pessoaInstance) {
        if (pessoaInstance == null) {
            notFound()
            return
        }

        if (pessoaInstance.hasErrors()) {
            respond pessoaInstance.errors, view:'edit'
            return
        }

        pessoaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Pessoa.label', default: 'Pessoa'), pessoaInstance.id])
                redirect pessoaInstance
            }
            '*'{ respond pessoaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Pessoa pessoaInstance) {

        if (pessoaInstance == null) {
            notFound()
            return
        }

        pessoaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Pessoa.label', default: 'Pessoa'), pessoaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pessoa.label', default: 'Pessoa'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
}
