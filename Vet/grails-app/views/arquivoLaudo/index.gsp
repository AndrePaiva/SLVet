
<%@ page import="vet.ArquivoLaudo" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'arquivoLaudo.label', default: 'ArquivoLaudo')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-arquivoLaudo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-arquivoLaudo" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nomeArquivo" title="${message(code: 'arquivoLaudo.nomeArquivo.label', default: 'Nome Arquivo')}" />
					
						<g:sortableColumn property="uploadData" title="${message(code: 'arquivoLaudo.uploadData.label', default: 'Upload Data')}" />
					
						<g:sortableColumn property="arquivo" title="${message(code: 'arquivoLaudo.arquivo.label', default: 'Arquivo')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${arquivoLaudoInstanceList}" status="i" var="arquivoLaudoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="download" id="${arquivoLaudoInstance.id}">${fieldValue(bean: arquivoLaudoInstance, field: "nomeArquivo")}</g:link></td>
					
						<td><g:formatDate date="${arquivoLaudoInstance.uploadData}" /></td>
					
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${arquivoLaudoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
