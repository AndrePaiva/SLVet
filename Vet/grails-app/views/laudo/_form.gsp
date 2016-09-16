



<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'arquivo', 'error')} required">
	<label for="arquivo">
		<g:message code="laudo.arquivo.label" default="Arquivo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="arquivo" required="" value="${laudoInstance?.arquivo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'data', 'error')} required">
	<label for="data">
		<g:message code="laudo.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="day"  value="${laudoInstance?.data}"  />

</div>

