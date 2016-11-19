import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_animalindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/animal/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('message','g',30,['code':("animal.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',32,['property':("especie"),'title':(message(code: 'animal.especie.label', default: 'Especie'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',34,['property':("nome"),'title':(message(code: 'animal.nome.label', default: 'Nome'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',36,['property':("peso"),'title':(message(code: 'animal.peso.label', default: 'Peso'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',38,['property':("raca"),'title':(message(code: 'animal.raca.label', default: 'Raca'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',40,['property':("tamanho"),'title':(message(code: 'animal.tamanho.label', default: 'Tamanho'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( animalInstance in (animalInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: animalInstance, field: "cliente"))
})
invokeTag('link','g',48,['action':("show"),'id':(animalInstance.id)],3)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: animalInstance, field: "especie"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: animalInstance, field: "nome"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: animalInstance, field: "peso"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: animalInstance, field: "raca"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: animalInstance, field: "tamanho"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',65,['total':(animalInstanceCount ?: 0)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498488390L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
