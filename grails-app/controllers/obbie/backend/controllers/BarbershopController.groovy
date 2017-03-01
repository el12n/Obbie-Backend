package obbie.backend.controllers

import grails.rest.*
import obbie.backend.domains.Barbershop

class BarbershopController extends RestfulController {

	static responseFormats = ['json', 'xml']

    BarbershopController() {
        super(Barbershop)
    }
}
