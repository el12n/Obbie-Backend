package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Client extends User implements GormEntity<Client> {

    Turn turn

    static constraints = {
    }
}
