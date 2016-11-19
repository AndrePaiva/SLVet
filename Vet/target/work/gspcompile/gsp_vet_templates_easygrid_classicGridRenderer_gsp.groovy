import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_templates_easygrid_classicGridRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/easygrid/_classicGridRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( col in (gridConfig.columns) ) {
printHtmlPart(1)
if(true && (col?.classic?.sortable)) {
printHtmlPart(2)
invokeTag('sortableColumn','g',8,['property':(col.property),'title':(g.message(code: col.label, default: col.label))],-1)
printHtmlPart(1)
}
else {
printHtmlPart(3)
expressionOut.print(g.message(code: col.label, default: col.label))
printHtmlPart(4)
}
printHtmlPart(5)
}
printHtmlPart(6)
loop:{
int i = 0
for( row in (rows.rows) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
for( col in (gridConfig.columns) ) {
printHtmlPart(9)
if(true && (col?.classic?.link)) {
printHtmlPart(10)
createTagBody(4, {->
expressionOut.print(row[col])
})
invokeTag('link','g',25,['action':("show"),'id':(row[col])],4)
printHtmlPart(11)
}
else {
printHtmlPart(10)
expressionOut.print(row[col])
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
invokeTag('paginate','g',35,['total':(rows.records)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498489227L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
