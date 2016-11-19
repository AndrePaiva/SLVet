import org.grails.plugin.easygrid.GridUtils
import  org.grails.plugin.easygrid.JsUtils
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='easygrid', version='1.7.1')
class gsp_easygrid_templates_easygrid_jqGridRenderer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/easygrid-1.7.1/grails-app/views/templates/easygrid/_jqGridRenderer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',3,['var':("gridId"),'value':("${attrs.id}_table")],-1)
printHtmlPart(1)
invokeTag('set','g',4,['var':("pagerId"),'value':("${attrs.id}Pager")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("conf"),'value':(gridConfig.jqgrid)],-1)
printHtmlPart(2)
expressionOut.print(gridId)
printHtmlPart(3)
expressionOut.print(pagerId)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(gridId)
printHtmlPart(6)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}Rows", params: GridUtils.externalParams(gridConfig)))
printHtmlPart(7)
expressionOut.print(pagerId)
printHtmlPart(8)
expressionOut.print(JsUtils.convertToJs(conf - [navGrid: conf.navGrid] - [filterToolbar: conf.filterToolbar], gridId, true))
printHtmlPart(9)
if(true && (gridConfig.subGrid)) {
printHtmlPart(10)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.subGrid}Html"))
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (gridConfig.childGrid)) {
printHtmlPart(13)
expressionOut.print(gridConfig.childGrid)
printHtmlPart(14)
expressionOut.print(gridConfig.childParamName)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (gridConfig.inlineEdit)) {
printHtmlPart(15)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}InlineEdit"))
printHtmlPart(16)
expressionOut.print(g.createLink(controller: attrs.controller, action: "${gridConfig.id}InlineEdit"))
printHtmlPart(17)
expressionOut.print(gridId)
printHtmlPart(11)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
if(true && (col.render)) {
printHtmlPart(20)
expressionOut.print(JsUtils.convertToJs(col.jqgrid + [name: col.name, search: col.enableFilter, label: g.message(code: col.label, default: col.label)], gridId, true))
printHtmlPart(21)
if(true && (col.otherProperties)) {
printHtmlPart(22)
expressionOut.print(col.otherProperties)
printHtmlPart(21)
}
printHtmlPart(23)
}
printHtmlPart(12)
})
invokeTag('eachColumn','grid',37,['gridConfig':(gridConfig)],2)
printHtmlPart(24)
if(true && (gridConfig.otherProperties)) {
printHtmlPart(19)
expressionOut.print(gridConfig.otherProperties.trim())
printHtmlPart(25)
}
printHtmlPart(26)
if(true && (gridConfig.masterGrid)) {
printHtmlPart(27)
expressionOut.print(gridConfig.masterGrid)
printHtmlPart(28)
expressionOut.print(gridId)
printHtmlPart(29)
expressionOut.print(gridConfig.childParamName)
printHtmlPart(30)
}
printHtmlPart(12)
if(true && (gridConfig.enableFilter)) {
printHtmlPart(27)
expressionOut.print(gridId)
printHtmlPart(31)
expressionOut.print(JsUtils.convertToJs(conf.filterToolbar, gridId))
printHtmlPart(32)
}
printHtmlPart(33)
if(true && (gridConfig.addNavGrid)) {
printHtmlPart(27)
expressionOut.print(gridId)
printHtmlPart(34)
expressionOut.print(pagerId)
printHtmlPart(35)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.generalOpts, gridId))
printHtmlPart(36)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.editOpts, gridId))
printHtmlPart(37)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.addOpts, gridId))
printHtmlPart(38)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.delOpts, gridId))
printHtmlPart(39)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.searchOpts, gridId))
printHtmlPart(40)
expressionOut.print(JsUtils.convertToJs(conf.navGrid.viewOpts, gridId))
printHtmlPart(41)
if(true && (gridConfig.addUrl)) {
printHtmlPart(42)
expressionOut.print(pagerId)
printHtmlPart(43)
expressionOut.print(gridConfig.addUrl)
printHtmlPart(44)
}
printHtmlPart(19)
if(true && (gridConfig.addFunction)) {
printHtmlPart(42)
expressionOut.print(pagerId)
printHtmlPart(45)
expressionOut.print(gridConfig.addFunction)
printHtmlPart(46)
}
printHtmlPart(12)
}
printHtmlPart(33)
if(true && (conf.inlineNav)) {
printHtmlPart(27)
expressionOut.print(gridId)
printHtmlPart(47)
expressionOut.print(pagerId)
printHtmlPart(35)
expressionOut.print(JsUtils.convertToJs(conf.inlineNav, gridId))
printHtmlPart(48)
}
printHtmlPart(1)
})
invokeTag('jquery','jq',71,[:],1)
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1423414508605L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
