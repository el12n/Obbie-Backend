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
        firstName(blank: false, size: 2..40)
        lastName(blank: false, size: 5..40)
        identification(blank: false, lenght: 11, unique: true)
        phone(matches: '\\d{3}-\\d{3}-\\d{4}')
        email(email: true, size: 8..100)
        password(blank: false, size: 6..32)
        imgSrc nullable: true
    }
}

