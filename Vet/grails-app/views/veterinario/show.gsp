
<%@ page import="vet.Veterinario" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'veterinario.label', default: 'Veterinario')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-veterinario" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-veterinario" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list veterinario">
			
				<g:if test="${veterinarioInstance?.userEmail}">
				<li class="fieldcontain">
					<span id="userEmail-label" class="col-md-3 label-show"><g:message code="veterinario.userEmail.label" default="User Email" /></span>
					
						<span class="col-md-4" aria-labelledby="userEmail-label"><g:fieldValue bean="${veterinarioInstance}" field="userEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.telefone1}">
				<li class="fieldcontain">
					<span id="telefone1-label" class="col-md-3 label-show"><g:message code="veterinario.telefone1.label" default="Telefone1" /></span>
					
						<span class="col-md-4" aria-labelledby="telefone1-label"><g:fieldValue bean="${veterinarioInstance}" field="telefone1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.telefone2}">
				<li class="fieldcontain">
					<span id="telefone2-label" class="col-md-3 label-show"><g:message code="veterinario.telefone2.label" default="Telefone2" /></span>
					
						<span class="col-md-4" aria-labelledby="telefone2-label"><g:fieldValue bean="${veterinarioInstance}" field="telefone2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.complemento}">
				<li class="fieldcontain">
					<span id="complemento-label" class="col-md-3 label-show"><g:message code="veterinario.complemento.label" default="Complemento" /></span>
					
						<span class="col-md-4" aria-labelledby="complemento-label"><g:fieldValue bean="${veterinarioInstance}" field="complemento"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.bairro}">
				<li class="fieldcontain">
					<span id="bairro-label" class="col-md-3 label-show"><g:message code="veterinario.bairro.label" default="Bairro" /></span>
					
						<span class="col-md-4" aria-labelledby="bairro-label"><g:fieldValue bean="${veterinarioInstance}" field="bairro"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.cep}">
				<li class="fieldcontain">
					<span id="cep-label" class="col-md-3 label-show"><g:message code="veterinario.cep.label" default="Cep" /></span>
					
						<span class="col-md-4" aria-labelledby="cep-label"><g:fieldValue bean="${veterinarioInstance}" field="cep"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.cidade}">
				<li class="fieldcontain">
					<span id="cidade-label" class="col-md-3 label-show"><g:message code="veterinario.cidade.label" default="Cidade" /></span>
					
						<span class="col-md-4" aria-labelledby="cidade-label"><g:fieldValue bean="${veterinarioInstance}" field="cidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.cpf}">
				<li class="fieldcontain">
					<span id="cpf-label" class="col-md-3 label-show"><g:message code="veterinario.cpf.label" default="Cpf" /></span>
					
						<span class="col-md-4" aria-labelledby="cpf-label"><g:fieldValue bean="${veterinarioInstance}" field="cpf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.crmv}">
				<li class="fieldcontain">
					<span id="crmv-label" class="col-md-3 label-show"><g:message code="veterinario.crmv.label" default="Crmv" /></span>
					
						<span class="col-md-4" aria-labelledby="crmv-label"><g:fieldValue bean="${veterinarioInstance}" field="crmv"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.dataNascimento}">
				<li class="fieldcontain">
					<span id="dataNascimento-label" class="col-md-3 label-show"><g:message code="veterinario.dataNascimento.label" default="Data Nascimento" /></span>
					
						<span class="col-md-4" aria-labelledby="dataNascimento-label"><g:formatDate date="${veterinarioInstance?.dataNascimento}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.logradouro}">
				<li class="fieldcontain">
					<span id="logradouro-label" class="col-md-3 label-show"><g:message code="veterinario.logradouro.label" default="Logradouro" /></span>
					
						<span class="col-md-4" aria-labelledby="logradouro-label"><g:fieldValue bean="${veterinarioInstance}" field="logradouro"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="col-md-3 label-show"><g:message code="veterinario.nome.label" default="Nome" /></span>
					
						<span class="col-md-4" aria-labelledby="nome-label"><g:fieldValue bean="${veterinarioInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.numero}">
				<li class="fieldcontain">
					<span id="numero-label" class="col-md-3 label-show"><g:message code="veterinario.numero.label" default="Numero" /></span>
					
						<span class="col-md-4" aria-labelledby="numero-label"><g:fieldValue bean="${veterinarioInstance}" field="numero"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.rg}">
				<li class="fieldcontain">
					<span id="rg-label" class="col-md-3 label-show"><g:message code="veterinario.rg.label" default="Rg" /></span>
					
						<span class="col-md-4" aria-labelledby="rg-label"><g:fieldValue bean="${veterinarioInstance}" field="rg"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${veterinarioInstance?.uf}">
				<li class="fieldcontain">
					<span id="uf-label" class="col-md-3 label-show"><g:message code="veterinario.uf.label" default="Uf" /></span>
					
						<span class="col-md-4" aria-labelledby="uf-label"><g:fieldValue bean="${veterinarioInstance}" field="uf"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:veterinarioInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${veterinarioInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
