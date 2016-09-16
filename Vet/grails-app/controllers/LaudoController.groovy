

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class LaudoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Laudo.list(params), model:[laudoInstanceCount: Laudo.count()]
    }

    def show(Laudo laudoInstance) {
        respond laudoInstance
    }

    def create() {
        respond new Laudo(params)
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
}
