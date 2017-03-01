package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Barber extends User implements GormEntity<Barber> {

    Boolean isWorking

    static hasMany = [turns: Turn]
    static belongsTo = Barbershop

    static constraints = {
        isWorking default: false
    }
}
