import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_animalshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/animal/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'animal.label', default: 'Animal'))],-1)
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
if(true && (animalInstance?.cliente)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("animal.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(animalInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("pessoa"),'action':("show"),'id':(animalInstance?.cliente?.id)],3)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (animalInstance?.especie)) {
printHtmlPart(17)
invokeTag('message','g',38,['code':("animal.especie.label"),'default':("Especie")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',40,['bean':(animalInstance),'field':("especie")],-1)
printHtmlPart(19)
}
printHtmlPart(16)
if(true && (animalInstance?.nome)) {
printHtmlPart(20)
invokeTag('message','g',47,['code':("animal.nome.label"),'default':("Nome")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',49,['bean':(animalInstance),'field':("nome")],-1)
printHtmlPart(19)
}
printHtmlPart(16)
if(true && (animalInstance?.peso)) {
printHtmlPart(22)
invokeTag('message','g',56,['code':("animal.peso.label"),'default':("Peso")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',58,['bean':(animalInstance),'field':("peso")],-1)
printHtmlPart(19)
}
printHtmlPart(16)
if(true && (animalInstance?.raca)) {
printHtmlPart(24)
invokeTag('message','g',65,['code':("animal.raca.label"),'default':("Raca")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',67,['bean':(animalInstance),'field':("raca")],-1)
printHtmlPart(19)
}
printHtmlPart(16)
if(true && (animalInstance?.tamanho)) {
printHtmlPart(26)
invokeTag('message','g',74,['code':("animal.tamanho.label"),'default':("Tamanho")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',76,['bean':(animalInstance),'field':("tamanho")],-1)
printHtmlPart(19)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',84,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',84,['class':("edit"),'action':("edit"),'resource':(animalInstance)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',85,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',87,['url':([resource:animalInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',89,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479506917655L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
