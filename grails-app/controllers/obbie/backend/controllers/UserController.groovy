package obbie.backend.controllers

import grails.rest.RestfulController
import obbie.backend.domains.User

class UserController extends RestfulController {

    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }
}
