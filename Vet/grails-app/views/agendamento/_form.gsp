<%@ page import="vet.Agendamento" %>



<div class="fieldcontain ${hasErrors(bean: agendamentoInstance, field: 'animal', 'error')} required">
	<div class="form-group">
        <label class="col-md-3 control-label" for="animal">
			<g:message code="agendamento.animal.label" default="Animal" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:select id="animal" 
					  name="animal.id" 
					  from="${vet.Animal.list()}" 
					  optionKey="id" 
					  required="" 
					  value="${agendamentoInstance?.animal?.id}" 
					  class="form-control"/>
		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: agendamentoInstance, field: 'start', 'error')} required">
	<div class="form-group">
        <label class="col-md-5 control-label" for="start">
			<g:message code="agendamento.start.label" default="Data Inicio" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-6">	
			<g:datePicker name="start" precision="hour"  value="${agendamentoInstance?.start}"  />
		</div>
	</div>
</div>

<%--
<div class="fieldcontain ${hasErrors(bean: agendamentoInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="agendamento.title.label" default="Titulo Evento" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${agendamentoInstance?.title}"/>

</div>

 --%>