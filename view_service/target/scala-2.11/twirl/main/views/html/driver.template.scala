
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object driver_Scope0 {
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

class driver extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("VamoJunto!")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""

    """),format.raw/*3.5*/("""<!-- NOTE: This is only a first draft, a lot in this file will change, including the way we add the map -->
    <div class="container-fluid">
        <div class="row">

            <!-- Left column -->
            <div class="col-md-2 column" style="padding: 0px">

                <!-- User profile picture -->
                <div class="container-fluid profile-picture" style="padding: 0px">
                    <img src=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("images/biscoito.png")),format.raw/*12.78*/(""""
                    class="img-circle img-responsive center-block"
                    width="200" height="300"/>
                </div>

                <!-- User rides -->
                <div class="container-fluid profile-info" style="padding: 0px">
                     <nav class="nav navbar-inverse">
                        <div class="container" style="width: inherit">
                            <p class="navbar-text center-text"><strong>Minhas viagens</strong></p>
                        </div>
                     </nav>

                    <div>
                        <ol>
                            <li><span style="color: #999D9D;">1.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui viagens cadastradas :/
                                </p>
                            </li>
                            <li><span style="color: #999D9D;">2.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui viagens cadastradas :/
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
                    #floating-list"""),format.raw/*56.35*/("""{"""),format.raw/*56.36*/("""
                        """),format.raw/*57.25*/("""position: absolute;
                        margin-left: 80%;
                        top: 2%;
                        height: 250px;
                        width: 250px;
                        background-color: #3D3D3D;

                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""</style>
                <div class="container-fluid" id="floating-list" style="padding: 0">
                    <nav class="nav navbar-inverse">
                        <div class="container-fluid">
                            <div class="navbar-header">
                                <a href="#" class="navbar-brand">Notificações</a>
                            </div>
                        </div>
                    </nav>
                    <div>
                        <ol>
                            <li><span style="color: #999D9D;">1.</span>
                                <p style="padding-top: 15px">
                                    Você ainda não possui notificações :/
                                </p>
                            </li>
                        </ol>
                    </div>

                </div>

                <style>
                    #floating-button"""),format.raw/*87.37*/("""{"""),format.raw/*87.38*/("""
                        """),format.raw/*88.25*/("""position: absolute;
                        margin-left: 80%;
                        top: 90%;
                        white-space: normal;
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/("""
                """),format.raw/*93.17*/("""</style>
                <div class="container-fluid" >
                    <button type="button" id="floating-button" class="btn btn-primary btn-lg"><strong>Nova viagem</strong></button>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object driver extends driver_Scope0.driver
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 19:45:28 BRT 2016
                  SOURCE: /home/joseph/IdeaProjects/vamojunto/view_service/app/views/driver.scala.html
                  HASH: 109690b07ebd8ce281d7bfc9ef91b0c789677119
                  MATRIX: 829->1|855->19|893->20|925->26|1378->452|1393->458|1454->498|3183->2199|3212->2200|3265->2225|3537->2469|3566->2470|3611->2487|4546->3394|4575->3395|4628->3420|4817->3581|4846->3582|4891->3599
                  LINES: 32->1|32->1|32->1|34->3|43->12|43->12|43->12|87->56|87->56|88->57|95->64|95->64|96->65|118->87|118->87|119->88|123->92|123->92|124->93
                  -- GENERATED --
              */
          