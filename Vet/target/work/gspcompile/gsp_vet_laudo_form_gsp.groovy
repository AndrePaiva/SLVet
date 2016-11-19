import vet.Animal
import vet.Veterinario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_laudo_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/laudo/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: laudoInstance, field: 'animal', 'error'))
printHtmlPart(2)
invokeTag('message','g',8,['code':("laudo.animal.label"),'default':("Animal")],-1)
printHtmlPart(3)
invokeTag('select','g',18,['id':("animal"),'name':("animal.id"),'from':(Animal.list()),'optionKey':("id"),'required':(""),'value':(laudoInstance?.animal?.id),'class':("form-control")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: laudoInstance, field: 'data', 'error'))
printHtmlPart(5)
invokeTag('message','g',27,['code':("laudo.data.label"),'default':("Data")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',28,['name':("data"),'precision':("day"),'value':(laudoInstance?.data)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: laudoInstance, field: 'veterinario', 'error'))
printHtmlPart(8)
invokeTag('message','g',36,['code':("laudo.veterinario.label"),'default':("Veterinario")],-1)
printHtmlPart(3)
invokeTag('select','g',47,['id':("veterinario"),'name':("veterinario.id"),'from':(Veterinario.list()),'optionKey':("id"),'required':(""),'value':(laudoInstance?.veterinario?.id),'class':("form-control")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: laudoInstance, field: 'arquivo.arquivo', 'error'))
printHtmlPart(9)
invokeTag('message','g',54,['code':("arquivoLaudo.arquivo.label"),'default':("Arquivo")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498488639L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
