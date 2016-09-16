


<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'veterinario', 'error')} required">
	<label for="veterinario">
		<g:message code="veterinario.veterinario.label" default="Veterinario" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="veterinario" name="veterinario.id" from="${Pessoa.list()}" optionKey="id" required="" value="${veterinarioInstance?.veterinario?.nome}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: veterinarioInstance, field: 'crmv', 'error')} required">
	<label for="crmv">
		<g:message code="veterinario.crmv.label" default="Crmv" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="crmv" required="" value="${veterinarioInstance?.crmv}"/>

</div>

