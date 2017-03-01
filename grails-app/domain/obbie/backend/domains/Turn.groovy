package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Turn implements GormEntity<Turn> {

    Barber barber
    Client client

    Date dateTimeIn
    Date dateTimeOut
    Boolean isApproved
    String status

    static constraints = {
        status blank: false
        dateTimeIn blank: false
        dateTimeOut blank: false
    }

    static mapping = {
        isApproved defaultValue: false
    }
}
