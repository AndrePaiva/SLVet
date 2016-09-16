



<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'userEmail', 'error')} required">
	<label for="userEmail">
		<g:message code="pessoa.userEmail.label" default="User Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="userEmail" required="" value="${pessoaInstance?.userEmail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'telefone1', 'error')} required">
	<label for="telefone1">
		<g:message code="pessoa.telefone1.label" default="Telefone1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone1" maxlength="13" required="" value="${pessoaInstance?.telefone1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'telefone2', 'error')} required">
	<label for="telefone2">
		<g:message code="pessoa.telefone2.label" default="Telefone2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone2" maxlength="13" required="" value="${pessoaInstance?.telefone2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'complemento', 'error')} ">
	<label for="complemento">
		<g:message code="pessoa.complemento.label" default="Complemento" />
		
	</label>
	<g:textField name="complemento" value="${pessoaInstance?.complemento}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'bairro', 'error')} required">
	<label for="bairro">
		<g:message code="pessoa.bairro.label" default="Bairro" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bairro" required="" value="${pessoaInstance?.bairro}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cep', 'error')} required">
	<label for="cep">
		<g:message code="pessoa.cep.label" default="Cep" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cep" required="" value="${pessoaInstance?.cep}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cidade', 'error')} required">
	<label for="cidade">
		<g:message code="pessoa.cidade.label" default="Cidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cidade" required="" value="${pessoaInstance?.cidade}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="pessoa.cpf.label" default="Cpf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${pessoaInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'dataNascimento', 'error')} required">
	<label for="dataNascimento">
		<g:message code="pessoa.dataNascimento.label" default="Data Nascimento" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dataNascimento" precision="day"  value="${pessoaInstance?.dataNascimento}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'logradouro', 'error')} required">
	<label for="logradouro">
		<g:message code="pessoa.logradouro.label" default="Logradouro" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="logradouro" required="" value="${pessoaInstance?.logradouro}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="pessoa.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${pessoaInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'numero', 'error')} required">
	<label for="numero">
		<g:message code="pessoa.numero.label" default="Numero" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numero" type="number" value="${pessoaInstance.numero}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'rg', 'error')} required">
	<label for="rg">
		<g:message code="pessoa.rg.label" default="Rg" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rg" type="number" value="${pessoaInstance.rg}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'uf', 'error')} required">
	<label for="uf">
		<g:message code="pessoa.uf.label" default="Uf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="uf" required="" value="${pessoaInstance?.uf}"/>

</div>

