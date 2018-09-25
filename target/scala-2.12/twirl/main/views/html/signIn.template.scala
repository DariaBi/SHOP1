
package views.html

/*1.2*/import play.api.data.Form
/*2.2*/import play.api.i18n.Messages
/*3.2*/import play.api.mvc.RequestHeader
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder
/*6.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*7.2*/import forms.SignInForm.Data
/*8.2*/import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(messages("iShop"))/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/messages("Sign in credentials")),format.raw/*14.49*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = controllers.routes.SignInController.submit())/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
            """),_display_(/*16.14*/b3/*16.16*/.email(signInForm("email"), '_hiddenLabel -> messages("email"), 'placeholder -> messages("email"), 'class -> "form-control input-lg")),format.raw/*16.149*/("""
            """),_display_(/*17.14*/b3/*17.16*/.password(signInForm("password"), '_hiddenLabel -> messages("password"), 'placeholder -> messages("password"), 'class -> "form-control input-lg")),format.raw/*17.161*/("""
            """),_display_(/*18.14*/b3/*18.16*/.checkbox(signInForm("rememberMe"), '_text -> messages("Remember me"), 'checked -> true)),format.raw/*18.104*/("""
            """),format.raw/*19.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*21.112*/messages("Sign in")),format.raw/*21.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*24.10*/("""

        """),_display_(/*26.10*/if(socialProviders.providers.nonEmpty)/*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
            """),format.raw/*27.13*/("""<div class="social-providers">
                <p>"""),_display_(/*28.21*/messages("Or use social:")),format.raw/*28.47*/("""</p>
                <div>
                """),_display_(/*30.18*/for(p <- socialProviders.providers) yield /*30.53*/ {_display_(Seq[Any](format.raw/*30.55*/("""
                    """),format.raw/*31.21*/("""<a href=""""),_display_(/*31.31*/controllers/*31.42*/.routes.SocialAuthController.authenticate(p.id)),format.raw/*31.89*/("""" class="provider """),_display_(/*31.108*/p/*31.109*/.id),format.raw/*31.112*/("""" title=""""),_display_(/*31.122*/messages(p.id)),format.raw/*31.136*/(""""><img src=""""),_display_(/*31.149*/assets/*31.155*/.path(s"images/providers/${p.id}.png")),format.raw/*31.193*/("""" width="64px" height="64px" alt=""""),_display_(/*31.228*/messages(p.id)),format.raw/*31.242*/(""""></a>
                """)))}),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""</div>
            </div>
        """)))}),format.raw/*35.10*/("""

    """),format.raw/*37.5*/("""</fieldset>
""")))}))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Sep 25 05:35:35 CEST 2018
                  SOURCE: /home/daria/E-business/app/views/signIn.scala.html
                  HASH: 392305563843db14d36f2439a3016812fb83b32a
                  MATRIX: 28->1|61->28|98->59|139->94|182->131|221->164|300->237|336->267|751->303|1012->470|1040->472|1072->495|1112->497|1144->502|1232->563|1284->594|1330->613|1345->619|1414->679|1454->681|1495->695|1506->697|1661->830|1702->844|1713->846|1880->991|1921->1005|1932->1007|2042->1095|2083->1108|2269->1266|2310->1285|2402->1346|2440->1357|2487->1395|2527->1397|2568->1410|2646->1461|2693->1487|2764->1531|2815->1566|2855->1568|2904->1589|2941->1599|2961->1610|3029->1657|3076->1676|3087->1677|3112->1680|3150->1690|3186->1704|3227->1717|3243->1723|3303->1761|3366->1796|3402->1810|3457->1834|3502->1851|3568->1886|3601->1892
                  LINES: 4->1|5->2|6->3|7->4|8->5|9->6|10->7|11->8|16->10|21->11|22->12|22->12|22->12|23->13|24->14|24->14|25->15|25->15|25->15|25->15|26->16|26->16|26->16|27->17|27->17|27->17|28->18|28->18|28->18|29->19|31->21|31->21|34->24|36->26|36->26|36->26|37->27|38->28|38->28|40->30|40->30|40->30|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|41->31|42->32|43->33|45->35|47->37
                  -- GENERATED --
              */
          