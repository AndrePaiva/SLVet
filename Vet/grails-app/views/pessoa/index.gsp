

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pessoa.label', default: 'Pessoa')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pessoa" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pessoa" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="userEmail" title="${message(code: 'pessoa.userEmail.label', default: 'User Email')}" />
					
						<g:sortableColumn property="telefone1" title="${message(code: 'pessoa.telefone1.label', default: 'Telefone1')}" />
					
						<g:sortableColumn property="telefone2" title="${message(code: 'pessoa.telefone2.label', default: 'Telefone2')}" />
					
						<g:sortableColumn property="complemento" title="${message(code: 'pessoa.complemento.label', default: 'Complemento')}" />
					
						<g:sortableColumn property="bairro" title="${message(code: 'pessoa.bairro.label', default: 'Bairro')}" />
					
						<g:sortableColumn property="cep" title="${message(code: 'pessoa.cep.label', default: 'Cep')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pessoaInstanceList}" status="i" var="pessoaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pessoaInstance.id}">${fieldValue(bean: pessoaInstance, field: "userEmail")}</g:link></td>
					
						<td>${fieldValue(bean: pessoaInstance, field: "telefone1")}</td>
					
						<td>${fieldValue(bean: pessoaInstance, field: "telefone2")}</td>
					
						<td>${fieldValue(bean: pessoaInstance, field: "complemento")}</td>
					
						<td>${fieldValue(bean: pessoaInstance, field: "bairro")}</td>
					
						<td>${fieldValue(bean: pessoaInstance, field: "cep")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pessoaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
