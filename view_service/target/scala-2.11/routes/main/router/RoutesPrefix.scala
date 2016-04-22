
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/js/workspace/VamoJunto!/vamojunto/view_service/conf/routes
// @DATE:Fri Apr 22 15:03:17 BRT 2016


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
