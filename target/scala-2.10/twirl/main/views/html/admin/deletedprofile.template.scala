
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deletedprofile_Scope0 {
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

class deletedprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

 """),format.raw/*3.2*/("""<section id="confirmSignup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px">
		<div class="title">
			<h2>Success</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*11.56*/Messages("admin.delete.profile")),format.raw/*11.88*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" onclick="window.location.href='/admin'" value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>
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
object deletedprofile extends deletedprofile_Scope0.deletedprofile
              /*
                  -- GENERATED --
                  DATE: Thu Nov 17 15:11:30 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/admin/deletedprofile.scala.html
                  HASH: 81272b27dd4641fc3e185e4c4137834e13aff290
                  MATRIX: 851->1|864->7|903->9|932->12|1361->414|1414->446
                  LINES: 32->1|32->1|32->1|34->3|42->11|42->11
                  -- GENERATED --
              */
          