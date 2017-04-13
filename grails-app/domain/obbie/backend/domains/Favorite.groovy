package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Favorite implements GormEntity<Favorite>{

    Barber barber

    static belongsTo = [client: Client]

    static constraints = {
    }
}
