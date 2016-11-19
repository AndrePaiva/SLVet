
<%@ page import="vet.Veterinario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'veterinario.label', default: 'Veterinario')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-veterinario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-veterinario" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="userEmail" title="${message(code: 'veterinario.userEmail.label', default: 'User Email')}" />
					
						<g:sortableColumn property="telefone1" title="${message(code: 'veterinario.telefone1.label', default: 'Telefone1')}" />
					
						<g:sortableColumn property="telefone2" title="${message(code: 'veterinario.telefone2.label', default: 'Telefone2')}" />
					
						<g:sortableColumn property="complemento" title="${message(code: 'veterinario.complemento.label', default: 'Complemento')}" />
					
						<g:sortableColumn property="bairro" title="${message(code: 'veterinario.bairro.label', default: 'Bairro')}" />
					
						<g:sortableColumn property="cep" title="${message(code: 'veterinario.cep.label', default: 'Cep')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${veterinarioInstanceList}" status="i" var="veterinarioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${veterinarioInstance.id}">${fieldValue(bean: veterinarioInstance, field: "userEmail")}</g:link></td>
					
						<td>${fieldValue(bean: veterinarioInstance, field: "telefone1")}</td>
					
						<td>${fieldValue(bean: veterinarioInstance, field: "telefone2")}</td>
					
						<td>${fieldValue(bean: veterinarioInstance, field: "complemento")}</td>
					
						<td>${fieldValue(bean: veterinarioInstance, field: "bairro")}</td>
					
						<td>${fieldValue(bean: veterinarioInstance, field: "cep")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${veterinarioInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
