package mini

import mini.Customer
import grails.gorm.transactions.Transactional

@Transactional
class CustomerService {
   public Customer save(String name, String email) {
       Customer customer = new Customer()
       customer.name = name
       customer.email = email
       customer.save(failOnError: true)
       return customer
   }
}
