
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


Seq[Any](format.raw/*1.1*/("""﻿"""),_display_(/*1.3*/main("Cadastre-se")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""

    """),format.raw/*3.5*/("""<div class="login-page">
        <h2>Bem vindo ao VamoJunto!</h2>

        <div class="form">
            <form class="register-form" action="/new_user" method="post">
            
                <div id="first">
                    <input name="name" type="text" placeholder="Nome" required autofocus>
                    <input name="email" type="email" placeholder="Email" required autofocus>
                    <input name="neighborhood" type="text" placeholder="Bairro" required autofocus>
                    <input name="street" type="text" placeholder="Rua" required autofocus>
                    <input name="phone_number" type="text" placeholder="Telefone" required/>
                    <button id="next_btn1" onclick="next_step1()" type="button">Próximo</button>
                </div>

                <div id="second">
                    <input name="school_id" type="text" placeholder="Matrícula" required/>
                    <input name="password" type="password" placeholder="Senha" required/>
                    <input name="password2" type="password" placeholder="Repita sua senha" required/>
                    <button id="pre_btn1" onclick="prev_step1()" type="button">Voltar</button>
                    <p></p>
                    <button id="next_btn2" name="next" onclick="next_step2()" type="button">Próximo</button>
                </div>
                
                <div id="third">
                    <p class="message">Se você também é motorista, insira <br />a quantidade de vagas disponíveis:</p>
                    <input name="vehicle_seats" type="number" value="0" placeholder="Número de vagas no seu veículo">
                    <button id="pre_btn2" onclick="prev_step2()" type="button">Voltar</button>
                    <p></p>
                    <button type="submit">Cadastrar</button>
                </div>

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
                  DATE: Thu Apr 21 14:54:50 BRT 2016
                  SOURCE: /home/js/workspace/VamoJunto!/vamojunto/view_service/app/views/register.scala.html
                  HASH: 0217488ce40a274b712fe3a9eaa287786114c709
                  MATRIX: 833->0|860->2|887->21|926->23|958->29
                  LINES: 32->1|32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          