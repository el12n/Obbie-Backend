package obbie.backend.controllers

import grails.rest.*
import obbie.backend.domains.BarberShop

class BarberShopController extends RestfulController {

	static responseFormats = ['json', 'xml']

    BarberShopController() {
        super(BarberShop)
    }
}
