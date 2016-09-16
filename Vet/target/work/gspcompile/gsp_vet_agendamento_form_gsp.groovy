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
expressionOut.print(hasErrors(bean: agendamentoInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("agendamento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',8,['id':("cliente"),'name':("cliente.id"),'from':(Pessoa.list()),'optionKey':("id"),'required':(""),'value':(agendamentoInstance?.cliente?.nome),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: agendamentoInstance, field: 'data', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("agendamento.data.label"),'default':("Data")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',17,['name':("data"),'precision':("day"),'value':(agendamentoInstance?.data)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473892932894L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
