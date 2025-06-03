package mini

import mini.Payer

class PayerController {
    def index() {

    }

    def save() {
        try {
            String name = params.name
            String email = params.email
            Payer payer = new Payer(name: name, email: email).save(flush: true)
            redirect(action: "show", id: payer.id)
        } catch (Exception e) {
            println(e)
            render "Não foi possível salvar"
        }
    }
}