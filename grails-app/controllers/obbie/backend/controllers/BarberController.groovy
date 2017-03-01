package obbie.backend.controllers

import grails.rest.RestfulController
import obbie.backend.domains.Barber

class BarberController extends RestfulController {

    static responseFormats = ['json', 'xml']

    BarberController() {
        super(Barber)
    }

    @Override
    Object index() {
        if (params.active != null) {
            def active = params.active.toBoolean()
            def query = Barber.where {
                isWorking == active
            }
            respond query.list()
        } else {
            return super.index()
        }
    }
}
