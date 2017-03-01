package obbie.backend.controllers

import grails.rest.RestfulController
import obbie.backend.domains.Client

class ClientController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ClientController() {
        super(Client)
    }
}
