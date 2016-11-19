
<%@ page import="vet.Agendamento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'agendamento.label', default: 'Agendamento')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-agendamento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-agendamento" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list agendamento">
			
				<g:if test="${agendamentoInstance?.animal}">
				<li class="fieldcontain">
					<span id="animal-label" class="property-label"><g:message code="agendamento.animal.label" default="Animal" /></span>
					
						<span class="property-value" aria-labelledby="animal-label"><g:link controller="animal" action="show" id="${agendamentoInstance?.animal?.id}">${agendamentoInstance?.animal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${agendamentoInstance?.start}">
				<li class="fieldcontain">
					<span id="start-label" class="property-label"><g:message code="agendamento.start.label" default="Start" /></span>
					
						<span class="property-value" aria-labelledby="start-label"><g:formatDate date="${agendamentoInstance?.start}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${agendamentoInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="agendamento.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${agendamentoInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:agendamentoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${agendamentoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
