

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class VeterinarioController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Veterinario.list(params), model:[veterinarioInstanceCount: Veterinario.count()]
    }

    def show(Veterinario veterinarioInstance) {
        respond veterinarioInstance
    }

    def create() {
        respond new Veterinario(params)
    }

    @Transactional
    def save(Veterinario veterinarioInstance) {
        if (veterinarioInstance == null) {
            notFound()
            return
        }

        if (veterinarioInstance.hasErrors()) {
            respond veterinarioInstance.errors, view:'create'
            return
        }

        veterinarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'veterinario.label', default: 'Veterinario'), veterinarioInstance.id])
                redirect veterinarioInstance
            }
            '*' { respond veterinarioInstance, [status: CREATED] }
        }
    }

    def edit(Veterinario veterinarioInstance) {
        respond veterinarioInstance
    }

    @Transactional
    def update(Veterinario veterinarioInstance) {
        if (veterinarioInstance == null) {
            notFound()
            return
        }

        if (veterinarioInstance.hasErrors()) {
            respond veterinarioInstance.errors, view:'edit'
            return
        }

        veterinarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Veterinario.label', default: 'Veterinario'), veterinarioInstance.id])
                redirect veterinarioInstance
            }
            '*'{ respond veterinarioInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Veterinario veterinarioInstance) {

        if (veterinarioInstance == null) {
            notFound()
            return
        }

        veterinarioInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Veterinario.label', default: 'Veterinario'), veterinarioInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'veterinario.label', default: 'Veterinario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
