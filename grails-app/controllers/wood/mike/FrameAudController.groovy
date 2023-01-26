package wood.mike

class FrameAudController {

    def frameAudService

    def index() {
        [allFrameAuds: frameAudService.all()]
    }
}
