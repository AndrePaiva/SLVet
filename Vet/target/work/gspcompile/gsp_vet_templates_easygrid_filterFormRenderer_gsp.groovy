import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_templates_easygrid_filterFormRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/easygrid/_filterFormRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(attrs.id)
printHtmlPart(1)
expressionOut.print(attrs.id)
printHtmlPart(2)
expressionOut.print(attrs.id)
printHtmlPart(3)
invokeTag('hiddenField','g',5,['name':("_filterForm"),'value':("true")],-1)
printHtmlPart(4)
for( _it525193238 in (gridConfig.filterForm.fields) ) {
changeItVariable(_it525193238)
printHtmlPart(5)
expressionOut.print(it.name)
printHtmlPart(6)
invokeTag('message','g',9,['code':(it.label),'default':(it.label)],-1)
printHtmlPart(7)
if(true && (it.type == 'interval')) {
printHtmlPart(8)
invokeTag('field','g',14,['name':("${it.name}.from"),'type':("number")],-1)
printHtmlPart(9)
invokeTag('field','g',15,['name':("${it.name}.to"),'type':("number")],-1)
printHtmlPart(10)
}
else {
printHtmlPart(11)
invokeTag('field','g',19,['name':(it.name),'type':(it.type)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(4)
invokeTag('submitButton','g',23,['name':("Filter")],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498489326L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
