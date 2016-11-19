import org.grails.plugin.easygrid.JsUtils
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_templates_easygrid_visualizationGridRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/templates/easygrid/_visualizationGridRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(attrs.id)
printHtmlPart(2)
expressionOut.print(JsUtils.convertToJs(gridConfig.visualization, "${attrs.id}_div"))
printHtmlPart(3)
expressionOut.print(g.createLink(action: "${gridConfig.id}Rows"))
printHtmlPart(4)
expressionOut.print(gridConfig.visualization.loadAllData ? 'true' : 'false')
printHtmlPart(5)
expressionOut.print(attrs.id)
printHtmlPart(6)
})
invokeTag('jquery','jq',14,[:],1)
printHtmlPart(7)
expressionOut.print(attrs.id)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498489394L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
