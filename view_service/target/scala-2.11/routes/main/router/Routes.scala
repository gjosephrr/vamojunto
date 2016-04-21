
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/js/workspace/VamoJunto!/vamojunto/view_service/conf/routes
// @DATE:Thu Apr 21 13:24:31 BRT 2016

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
  ViewController_2: controllers.ViewController,
  // @LINE:8
  Assets_1: controllers.Assets,
  // @LINE:14
  APIController_0: api_service.controllers.APIController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ViewController_2: controllers.ViewController,
    // @LINE:8
    Assets_1: controllers.Assets,
    // @LINE:14
    APIController_0: api_service.controllers.APIController
  ) = this(errorHandler, ViewController_2, Assets_1, APIController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ViewController_2, Assets_1, APIController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ViewController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.ViewController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """new_user""", """api_service.controllers.APIController.newUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login_user""", """controllers.ViewController.loginUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.ViewController.logout()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ViewController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ViewController_index0_invoker = createInvoker(
    ViewController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
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
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
  private[this] lazy val controllers_ViewController_register2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_ViewController_register2_invoker = createInvoker(
    ViewController_2.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:14
  private[this] lazy val api_service_controllers_APIController_newUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("new_user")))
  )
  private[this] lazy val api_service_controllers_APIController_newUser3_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_ViewController_loginUser4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login_user")))
  )
  private[this] lazy val controllers_ViewController_loginUser4_invoker = createInvoker(
    ViewController_2.loginUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "loginUser",
      Nil,
      "POST",
      """POST    /login_user                 api_service.controllers.APIController.login()""",
      this.prefix + """login_user"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ViewController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_ViewController_logout5_invoker = createInvoker(
    ViewController_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ViewController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ViewController_index0_route(params) =>
      call { 
        controllers_ViewController_index0_invoker.call(ViewController_2.index())
      }
  
    // @LINE:8
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_ViewController_register2_route(params) =>
      call { 
        controllers_ViewController_register2_invoker.call(ViewController_2.register())
      }
  
    // @LINE:14
    case api_service_controllers_APIController_newUser3_route(params) =>
      call { 
        api_service_controllers_APIController_newUser3_invoker.call(APIController_0.newUser())
      }
  
    // @LINE:17
    case controllers_ViewController_loginUser4_route(params) =>
      call { 
        controllers_ViewController_loginUser4_invoker.call(ViewController_2.loginUser())
      }
  
    // @LINE:19
    case controllers_ViewController_logout5_route(params) =>
      call { 
        controllers_ViewController_logout5_invoker.call(ViewController_2.logout())
      }
  }
}
