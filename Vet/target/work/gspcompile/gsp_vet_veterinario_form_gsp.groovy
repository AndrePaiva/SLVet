import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_veterinario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/veterinario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: veterinarioInstance, field: 'veterinario', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("veterinario.veterinario.label"),'default':("Veterinario")],-1)
printHtmlPart(2)
invokeTag('select','g',9,['id':("veterinario"),'name':("veterinario.id"),'from':(Pessoa.list()),'optionKey':("id"),'required':(""),'value':(veterinarioInstance?.veterinario?.nome),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: veterinarioInstance, field: 'crmv', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("veterinario.crmv.label"),'default':("Crmv")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("crmv"),'required':(""),'value':(veterinarioInstance?.crmv)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473892949086L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
