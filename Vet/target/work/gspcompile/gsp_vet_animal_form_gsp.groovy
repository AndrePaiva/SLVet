import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_animal_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/animal/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: animalInstance, field: 'cliente', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("animal.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("cliente"),'name':("cliente.id"),'from':(Pessoa.list()),'optionKey':("id"),'required':(""),'value':(animalInstance?.cliente?.nome),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'especie', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("animal.especie.label"),'default':("Especie")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("especie"),'required':(""),'value':(animalInstance?.especie)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'nome', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("animal.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("nome"),'required':(""),'value':(animalInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'peso', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("animal.peso.label"),'default':("Peso")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("peso"),'value':(fieldValue(bean: animalInstance, field: 'peso')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'raca', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("animal.raca.label"),'default':("Raca")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("raca"),'required':(""),'value':(animalInstance?.raca)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'tamanho', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("animal.tamanho.label"),'default':("Tamanho")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("tamanho"),'value':(fieldValue(bean: animalInstance, field: 'tamanho')),'required':("")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473891764912L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
