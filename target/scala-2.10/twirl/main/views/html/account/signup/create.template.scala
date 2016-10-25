
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/(""" """),_display_(/*1.44*/main(null)/*1.54*/ {_display_(Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*3.1*/("""<section id="signup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>New User Registration</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>User
				Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="fullname" required="required"
					placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" required="required"
					placeholder="Choose a user name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-password">
			<label class="title"><span class="required">*</span>Password:</label>
			<div class="item-cont">
				<input class="large" type="password" name="inputPassword" value=""
					required="required" placeholder="Create a password..." /><span
					class="icon-place"></span>
			</div>
		</div>
		<div class="element-radio">
			<label class="title"><span class="required">*</span>Account Role:</label>
			<div class="column column1">
				<label><input type="radio" name="role" value="Business User"
					required="required" /><span>Business User</span></label><label><input
					type="radio" name="role" value="Emergency Manager"
					required="required" /><span>Emergency Manager</span></label>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="element-checkbox">
			<div class="column column1">
				<label><input type="checkbox" name="checkbox[]"
					value="option 1" / required="required"><span>I agree
						with the terms and conditions *</span></label>
			</div>
			<span class="clearfix"></span>
		</div>
		<div class="submit">
			<!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
			<input type="submit" value="Submit" /> <a href="/"
				class="buttonCancel">"""),_display_(/*55.27*/Messages("goback")),format.raw/*55.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

	<div class="loginBlock">
		<a href="/auth"><div class="loginText">"""),_display_(/*62.43*/Messages("account.exists")),format.raw/*62.69*/("""</div></a>
		<a href="/reset/ask"><div class="loginText">"""),_display_(/*63.48*/Messages("forgot.password")),format.raw/*63.75*/("""</div></a>
	</div>

</section>

""")))}),format.raw/*68.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Tue Oct 25 08:25:38 MDT 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/account/signup/create.scala.html
                  HASH: 61c60c9ab6015b6984dbbd7f6815b6a039e6b427
                  MATRIX: 782->1|917->41|945->43|963->53|1002->55|1030->57|3266->2266|3305->2284|3495->2447|3542->2473|3627->2531|3675->2558|3738->2591
                  LINES: 27->1|32->1|32->1|32->1|32->1|34->3|86->55|86->55|93->62|93->62|94->63|94->63|99->68
                  -- GENERATED --
              */
          