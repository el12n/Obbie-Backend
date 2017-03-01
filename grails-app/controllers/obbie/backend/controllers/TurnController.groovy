package obbie.backend.controllers


import grails.rest.*
import grails.converters.*

class TurnController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TurnController() {
        super(Turn)
    }
}
