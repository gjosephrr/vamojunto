
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("bootstrap-3.3.6-dist/css/bootstrap.min.css")),format.raw/*16.91*/("""" rel="stylesheet" media="screen"/>

        <script
        src = """"),_display_(/*19.17*/routes/*19.23*/.Assets.versioned("bootstrap-3.3.6-dist/js/bootstrap.min.js")),format.raw/*19.84*/(""""
        type = "text/javascript"></script>

        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*26.32*/("""
        """),_display_(/*27.10*/content),format.raw/*27.17*/("""


    """),format.raw/*30.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Apr 22 20:01:50 BRT 2016
                  SOURCE: /home/joseph/IdeaProjects/vamojunto/view_service/app/views/main.scala.html
                  HASH: 28b9c51510b352d5d2cb999a3b7ca621ee343eff
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1421->481|1436->487|1499->528|1587->589|1602->595|1663->634|1714->658|1729->664|1813->727|1909->796|1924->802|2006->863|2101->931|2116->937|2178->978|2272->1134|2309->1144|2337->1151|2371->1158
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|49->19|49->19|49->19|52->22|52->22|52->22|55->26|56->27|56->27|59->30
                  -- GENERATED --
              */
          