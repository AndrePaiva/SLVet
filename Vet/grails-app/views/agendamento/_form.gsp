

<div class="fieldcontain ${hasErrors(bean: agendamentoInstance, field: 'cliente', 'error')} required">
	<label for="cliente">
		<g:message code="agendamento.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${Pessoa.list()}" optionKey="id" required="" value="${agendamentoInstance?.cliente?.nome}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: agendamentoInstance, field: 'data', 'error')} required">
	<label for="data">
		<g:message code="agendamento.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="day"  value="${agendamentoInstance?.data}"  />

</div>

