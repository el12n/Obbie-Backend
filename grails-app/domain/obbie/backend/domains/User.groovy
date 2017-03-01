package obbie.backend.domains

import org.grails.datastore.gorm.GormEntity

class User implements GormEntity<User> {

    String firstName
    String lastName
    String identification
    String phone
    String email
    String password
    String imgSrc

    static constraints = {
        firstName(blank: false, lenght: 40)
        lastName(blank: false, lenght: 40)
        identification(blank: false, lenght: 11, unique: true)
        phone(blank: false, lenght: 15)
        email(blank: false, lenght: 100)
        password(blank: false, lenght: 32)
        imgSrc(blank: false)
    }
}

