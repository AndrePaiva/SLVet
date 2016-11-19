import vet.Pessoa
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
invokeTag('message','g',8,['code':("animal.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("cliente"),'name':("cliente.id"),'from':(Pessoa.list()),'optionKey':("id"),'required':(""),'value':(animalInstance?.cliente?.nome),'class':("form-control select")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: animalInstance, field: 'especie', 'error'))
printHtmlPart(4)
invokeTag('message','g',28,['code':("animal.especie.label"),'default':("Especie")],-1)
printHtmlPart(5)
invokeTag('textField','g',32,['class':("form-control"),'name':("especie"),'required':(""),'value':(animalInstance?.especie)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: animalInstance, field: 'nome', 'error'))
printHtmlPart(7)
invokeTag('message','g',40,['code':("animal.nome.label"),'default':("Nome")],-1)
printHtmlPart(5)
invokeTag('textField','g',44,['class':("form-control"),'name':("nome"),'required':(""),'value':(animalInstance?.nome)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: animalInstance, field: 'peso', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("animal.peso.label"),'default':("Peso")],-1)
printHtmlPart(9)
invokeTag('field','g',56,['class':("form-control"),'name':("peso"),'type':("decimal"),'value':(fieldValue(bean: animalInstance, field: 'peso')),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: animalInstance, field: 'raca', 'error'))
printHtmlPart(10)
invokeTag('message','g',64,['code':("animal.raca.label"),'default':("Raca")],-1)
printHtmlPart(5)
invokeTag('textField','g',68,['class':("form-control"),'name':("raca"),'required':(""),'value':(animalInstance?.raca)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: animalInstance, field: 'tamanho', 'error'))
printHtmlPart(11)
invokeTag('message','g',76,['code':("animal.tamanho.label"),'default':("Tamanho")],-1)
printHtmlPart(9)
invokeTag('field','g',80,['class':("form-control"),'name':("tamanho"),'type':("decimal"),'value':(fieldValue(bean: animalInstance, field: 'tamanho')),'required':("")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479503342698L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
