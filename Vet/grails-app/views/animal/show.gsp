

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'animal.label', default: 'Animal')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-animal" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-animal" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list animal">
			
				<g:if test="${animalInstance?.cliente}">
				<li class="fieldcontain">
					<span id="cliente-label" class="col-md-3 label-show"><g:message code="animal.cliente.label" default="Cliente" /></span>
					
					
						<span class="col-md-4" aria-labelledby="cliente-label"><g:link controller="pessoa" action="show" id="${animalInstance?.cliente?.id}">${animalInstance?.cliente?.encodeAsHTML()}</g:link></span>

				</li>
				</g:if>
			
				<g:if test="${animalInstance?.especie}">
				<li class="fieldcontain">
					<span id="especie-label" class="col-md-3 label-show"><g:message code="animal.especie.label" default="Especie" /></span>
					
						<span class="col-md-4" aria-labelledby="especie-label"><g:fieldValue bean="${animalInstance}" field="especie"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${animalInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="col-md-3 label-show"><g:message code="animal.nome.label" default="Nome" /></span>
					
						<span class="col-md-4" aria-labelledby="nome-label"><g:fieldValue bean="${animalInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${animalInstance?.peso}">
				<li class="fieldcontain">
					<span id="peso-label" class="col-md-3 label-show"><g:message code="animal.peso.label" default="Peso" /></span>
					
						<span class="col-md-4" aria-labelledby="peso-label"><g:fieldValue bean="${animalInstance}" field="peso"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${animalInstance?.raca}">
				<li class="fieldcontain">
					<span id="raca-label" class="col-md-3 label-show"><g:message code="animal.raca.label" default="Raca" /></span>
					
						<span class="col-md-4" aria-labelledby="raca-label"><g:fieldValue bean="${animalInstance}" field="raca"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${animalInstance?.tamanho}">
				<li class="fieldcontain">
					<span id="tamanho-label" class="col-md-3 label-show"><g:message code="animal.tamanho.label" default="Tamanho" /></span>
					
						<span class="col-md-4" aria-labelledby="tamanho-label"><g:fieldValue bean="${animalInstance}" field="tamanho"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:animalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${animalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
