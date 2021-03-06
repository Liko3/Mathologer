package mathologer

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

/**
 * See the API for {@link ControllerUnitTest} for usage instructions.
 */
class MultiplicationCircleControllerSpec extends Specification implements ControllerUnitTest<MultiplicationCircleController> {

    void "asking for #segments segments should provide #segments lines"(segments) {
        given:
        def model = new MultiplicationCircleModel(segmentCount: segments) // TODO: Add the table base when it is available
        when:
        controller.index(model)
        then:
        model.lines.size() == segments
        where:
        segments << [0, 1, 10, 100]
    }
}
