
<%@ page import="vet.Agendamento" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'agendamento.label', default: 'Agendamento')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<link rel='stylesheet' href='${request.contextPath}/fullcalendar/fullcalendar.css' />
		<link rel='stylesheet' href='${request.contextPath}/fullcalendar/lib/cupertino/jquery-ui.min.css' />
		<script src='${request.contextPath}/fullcalendar/lib/jquery-ui.min.js'></script>
		
		<script src='${request.contextPath}/fullcalendar/lib/moment.min.js'></script>
		<script src='${request.contextPath}/fullcalendar/fullcalendar.js'></script>
		<script src='${request.contextPath}/fullcalendar/locale/pt-br.js'></script>                                    
	</head>
	<body>
		<a href="#list-agendamento" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-agendamento" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			
			<div id="calendar"></div>
		
			<script>
				$(document).ready(function() {
				    $('#calendar').fullCalendar({
				    	header: {
				            left: '',
				            center: 'prev title next',
				            right: 'month,agendaWeek,agendaDay'
				        },
			      	eventSources: {url: "${g.createLink(controller:'agendamento', action: 'jsonEvent')}"},
			        editable: true,
			        droppable: true,
			        selectable: true,
			        selectHelper: true,
			        timeFormat: 'H(:mm)',
			        defaultTimedEventDuration: '00:30:00',
			        businessHours :{start: 8, end: 18, limitDisplay: true }
			        <%--events: [
			                 {
			                     title: 'Sistema',
			                     start: '2016-10-28'
			                 },
			                 {
			                     title: 'Teste',
			                     start: '2016-10-25'
			                 }             ]--%>
				   
			        });
				});
			</script>
			
			
		</div>
	</body>
</html>