import vet.Veterinario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_veterinarioshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/veterinario/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'veterinario.label', default: 'Veterinario'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (veterinarioInstance?.userEmail)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("veterinario.userEmail.label"),'default':("User Email")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(veterinarioInstance),'field':("userEmail")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.telefone1)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("veterinario.telefone1.label"),'default':("Telefone1")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(veterinarioInstance),'field':("telefone1")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.telefone2)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("veterinario.telefone2.label"),'default':("Telefone2")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(veterinarioInstance),'field':("telefone2")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.complemento)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("veterinario.complemento.label"),'default':("Complemento")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(veterinarioInstance),'field':("complemento")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.bairro)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("veterinario.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(veterinarioInstance),'field':("bairro")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.cep)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("veterinario.cep.label"),'default':("Cep")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(veterinarioInstance),'field':("cep")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.cidade)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("veterinario.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(veterinarioInstance),'field':("cidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.cpf)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("veterinario.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(veterinarioInstance),'field':("cpf")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.crmv)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("veterinario.crmv.label"),'default':("Crmv")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(veterinarioInstance),'field':("crmv")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.dataNascimento)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("veterinario.dataNascimento.label"),'default':("Data Nascimento")],-1)
printHtmlPart(35)
invokeTag('formatDate','g',111,['date':(veterinarioInstance?.dataNascimento)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.logradouro)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("veterinario.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(veterinarioInstance),'field':("logradouro")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.nome)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("veterinario.nome.label"),'default':("Nome")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(veterinarioInstance),'field':("nome")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.numero)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("veterinario.numero.label"),'default':("Numero")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(veterinarioInstance),'field':("numero")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.rg)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("veterinario.rg.label"),'default':("Rg")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(veterinarioInstance),'field':("rg")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (veterinarioInstance?.uf)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("veterinario.uf.label"),'default':("Uf")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',156,['bean':(veterinarioInstance),'field':("uf")],-1)
printHtmlPart(16)
}
printHtmlPart(46)
createTagBody(2, {->
printHtmlPart(47)
createTagBody(3, {->
invokeTag('message','g',164,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',164,['class':("edit"),'action':("edit"),'resource':(veterinarioInstance)],3)
printHtmlPart(48)
invokeTag('actionSubmit','g',165,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(49)
})
invokeTag('form','g',167,['url':([resource:veterinarioInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(50)
})
invokeTag('captureBody','sitemesh',169,[:],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479509542302L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
