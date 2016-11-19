import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_laudoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/laudo/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'laudo.label', default: 'Laudo'))],-1)
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
if(true && (laudoInstance?.animal)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("laudo.animal.label"),'default':("Animal")],-1)
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(laudoInstance?.animal?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("animal"),'action':("show"),'id':(laudoInstance?.animal?.id)],3)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (laudoInstance?.arquivo)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("laudo.arquivo.label"),'default':("Arquivo")],-1)
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(laudoInstance?.arquivo?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("arquivoLaudo"),'action':("show"),'id':(laudoInstance?.arquivo?.id)],3)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (laudoInstance?.data)) {
printHtmlPart(19)
invokeTag('message','g',46,['code':("laudo.data.label"),'default':("Data")],-1)
printHtmlPart(20)
invokeTag('formatDate','g',48,['date':(laudoInstance?.data)],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (laudoInstance?.veterinario)) {
printHtmlPart(21)
invokeTag('message','g',55,['code':("laudo.veterinario.label"),'default':("Veterinario")],-1)
printHtmlPart(22)
createTagBody(3, {->
expressionOut.print(laudoInstance?.veterinario?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("veterinario"),'action':("show"),'id':(laudoInstance?.veterinario?.id)],3)
printHtmlPart(15)
}
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createTagBody(3, {->
invokeTag('message','g',65,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',65,['class':("edit"),'action':("edit"),'resource':(laudoInstance)],3)
printHtmlPart(25)
invokeTag('actionSubmit','g',66,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(26)
})
invokeTag('form','g',68,['url':([resource:laudoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479507814245L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
