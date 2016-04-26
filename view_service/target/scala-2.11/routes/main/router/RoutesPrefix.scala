
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/joseph/IdeaProjects/vamojunto/view_service/conf/routes
// @DATE:Mon Apr 25 22:07:05 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
