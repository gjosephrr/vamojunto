
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Cadastre-se")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""

    """),format.raw/*3.5*/("""<div class="login-page">
        <h2>Bem vindo à VamoJunto!</h2>
        <div class="form">
            <form class="register-form">
                <input type="text" placeholder="Nome" required autofocus>
                <input type="email" placeholder="Email" required autofocus>
                <input type="text" placeholder="Matrícula"/>
                <input type="text" placeholder="Telefone"/>
                <input type="password" placeholder="Senha"/>
                <input type="password" placeholder="Repita sua senha"/>

                <p class="message">Para motoristas:</p>
                <input type="number" placeholder="Número de vagas no seu veículo" required autofocus>
                <input type="text" placeholder="Bairro" required autofocus>
                <input type="text" placeholder="Rua" required autofocus>
                <button>Cadastrar</button>
                <p class="message">Já se cadastrou? <a href="/">Entrar</a></p>
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 20:53:18 BRT 2016
                  SOURCE: /home/js/workspace/VamoJunto!/vamojunto/view_service/app/views/register.scala.html
                  HASH: c60e183720cfb2559e6a3913566ea1a9df2bedd8
                  MATRIX: 833->1|860->20|899->22|931->28
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          