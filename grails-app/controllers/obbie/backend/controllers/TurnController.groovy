package obbie.backend.controllers

import grails.rest.*
import obbie.backend.domains.Turn

class TurnController extends RestfulController {

    static responseFormats = ['json', 'xml']

    TurnController() {
        super(Turn)
    }
}
