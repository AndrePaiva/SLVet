

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'laudo.label', default: 'Laudo')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<r:require modules="easygrid-jqgrid-dev,export"/>
		<asset:javascript src="easygrid.jqgrid.js"/>
	    <asset:stylesheet src="easygrid.jqgrid.css"/>
	    <asset:stylesheet src="export.css"/>
	     <link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.css')}" type="text/css">
	     <g:javascript src="bootstrap.js" />
	      <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
	</head>
	<body>
		<a href="#list-laudo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-laudo" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="laudo.animal.label" default="Animal" /></th>
					
						<th><g:message code="laudo.arquivo.label" default="Arquivo" /></th>
					
						<g:sortableColumn property="data" title="${message(code: 'laudo.data.label', default: 'Data')}" />
					
						<th><g:message code="laudo.veterinario.label" default="Veterinario" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${laudoInstanceList}" status="i" var="laudoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${laudoInstance.id}">${fieldValue(bean: laudoInstance, field: "animal")}</g:link></td>
					
						<td><g:link controller="arquivoLaudo"  action="download" id="${laudoInstance.arquivo.id}">${fieldValue(bean: laudoInstance, field: "arquivo")}</g:link></td>
					
						<td><g:formatDate date="${laudoInstance.data}" /></td>
					
						<td>${fieldValue(bean: laudoInstance, field: "veterinario")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${laudoInstanceCount ?: 0}" />
			</div>
			
			<!-- <grid:grid name="laudo" controller="laudo" >
				<grid:set width="960" height="300" align="center"/>
				<grid:set col="animal" align="center" width="210" />
				<grid:set col="veterinario" align="center" width="150" />
				<grid:set col="data" align="center" width="150"/>
				<grid:set col="arquivo" align="center" width="150" formatter="f:customShowFormat" />
			</grid:grid>
			<grid:exportButton name="laudo"/>-->
		
			<script>
			function customShowFormat(cellvalue, options, rowObject){
        		return "<a href='${g.createLink(controller: "arquivoLaudo", action: "download")}/" + rowObject[5] + "'>" + rowObject[4] + "</a> ";
   			 }
			</script>
		</div>
	</body>
</html>
