<%@ page import="vet.ArquivoLaudo" %>



<%--<div class="fieldcontain ${hasErrors(bean: arquivoLaudoInstance, field: 'nomeArquivo', 'error')} required">
	<label for="nomeArquivo">
		<g:message code="arquivoLaudo.nomeArquivo.label" default="Nome Arquivo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeArquivo" required="" value="${arquivoLaudoInstance?.nomeArquivo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: arquivoLaudoInstance, field: 'uploadData', 'error')} ">
	<label for="uploadData">
		<g:message code="arquivoLaudo.uploadData.label" default="Upload Data" />
		
	</label>
	<g:datePicker name="uploadData" precision="day"  value="${arquivoLaudoInstance?.uploadData}" default="none" noSelection="['': '']" />

</div> --%>

<div class="fieldcontain ${hasErrors(bean: arquivoLaudoInstance, field: 'arquivo', 'error')} required">
	<label for="arquivo">
		<g:message code="arquivoLaudo.arquivo.label" default="Arquivo" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="arquivo" name="arquivo" />

</div>

