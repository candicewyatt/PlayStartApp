
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object accessdenied_Scope0 {
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

class accessdenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userRole: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="exportLocation">
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Access Denied</h2>
		</div>
		<div class="element-input">
			<label class="title"><span></span>Access has been denied to this page.  You do not have the correct access level.</label>
		</div>					
		<div class="submit">
			<div><a href="/"""),_display_(/*16.20*/userRole),format.raw/*16.28*/("""" class="buttonCustom" style="color: #FFFFFF;">Continue</a></div>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}))
      }
    }
  }

  def render(userRole:String): play.twirl.api.HtmlFormat.Appendable = apply(userRole)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userRole) => apply(userRole)

  def ref: this.type = this

}


}

/**/
object accessdenied extends accessdenied_Scope0.accessdenied
              /*
                  -- GENERATED --
                  DATE: Wed Dec 07 08:53:23 MST 2016
                  SOURCE: C:/WebDev/git/PlayAuthenticate/app/views/accessdenied.scala.html
                  HASH: 79b579ff0cb87e4401e1ac2176685de9932cc2de
                  MATRIX: 759->1|872->19|902->24|920->34|959->36|989->40|1574->598|1603->606
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|47->16|47->16
                  -- GENERATED --
              */
          