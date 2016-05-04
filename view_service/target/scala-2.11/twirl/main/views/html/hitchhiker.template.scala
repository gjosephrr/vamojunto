
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hitchhiker_Scope0 {
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

class hitchhiker extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("VamoJunto!")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""

    """),format.raw/*3.5*/("""<!-- NOTE: This is only a first draft, a lot in this file will change, including the way we add the map -->
    <div class="container-fluid">
        <div class="row">

                <!-- Left column -->
            <div class="col-md-2 column" style="background-color:#99ccff;" style="padding: 0px">

                    <!-- User profile picture -->
                <div class="container-fluid profile-picture" style="padding: 0px">
                    <img src=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("images/user.png")),format.raw/*12.74*/(""""
                    class="img-circle img-responsive center-block"
                    width="200" height="300"/>
                </div>

                    <!-- User rides -->
                <div class="container-fluid profile-info" style="padding: 0px">
                    <nav class="nav navbar-default">
                        <div class="container" style="width: inherit">
                            <p class="navbar-text center-text"><strong>Minhas caronas</strong></p>
                        </div>
                    </nav>

                    <div>
                        <ol>
                            <li><span style="color: #0f0f0f;">1.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui caronas cadastradas :/
                                </p>
                            </li>
                            <li><span style="color: #0f0f0f;">2.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui caronas cadastradas :/
                                </p>
                            </li>
                        </ol>
                    </div>
                </div>

            </div>

                <!-- Right column -->
            <div class="col-md-10 column container-fluid" style="padding: 0px; position: relative">

                    <!-- Map -->
                <div id="map" style="position: absolute;">

                </div>

                <script src="https://maps.googleapis.com/maps/api/js?callback=initMap"
                async defer></script>

                <style>
                #floating-list"""),format.raw/*55.31*/("""{"""),format.raw/*55.32*/("""
                """),format.raw/*56.17*/("""position: absolute;
                margin-left: 80%;
                top: 2%;
                height: 250px;
                width: 250px;
                background-color: #EFEFEF;
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""</style>

                <div class="container-fluid" id="floating-list" style="padding: 0">
                    <nav class="nav navbar-default">
                        <div class="container-fluid" style="background-color:#99ccff;">
                            <div class="navbar-header">
                                <a href="#" class="navbar-brand">Notificações</a>
                            </div>
                        </div>
                    </nav>
                    <div>
                        <ol>
                            <li><span style="color: #0f0f0f;">1.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui notificações :/
                                </p>
                            </li>
                        </ol>
                    </div>
                </div>

                <style>
                #floating-button"""),format.raw/*84.33*/("""{"""),format.raw/*84.34*/("""
                """),format.raw/*85.17*/("""position: absolute;
                margin-left: 80%;
                top: 90%;
                white-space: normal;
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""
                """),format.raw/*90.17*/("""</style>
                <div class="container-fluid" >
                    <!-- <button type="button" id="floating-button" class="btn btn-primary btn-lg"><strong>Procurar Carona</strong></button> -->
                    <button>Procurar carona</button>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*98.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object hitchhiker extends hitchhiker_Scope0.hitchhiker
              /*
                  -- GENERATED --
                  DATE: Wed May 04 15:36:45 BRT 2016
                  SOURCE: /home/js/workspace/VamoJunto!/vamojunto/view_service/app/views/hitchhiker.scala.html
                  HASH: 16b635a30c8cbd70a4c29ed4fff98a4d9cba63b6
                  MATRIX: 837->1|863->19|901->20|933->26|1428->494|1443->500|1500->536|3234->2242|3263->2243|3308->2260|3535->2459|3564->2460|4529->3397|4558->3398|4603->3415|4764->3548|4793->3549|4838->3566|5191->3889
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|43->12|86->55|86->55|87->56|93->62|93->62|115->84|115->84|116->85|120->89|120->89|121->90|129->98
                  -- GENERATED --
              */
          