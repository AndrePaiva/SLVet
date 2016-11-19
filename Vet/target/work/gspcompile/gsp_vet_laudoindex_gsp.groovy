import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_vet_laudoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/laudo/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'laudo.label', default: 'Laudo'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('require','r',9,['modules':("easygrid-jqgrid-dev,export")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',10,['src':("easygrid.jqgrid.js")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',11,['src':("easygrid.jqgrid.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',12,['src':("export.css")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.css'))
printHtmlPart(4)
invokeTag('javascript','g',14,['src':("bootstrap.js")],-1)
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('message','g',18,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',21,['code':("default.home.label")],-1)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',22,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',22,['class':("create"),'action':("create")],2)
printHtmlPart(12)
invokeTag('message','g',26,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',34,['code':("laudo.animal.label"),'default':("Animal")],-1)
printHtmlPart(17)
invokeTag('message','g',36,['code':("laudo.arquivo.label"),'default':("Arquivo")],-1)
printHtmlPart(18)
invokeTag('sortableColumn','g',38,['property':("data"),'title':(message(code: 'laudo.data.label', default: 'Data'))],-1)
printHtmlPart(19)
invokeTag('message','g',40,['code':("laudo.veterinario.label"),'default':("Veterinario")],-1)
printHtmlPart(20)
loop:{
int i = 0
for( laudoInstance in (laudoInstanceList) ) {
printHtmlPart(21)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(22)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: laudoInstance, field: "animal"))
})
invokeTag('link','g',48,['action':("show"),'id':(laudoInstance.id)],3)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: laudoInstance, field: "arquivo"))
})
invokeTag('link','g',50,['controller':("arquivoLaudo"),'action':("download"),'id':(laudoInstance.arquivo.id)],3)
printHtmlPart(23)
invokeTag('formatDate','g',52,['date':(laudoInstance.data)],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: laudoInstance, field: "veterinario"))
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('paginate','g',61,['total':(laudoInstanceCount ?: 0)],-1)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('set','grid',65,['width':("960"),'height':("300"),'align':("center")],-1)
printHtmlPart(27)
invokeTag('set','grid',66,['col':("animal"),'align':("center"),'width':("210")],-1)
printHtmlPart(27)
invokeTag('set','grid',67,['col':("veterinario"),'align':("center"),'width':("150")],-1)
printHtmlPart(27)
invokeTag('set','grid',68,['col':("data"),'align':("center"),'width':("150")],-1)
printHtmlPart(27)
invokeTag('set','grid',69,['col':("arquivo"),'align':("center"),'width':("150"),'formatter':("f:customShowFormat")],-1)
printHtmlPart(28)
})
invokeTag('grid','grid',70,['name':("laudo"),'controller':("laudo")],2)
printHtmlPart(28)
invokeTag('exportButton','grid',71,['name':("laudo")],-1)
printHtmlPart(29)
expressionOut.print(g.createLink(controller: "arquivoLaudo", action: "download"))
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479498488733L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
