



<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="animal.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${Pessoa.list()}" optionKey="id" required="" value="${animalInstance?.cliente?.nome}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'especie', 'error')} required">
	<label for="especie">
		<g:message code="animal.especie.label" default="Especie" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="especie" required="" value="${animalInstance?.especie}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="animal.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${animalInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'peso', 'error')} required">
	<label for="peso">
		<g:message code="animal.peso.label" default="Peso" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="peso" value="${fieldValue(bean: animalInstance, field: 'peso')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'raca', 'error')} required">
	<label for="raca">
		<g:message code="animal.raca.label" default="Raca" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="raca" required="" value="${animalInstance?.raca}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: animalInstance, field: 'tamanho', 'error')} required">
	<label for="tamanho">
		<g:message code="animal.tamanho.label" default="Tamanho" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="tamanho" value="${fieldValue(bean: animalInstance, field: 'tamanho')}" required=""/>

</div>

