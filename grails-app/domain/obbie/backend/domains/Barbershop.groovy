package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class Barbershop implements GormEntity<Barbershop> {

    String name
    String barberShopIdentifier
    String phone
    double latitude
    double longitude
    boolean isAvailable
    String imgSrc

    static hasMany = [barbers: Barber]

    static constraints = {
        name(blank: false, size: 5..40)
        barberShopIdentifier(blank: false, size: 5..10, unique: true)
        phone(matches: '\\d{3}-\\d{3}-\\d{4}')
        isAvailable(default: false)
        latitude(nullable: true)
        longitude(nullable: true)
        imgSrc(nullable: true)
    }
}
