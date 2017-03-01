package obbie.backend.controllers


import grails.rest.*
import obbie.backend.domains.Barber

class BarberController extends RestfulController {

    static responseFormats = ['json', 'xml']

    BarberController() {
        super(Barber)
    }
}
