<%@ page import="vet.Veterinario" %>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'userEmail', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="userEmail">
			<g:message code="veterinario.userEmail.label" default="User Email" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" type="email" name="userEmail" required="" value="${veterinarioInstance?.userEmail}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'telefone1', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="telefone1">
			<g:message code="veterinario.telefone1.label" default="Telefone1" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="telefone1" maxlength="13" required="" value="${veterinarioInstance?.telefone1}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'telefone2', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="telefone2">
			<g:message code="veterinario.telefone2.label" default="Telefone2" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="telefone2" maxlength="13" required="" value="${veterinarioInstance?.telefone2}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'complemento', 'error')} ">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="complemento">
			<g:message code="veterinario.complemento.label" default="Complemento" />
			
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="complemento" value="${veterinarioInstance?.complemento}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'bairro', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="bairro">
			<g:message code="veterinario.bairro.label" default="Bairro" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="bairro" required="" value="${veterinarioInstance?.bairro}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'cep', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cep">
			<g:message code="veterinario.cep.label" default="Cep" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cep" required="" value="${veterinarioInstance?.cep}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'cidade', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cidade">
			<g:message code="veterinario.cidade.label" default="Cidade" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cidade" required="" value="${veterinarioInstance?.cidade}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'cpf', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cpf">
			<g:message code="veterinario.cpf.label" default="Cpf" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cpf" required="" value="${veterinarioInstance?.cpf}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'crmv', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="crmv">
			<g:message code="veterinario.crmv.label" default="Crmv" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="crmv" required="" value="${veterinarioInstance?.crmv}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'dataNascimento', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="dataNascimento">
			<g:message code="veterinario.dataNascimento.label" default="Data Nascimento" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:datePicker name="dataNascimento" precision="day"  value="${veterinarioInstance?.dataNascimento}"  />
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'logradouro', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="logradouro">
			<g:message code="veterinario.logradouro.label" default="Logradouro" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="logradouro" required="" value="${veterinarioInstance?.logradouro}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'nome', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="nome">
			<g:message code="veterinario.nome.label" default="Nome" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="nome" required="" value="${veterinarioInstance?.nome}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'numero', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="numero">
			<g:message code="veterinario.numero.label" default="Numero" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" name="numero" type="number" value="${veterinarioInstance.numero}" required=""/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'rg', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="rg">
			<g:message code="veterinario.rg.label" default="Rg" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" name="rg" type="number" value="${veterinarioInstance.rg}" required=""/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'uf', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="uf">
			<g:message code="veterinario.uf.label" default="Uf" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="uf" required="" value="${veterinarioInstance?.uf}"/>
		</div>
	</div>	
</div>

