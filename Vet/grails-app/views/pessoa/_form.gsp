

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'nome', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="nome">
			<g:message code="pessoa.nome.label" default="Nome" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="nome" required="" value="${pessoaInstance?.nome}"/>
		</div>	
</div>
</div>
<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cpf', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cpf">
			<g:message code="pessoa.cpf.label" default="Cpf" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cpf" required="" value="${pessoaInstance?.cpf}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'rg', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="rg">
			<g:message code="pessoa.rg.label" default="Rg" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:field class="form-control" name="rg" type="number" value="${pessoaInstance.rg}" required=""/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'dataNascimento', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="dataNascimento">
			<g:message code="pessoa.dataNascimento.label" default="Data Nascimento" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:datePicker name="dataNascimento" precision="day"  value="${pessoaInstance?.dataNascimento}"  />
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'userEmail', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="userEmail">
			<g:message code="pessoa.userEmail.label" default="User Email" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" type="email" name="userEmail" required="" value="${pessoaInstance?.userEmail}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'telefone1', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="telefone1">
			<g:message code="pessoa.telefone1.label" default="Telefone1" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="telefone1" maxlength="13" required="" value="${pessoaInstance?.telefone1}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'telefone2', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="telefone2">
			<g:message code="pessoa.telefone2.label" default="Telefone2" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="telefone2" maxlength="13" required="" value="${pessoaInstance?.telefone2}"/>
		</div>
	</div>	
</div>


<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'logradouro', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="logradouro">
			<g:message code="pessoa.logradouro.label" default="Logradouro" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="logradouro" required="" value="${pessoaInstance?.logradouro}"/>
		</div>
	</div>	
</div>


<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'numero', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="numero">
			<g:message code="pessoa.numero.label" default="Numero" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" name="numero" type="number" value="${pessoaInstance.numero}" required=""/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'complemento', 'error')} ">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="complemento">
			<g:message code="pessoa.complemento.label" default="Complemento" />
		
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="complemento" value="${pessoaInstance?.complemento}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'bairro', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="bairro">
			<g:message code="pessoa.bairro.label" default="Bairro" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="bairro" required="" value="${pessoaInstance?.bairro}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cep', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cep">
			<g:message code="pessoa.cep.label" default="CEP" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cep" required="" value="${pessoaInstance?.cep}"/>
		</div>
	</div>	
</div>


<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'cidade', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="cidade">
			<g:message code="pessoa.cidade.label" default="Cidade" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="cidade" required="" value="${pessoaInstance?.cidade}"/>
		</div>
	</div>	
</div>

<div class="fieldcontain ${hasErrors(bean: pessoaInstance, field: 'uf', 'error')} required">
	<div class="form-group">
       	<label class="col-md-3 control-label" for="uf">
			<g:message code="pessoa.uf.label" default="UF" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:textField class="form-control" name="uf" required="" value="${pessoaInstance?.uf}"/>
		</div>
	</div>	
</div>