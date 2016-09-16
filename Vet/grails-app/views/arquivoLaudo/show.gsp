
<%@ page import="vet.ArquivoLaudo" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'arquivoLaudo.label', default: 'ArquivoLaudo')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-arquivoLaudo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-arquivoLaudo" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list arquivoLaudo">
			
				<g:if test="${arquivoLaudoInstance?.nomeArquivo}">
				<li class="fieldcontain">
					<span id="nomeArquivo-label" class="property-label"><g:message code="arquivoLaudo.nomeArquivo.label" default="Nome Arquivo" /></span>
					
						<span class="property-value" aria-labelledby="nomeArquivo-label"><g:fieldValue bean="${arquivoLaudoInstance}" field="nomeArquivo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${arquivoLaudoInstance?.uploadData}">
				<li class="fieldcontain">
					<span id="uploadData-label" class="property-label"><g:message code="arquivoLaudo.uploadData.label" default="Upload Data" /></span>
					
						<span class="property-value" aria-labelledby="uploadData-label"><g:formatDate date="${arquivoLaudoInstance?.uploadData}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${arquivoLaudoInstance?.arquivo}">
				<li class="fieldcontain">
					<span id="arquivo-label" class="property-label"><g:message code="arquivoLaudo.arquivo.label" default="Arquivo" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:arquivoLaudoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${arquivoLaudoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
