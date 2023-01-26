package wood.mike

import org.hibernate.envers.Audited

@Audited
class Frame {

    Integer size
    String material

    static constraints = {
        size inList: [47, 50, 52, 54, 56, 58, 60]
    }
}
