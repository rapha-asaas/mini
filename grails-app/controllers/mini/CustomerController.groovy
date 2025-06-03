package mini

import mini.Customer

class CustomerController {

   def customerService

   def index() {
   }

   def save() {
        try {
            String name = params.name
            String email = params.email
            Customer customer = customerService.save(name, email)
            redirect(action: "show", id: customer.id)
        } catch (Exception e) {
            println(e)
            render "Não foi possível salvar"
        }
   }

   def show() {
        try {
            Customer customer = Customer.get(params.id)
            if (!customer) {
                render "Cliente não encontrado"
            }
            return [customer: customer]
        } catch (Exception e) {
            render "Cliente não encontrado"
        }
    }
}
    