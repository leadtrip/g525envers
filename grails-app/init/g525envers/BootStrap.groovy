package g525envers

import grails.gorm.transactions.Transactional
import wood.mike.Frame

class BootStrap {

    def init = { servletContext ->
        addDomain()
        updateDomain()
    }

    @Transactional
    def addDomain() {
        new Frame(size: 47, material: 'Carbon').save()
    }

    @Transactional
    def updateDomain() {
        Frame fr = Frame.first()
        fr.size = 50
        fr.save()
    }

    def destroy = {
    }
}
