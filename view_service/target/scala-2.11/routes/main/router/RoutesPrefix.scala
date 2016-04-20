
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/js/workspace/VamoJunto!/vamojunto/view_service/conf/routes
// @DATE:Tue Apr 19 20:41:31 BRT 2016


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
