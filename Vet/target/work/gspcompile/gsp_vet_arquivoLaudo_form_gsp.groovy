import vet.ArquivoLaudo
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_arquivoLaudo_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/arquivoLaudo/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: arquivoLaudoInstance, field: 'nomeArquivo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("arquivoLaudo.nomeArquivo.label"),'default':("Nome Arquivo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nomeArquivo"),'required':(""),'value':(arquivoLaudoInstance?.nomeArquivo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: arquivoLaudoInstance, field: 'uploadData', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("arquivoLaudo.uploadData.label"),'default':("Upload Data")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',19,['name':("uploadData"),'precision':("day"),'value':(arquivoLaudoInstance?.uploadData),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: arquivoLaudoInstance, field: 'arquivo', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("arquivoLaudo.arquivo.label"),'default':("Arquivo")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473894225030L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
