import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_pessoashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pessoa/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'pessoa.label', default: 'Pessoa'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (pessoaInstance?.userEmail)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("pessoa.userEmail.label"),'default':("User Email")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(pessoaInstance),'field':("userEmail")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.telefone1)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("pessoa.telefone1.label"),'default':("Telefone1")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(pessoaInstance),'field':("telefone1")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.telefone2)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("pessoa.telefone2.label"),'default':("Telefone2")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',48,['bean':(pessoaInstance),'field':("telefone2")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.complemento)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("pessoa.complemento.label"),'default':("Complemento")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',57,['bean':(pessoaInstance),'field':("complemento")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.bairro)) {
printHtmlPart(23)
invokeTag('message','g',64,['code':("pessoa.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',66,['bean':(pessoaInstance),'field':("bairro")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.cep)) {
printHtmlPart(25)
invokeTag('message','g',73,['code':("pessoa.cep.label"),'default':("Cep")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',75,['bean':(pessoaInstance),'field':("cep")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.cidade)) {
printHtmlPart(27)
invokeTag('message','g',82,['code':("pessoa.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',84,['bean':(pessoaInstance),'field':("cidade")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.cpf)) {
printHtmlPart(29)
invokeTag('message','g',91,['code':("pessoa.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',93,['bean':(pessoaInstance),'field':("cpf")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.dataNascimento)) {
printHtmlPart(31)
invokeTag('message','g',100,['code':("pessoa.dataNascimento.label"),'default':("Data Nascimento")],-1)
printHtmlPart(32)
invokeTag('formatDate','g',102,['date':(pessoaInstance?.dataNascimento)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.logradouro)) {
printHtmlPart(33)
invokeTag('message','g',109,['code':("pessoa.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',111,['bean':(pessoaInstance),'field':("logradouro")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.nome)) {
printHtmlPart(35)
invokeTag('message','g',118,['code':("pessoa.nome.label"),'default':("Nome")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',120,['bean':(pessoaInstance),'field':("nome")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.numero)) {
printHtmlPart(37)
invokeTag('message','g',127,['code':("pessoa.numero.label"),'default':("Numero")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',129,['bean':(pessoaInstance),'field':("numero")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.rg)) {
printHtmlPart(39)
invokeTag('message','g',136,['code':("pessoa.rg.label"),'default':("Rg")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',138,['bean':(pessoaInstance),'field':("rg")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (pessoaInstance?.uf)) {
printHtmlPart(41)
invokeTag('message','g',145,['code':("pessoa.uf.label"),'default':("Uf")],-1)
printHtmlPart(42)
invokeTag('fieldValue','g',147,['bean':(pessoaInstance),'field':("uf")],-1)
printHtmlPart(15)
}
printHtmlPart(43)
createTagBody(2, {->
printHtmlPart(44)
createTagBody(3, {->
invokeTag('message','g',155,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',155,['class':("edit"),'action':("edit"),'resource':(pessoaInstance)],3)
printHtmlPart(45)
invokeTag('actionSubmit','g',156,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(46)
})
invokeTag('form','g',158,['url':([resource:pessoaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(47)
})
invokeTag('captureBody','sitemesh',160,[:],1)
printHtmlPart(48)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479507945621L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
