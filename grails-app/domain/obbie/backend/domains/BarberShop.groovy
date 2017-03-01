package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class BarberShop implements GormEntity<BarberShop>{

    String name
    String barberShopIdentifier
    String phone
    double latitude
    double longitude
    boolean isAvailable
    String imgSrc

    static constraints = {
        name(blank: false, size: 5..40)
        barberShopIdentifier(blank: false, size: 5..10)
        phone(matches: '\\d{3}-\\d{3}-\\d{4}')
        latitude(blank: false)
        longitude(blank: false)
        isAvailable(blank: false, default: false)
        imgSrc(nullable: true)
    }
}
