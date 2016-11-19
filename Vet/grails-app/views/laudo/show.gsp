

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'laudo.label', default: 'Laudo')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-laudo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-laudo" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list laudo">
			
				<g:if test="${laudoInstance?.animal}">
				<li class="fieldcontain">
					<span id="animal-label" class="col-md-3 label-show"><g:message code="laudo.animal.label" default="Animal" /></span>
					
						<span class="col-md-4" aria-labelledby="animal-label"><g:link controller="animal" action="show" id="${laudoInstance?.animal?.id}">${laudoInstance?.animal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${laudoInstance?.arquivo}">
				<li class="fieldcontain">
					<span id="arquivo-label" class="col-md-3 label-show"><g:message code="laudo.arquivo.label" default="Arquivo" /></span>
					
						<span class="col-md-4" aria-labelledby="arquivo-label"><g:link controller="arquivoLaudo" action="show" id="${laudoInstance?.arquivo?.id}">${laudoInstance?.arquivo?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${laudoInstance?.data}">
				<li class="fieldcontain">
					<span id="data-label" class="col-md-3 label-show"><g:message code="laudo.data.label" default="Data" /></span>
					
						<span class="col-md-4" aria-labelledby="data-label"><g:formatDate date="${laudoInstance?.data}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${laudoInstance?.veterinario}">
				<li class="fieldcontain">
					<span id="veterinario-label" class="col-md-3 label-show"><g:message code="laudo.veterinario.label" default="Veterinario" /></span>
					
						<span class="col-md-4" aria-labelledby="veterinario-label"><g:link controller="veterinario" action="show" id="${laudoInstance?.veterinario?.id}">${laudoInstance?.veterinario?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:laudoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${laudoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
