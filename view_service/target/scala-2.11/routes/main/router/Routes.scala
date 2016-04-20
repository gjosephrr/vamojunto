
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/joseph/IdeaProjects/vamojunto/view_service/conf/routes
// @DATE:Wed Apr 20 01:44:02 BRT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  Assets_2: controllers.Assets,
  // @LINE:16
  APIController_0: api_service.controllers.APIController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    Assets_2: controllers.Assets,
    // @LINE:16
    APIController_0: api_service.controllers.APIController
  ) = this(errorHandler, HomeController_1, Assets_2, APIController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_2, APIController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """driver_page""", """controllers.HomeController.driver()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hitchhiker_page""", """controllers.HomeController.hitchhiker()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """new_user""", """api_service.controllers.APIController.newUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login_user""", """api_service.controllers.APIController.login()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_register2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register2_invoker = createInvoker(
    HomeController_1.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_driver3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("driver_page")))
  )
  private[this] lazy val controllers_HomeController_driver3_invoker = createInvoker(
    HomeController_1.driver(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "driver",
      Nil,
      "GET",
      """""",
      this.prefix + """driver_page"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_hitchhiker4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hitchhiker_page")))
  )
  private[this] lazy val controllers_HomeController_hitchhiker4_invoker = createInvoker(
    HomeController_1.hitchhiker(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "hitchhiker",
      Nil,
      "GET",
      """""",
      this.prefix + """hitchhiker_page"""
    )
  )

  // @LINE:16
  private[this] lazy val api_service_controllers_APIController_newUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("new_user")))
  )
  private[this] lazy val api_service_controllers_APIController_newUser5_invoker = createInvoker(
    APIController_0.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "api_service.controllers.APIController",
      "newUser",
      Nil,
      "POST",
      """""",
      this.prefix + """new_user"""
    )
  )

  // @LINE:18
  private[this] lazy val api_service_controllers_APIController_login6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login_user")))
  )
  private[this] lazy val api_service_controllers_APIController_login6_invoker = createInvoker(
    APIController_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "api_service.controllers.APIController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login_user"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_HomeController_register2_route(params) =>
      call { 
        controllers_HomeController_register2_invoker.call(HomeController_1.register())
      }
  
    // @LINE:12
    case controllers_HomeController_driver3_route(params) =>
      call { 
        controllers_HomeController_driver3_invoker.call(HomeController_1.driver())
      }
  
    // @LINE:14
    case controllers_HomeController_hitchhiker4_route(params) =>
      call { 
        controllers_HomeController_hitchhiker4_invoker.call(HomeController_1.hitchhiker())
      }
  
    // @LINE:16
    case api_service_controllers_APIController_newUser5_route(params) =>
      call { 
        api_service_controllers_APIController_newUser5_invoker.call(APIController_0.newUser())
      }
  
    // @LINE:18
    case api_service_controllers_APIController_login6_route(params) =>
      call { 
        api_service_controllers_APIController_login6_invoker.call(APIController_0.login())
      }
  }
}
