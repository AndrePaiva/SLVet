<%@page import="vet.Pessoa"%>



<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'cliente', 'error')} required">
	<div class="form-group">
              <label class="col-md-3 control-label" for="cliente"> 
			<g:message code="animal.cliente.label" default="Cliente" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			
			<g:select id="cliente" 
					  name="cliente.id" 
					  from="${Pessoa.list()}" 
					  optionKey="id" 
					  required="" 
					  value="${animalInstance?.cliente?.nome}" 
					  class="form-control select"/>
	
		</div>
	</div>			
</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'especie', 'error')} required">
	<div class="form-group">
              <label class="col-md-5 control-label" for="especie">
			<g:message code="animal.especie.label" default="Especie" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:textField class="form-control" name="especie" required="" value="${animalInstance?.especie}"/>
		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'nome', 'error')} required">
	<div class="form-group">
              <label class="col-md-5 control-label" for="nome">
			<g:message code="animal.nome.label" default="Nome" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:textField class="form-control" name="nome" required="" value="${animalInstance?.nome}"/>
		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'peso', 'error')} required">
	<div class="form-group">
              <label class="col-md-5 control-label" for="peso">
			<g:message code="animal.peso.label" default="Peso" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" name="peso" type="decimal" value="${fieldValue(bean: animalInstance, field: 'peso')}" required=""/>
		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'raca', 'error')} required">
	<div class="form-group">
              <label class="col-md-5 control-label" for="raca">
			<g:message code="animal.raca.label" default="Raca" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:textField class="form-control" name="raca" required="" value="${animalInstance?.raca}"/>
		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'tamanho', 'error')} required">
	<div class="form-group">
        <label class="col-md-5 control-label" for="tamanho">
			<g:message code="animal.tamanho.label" default="Tamanho" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">
			<g:field class="form-control" name="tamanho" type="decimal" value="${fieldValue(bean: animalInstance, field: 'tamanho')}" required=""/>
		</div>
	</div>
</div>

	
