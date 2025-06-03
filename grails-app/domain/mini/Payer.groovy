package mini

import mini.Customer
import mini.utils.BaseEntity

class Payer extends BaseEntity {
    String name
    String email
    Customer customer
}