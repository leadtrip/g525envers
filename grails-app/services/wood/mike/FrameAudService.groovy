package wood.mike

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

import javax.sql.DataSource

@Transactional
class FrameAudService {

    DataSource dataSource

    def all() {
        Sql sql = new Sql(dataSource)
        sql.rows("select * from frame_aud fa, revinfo ri where fa.rev = ri.rev")
    }
}
