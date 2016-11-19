
<%@page import="vet.Animal"%>
<%@page import="vet.Veterinario"%>

<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'animal', 'error')} required">
	<div class="form-group">
        <label class="col-md-3 control-label" for="animal">
			<g:message code="laudo.animal.label" default="Animal" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:select id="animal" 
					  name="animal.id" 
					  from="${Animal.list()}" 
					  optionKey="id" 
					  required="" 
					  value="${laudoInstance?.animal?.id}" 
					  class="form-control"/>
		</div>
	</div>
</div>
<%-- 
<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'arquivo', 'error')} required">
	<label for="arquivo">
		<g:message code="laudo.arquivo.label" default="Arquivo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="arquivo" name="arquivo.id" from="${vet.ArquivoLaudo.list()}" optionKey="id" required="" value="${laudoInstance?.arquivo?.id}" class="many-to-one"/>

</div>
--%>
<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'data', 'error')} required">
	<div class="form-group">
        <label class="col-md-5 control-label" for="data">
			<g:message code="laudo.data.label" default="Data" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-6">	
			<g:datePicker name="data" precision="day"  value="${laudoInstance?.data}"  />

		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'veterinario', 'error')} required">
	<div class="form-group">
        <label class="col-md-5 control-label" for="veterinario">
			<g:message code="laudo.veterinario.label" default="Veterinario" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-4">	
			<g:select id="veterinario" 
					  name="veterinario.id" 
					  from="${Veterinario.list()}" 
					  optionKey="id" 
					  required="" 
					  value="${laudoInstance?.veterinario?.id}" 
					  class="form-control"/>

		</div>
	</div>
</div>

<div class="fieldcontain ${hasErrors(bean: laudoInstance, field: 'arquivo.arquivo', 'error')} required">
	<div class="form-group">
        <label class="col-md-5 control-label" for="arquivo">
			<g:message code="arquivoLaudo.arquivo.label" default="Arquivo" />
			<span class="required-indicator">*</span>
		</label>
		<div class="col-md-6">
			<input class="fileinput" type="file" id="arquivo" name="arquivo.arquivo" />

		</div>
	</div>
</div>

