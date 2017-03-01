package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Barber extends User implements GormEntity<Barber> {

    Boolean isWorking
    Turn turn

    static belongsTo = BarberShop

    static constraints = {
    }
}
