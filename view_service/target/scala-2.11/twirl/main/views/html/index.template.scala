
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("VamoJunto!")/*1.20*/{_display_(Seq[Any](format.raw/*1.21*/("""

    """),format.raw/*3.5*/("""<div class="login-page">
        <h2>Bem vindo à VamoJunto!</h2>
        <div class="form">

            <form class="login-form">
                <input type="text" placeholder="Matrícula" required autofocus>
                <input type="password" placeholder="Senha" required/>
                <button>login</button>
                <p class="message">Ainda não se cadastrou? <a href="/register">Crie uma conta!</a></p>
            </form>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 18 23:04:02 BRT 2016
                  SOURCE: /home/js/workspace/VamoJunto!/view_service/app/views/index.scala.html
                  HASH: 11efa89c19eccc6a4f4248e6c441139ee271b1ef
                  MATRIX: 827->1|853->19|891->20|923->26
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          