import vet.Agendamento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_agendamento_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/agendamento/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: agendamentoInstance, field: 'animal', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("agendamento.animal.label"),'default':("Animal")],-1)
printHtmlPart(2)
invokeTag('select','g',18,['id':("animal"),'name':("animal.id"),'from':(vet.Animal.list()),'optionKey':("id"),'required':(""),'value':(agendamentoInstance?.animal?.id),'class':("form-control")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: agendamentoInstance, field: 'start', 'error'))
printHtmlPart(4)
invokeTag('message','g',26,['code':("agendamento.start.label"),'default':("Data Inicio")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',30,['name':("start"),'precision':("hour"),'value':(agendamentoInstance?.start)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498488174L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
