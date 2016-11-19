import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='easygrid', version='1.7.1')
class gsp_easygrid_templates_easygrid_autocompleteRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/easygrid-1.7.1/grails-app/views/templates/easygrid/_autocompleteRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('hiddenField','g',2,['id':(attrs.id),'name':(attrs.name),'value':(attrs.value)],-1)
printHtmlPart(1)
expressionOut.print(attrs.id)
printHtmlPart(2)
expressionOut.print(createLink(controller: attrs.controller, action: "${attrs.gridName}AutocompleteResult"))
printHtmlPart(3)
expressionOut.print(createLink(controller: attrs.controller, action: "${attrs.gridName}SelectionLabel"))
printHtmlPart(4)
expressionOut.print(createLink(controller: attrs.controller, action: "${attrs.gridName}Html"))
printHtmlPart(5)
expressionOut.print(attrs.gridName)
printHtmlPart(6)
expressionOut.print(attrs.showSeparateLabel)
printHtmlPart(7)
expressionOut.print(attrs.showAutocompleteBox)
printHtmlPart(8)
expressionOut.print(attrs.autocompleteSize)
printHtmlPart(9)
for( _it937726434 in (attrs.staticConstraints) ) {
changeItVariable(_it937726434)
printHtmlPart(10)
expressionOut.print(it.key)
printHtmlPart(11)
expressionOut.print(it.value)
printHtmlPart(12)
}
printHtmlPart(13)
for( _it1459113115 in (attrs.dynamicConstraints) ) {
changeItVariable(_it1459113115)
printHtmlPart(10)
expressionOut.print(it.key)
printHtmlPart(11)
expressionOut.print(it.value)
printHtmlPart(12)
}
printHtmlPart(14)
expressionOut.print(attrs.onChange)
printHtmlPart(15)
expressionOut.print(g.message(code: attrs.title))
printHtmlPart(16)
expressionOut.print(attrs.width)
printHtmlPart(17)
expressionOut.print(attrs.height)
printHtmlPart(18)
expressionOut.print(attrs.id)
printHtmlPart(19)
expressionOut.print(attrs.id)
printHtmlPart(20)
expressionOut.print(attrs.id)
printHtmlPart(21)
expressionOut.print(attrs.id)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394572572605L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
