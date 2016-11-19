<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
		<link rel="icon" href="${request.contextPath}/joli/favicon.ico" type="image/x-icon" />
        <!-- END META SECTION -->
        
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="${request.contextPath}/joli/css/theme-default.css"/>
        <!-- EOF CSS INCLUDE --> 
        <asset:stylesheet src="application.css"/>
		<asset:javascript src="application.js"/>
		<g:layoutHead/>
	</head>
	<body>
		 <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!-- START PAGE SIDEBAR -->
            <div class="page-sidebar">
                <!-- START X-NAVIGATION -->
                <ul class="x-navigation">
                    <li class="xn-logo">
                        <a href="#">SLVet</a>
                        <a href="#" class="x-navigation-control"></a>
                    </li> 
                     <li class="xn-profile">
                        <a href="#" class="profile-mini">
                            <img src="${request.contextPath}/images/logoVetEditado1.jpg" alt="SLVet"/>
                        </a>
                        <div class="profile">
                            <div class="profile-image">
                                <img src="${request.contextPath}/images/logoVetEditado1.jpg" alt="SLVet"/>
                            </div>
                            <div class="profile-data">
                                <div class="profile-data-name">SLVet</div>
                                <div class="profile-data-title">Sistema de Laudo Veterinário</div>
                            </div>
                        </div>
                    </li>    
                    <li class="xn-title">Navigation</li>
                    <li class="xn-openable">
                        <a href="index.html"><span class="glyphicon glyphicon-list"></span> <span class="xn-text">Cadastros</span></a>
                    	<ul>
	                   		<li class="xn-openable">
                        		<a href="#"><span class="fa fa-github-square"></span> <span class="xn-text">Animal</span></a>
                    			<ul>	
		                   			<li>
		                   				<g:link controller="animal" action="create"><span class="fa fa-edit"></span> <span class="xn-text">Novo Animal</span></g:link>  		
				                   	</li>
				                   	<li>
				                   		<g:link controller="animal" action="index"><span class="fa fa-list"></span><span class="xn-text">Listar Animais</span></g:link>
				                   	</li>
			                   </ul>
			               <li class="xn-openable">
                           	   <a href="#"><span class="fa fa-user"></span><span class="xn-text">Pessoa</span></a>
                    		   <ul>
				               	    <li>
		                   				<g:link controller="pessoa" action="create"><span class="fa fa-edit"></span> <span class="xn-text">Nova Pessoa</span></g:link>  		
				                   	</li>
				                   	<li>
		                   				<g:link controller="pessoa" action="index"><span class="fa fa-list"></span> <span class="xn-text">Listar Pessoas</span></g:link>  		
				                   	</li>
				               </ul>				                   
		                   <li class="xn-openable">
                        		<a href="#"><span class="fa fa-user-md"></span> <span class="xn-text">Veterinário</span></a>
                    			<ul>
                    				<li>
		                   				<g:link controller="veterinario" action="create"><span class="fa fa-edit"></span><span class="xn-text">Novo Veterinário</span></g:link>  		
				                  	</li>
				               		<li>
		                   				<g:link controller="veterinario" action="index"><span class="fa fa-list"></span><span class="xn-text">Listar Veterinários</span></g:link>  		
				                    </li>
				               </ul>            
                    	</ul>
                    </li>
                    <li>
                    	<g:link controller="agendamento" action="create"><span class="fa fa-book"></span> <span class="xn-text">Agendamento</span></g:link>
                    </li>
                    <li>	
                    	<g:link controller="agendamento" action="index"><span class="fa fa-calendar"></span> <span class="xn-text">Calendário</span></g:link> 	
                    </li>               
                    
                    <li>
                        <g:link controller="laudo" action="create"><span class="fa fa-paste"></span> <span class="xn-text">Novo Laudo</span></g:link>
                    </li>
                            
                </ul>
                <!-- END X-NAVIGATION -->
            </div>
            <!-- END PAGE SIDEBAR -->
           
            <!-- PAGE CONTENT -->
            <div class="page-content">
                          
                <!-- START X-NAVIGATION VERTICAL -->
                <ul class="x-navigation x-navigation-horizontal x-navigation-panel"/>
                    <!-- TOGGLE NAVIGATION -->
                	
                    	
                    <li class="xn-icon-button">
                        <a href="#" class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>                   	
                    </li>
                    <!-- END TOGGLE NAVIGATION -->
                    <!-- SEARCH -->
                    <li class="xn-search">
                        <form role="form">
                            <input type="text" name="search" placeholder="Search..."/>
                        </form>
                    </li>   
                    <!-- END SEARCH -->
                    <!-- SIGN OUT -->
                    <li class="xn-icon-button pull-right">
                        <g:link class="mb-control" data-box="#mb-signout"><span class="fa fa-sign-out"></span></g:link>                        
                    </li> 
                    <!-- END SIGN OUT -->
                    <!-- MESSAGES -->
                    
                    <li class="xn-icon-button pull-right">
                       	<a href="#"><span class="fa fa-comments"></span></a>
                        <div class="informer informer-danger">4</div>
                        	<div class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
                            	<div class="panel-heading">
                                	<h3 class="panel-title"><span class="fa fa-comments"></span> Messages</h3>                                
                                	<div class="pull-right">
                                    	<span class="label label-danger">4 new</span>
                                	</div>
                            	</div>
                           	 	<div class="panel-body list-group list-group-contacts scroll" style="height: 200px;">
                                	<a href="#" class="list-group-item">
                                    	<div class="list-group-status status-online"></div>
                                    	<img src="assets/images/users/user2.jpg" class="pull-left" alt="John Doe"/>
                                    	<span class="contacts-title">John Doe</span>
                                    	<p>Praesent placerat tellus id augue condimentum</p>
                                	</a>
                                	<a href="#" class="list-group-item">
                                    	<div class="list-group-status status-away"></div>
                                    	<img src="assets/images/users/user.jpg" class="pull-left" alt="Dmitry Ivaniuk"/>
                                    	<span class="contacts-title">Dmitry Ivaniuk</span>
                                    	<p>Donec risus sapien, sagittis et magna quis</p>
                                	</a>
                                	<a href="#" class="list-group-item">
                                    	<div class="list-group-status status-away"></div>
                                    	<img src="assets/images/users/user3.jpg" class="pull-left" alt="Nadia Ali"/>
                                    	<span class="contacts-title">Nadia Ali</span>
                                    	<p>Mauris vel eros ut nunc rhoncus cursus sed</p>
                                	</a>
                                	<a href="#" class="list-group-item">
                                    	<div class="list-group-status status-offline"></div>
                                    	<img src="assets/images/users/user6.jpg" class="pull-left" alt="Darth Vader"/>
                                    	<span class="contacts-title">Darth Vader</span>
                                    	<p>I want my money back!</p>
                                	</a>
                            	</div>     
                            	<div class="panel-footer text-center">
                                	<a href="pages-messages.html">Show all messages</a>
                            	</div>                            
                       	 	</div>                        
                    		
                    	</li>
	                    <!-- END MESSAGES -->
	                    <!-- TASKS -->
	                    <li class="xn-icon-button pull-right">
                        	<a href="#"><span class="fa fa-tasks"></span></a>
                        	<div class="informer informer-warning">3</div>
                        		<div class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
                           			<div class="panel-heading">
                               			<h3 class="panel-title"><span class="fa fa-tasks"></span> Tasks</h3>                                
                                		<div class="pull-right">
                                    		<span class="label label-warning">3 active</span>
                                		</div>
                            		</div>
                            	<div class="panel-body list-group scroll" style="height: 200px;">                                
                                	<a class="list-group-item" href="#">
                                    	<strong>Phasellus augue arcu, elementum</strong>
                                    	<div class="progress progress-small progress-striped active">
                                        	<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">50%</div>
                                    	</div>
                                    	<small class="text-muted">John Doe, 25 Sep 2014 / 50%</small>
                                	</a>
                                	<a class="list-group-item" href="#">
                                    	<strong>Aenean ac cursus</strong>
                                    	<div class="progress progress-small progress-striped active">
                                        	<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">80%</div>
                                    	</div>
                                    	<small class="text-muted">Dmitry Ivaniuk, 24 Sep 2014 / 80%</small>
                                	</a>
                                	<a class="list-group-item" href="#">
                                    	<strong>Lorem ipsum dolor</strong>
                                    	<div class="progress progress-small progress-striped active">
                                        	<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100" style="width: 95%;">95%</div>
                                    	</div>
                                    	<small class="text-muted">John Doe, 23 Sep 2014 / 95%</small>
                                	</a>
                                	<a class="list-group-item" href="#">
                                    	<strong>Cras suscipit ac quam at tincidunt.</strong>
                                    	<div class="progress progress-small">
                                       		<div class="progress-bar" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">100%</div>
                                    	</div>
                                    	<small class="text-muted">John Doe, 21 Sep 2014 /</small><small class="text-success"> Done</small>
                                	</a>                                
                            	</div>     
                            	<div class="panel-footer text-center">
                                	<a href="pages-tasks.html">Show all tasks</a>
                            	</div>                            
                        	</div>                        
                    	</li>
                   	
                    <!-- END TASKS -->
                </ul>
                <!-- END X-NAVIGATION VERTICAL -->                     

                                      
                
                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                    
                    <g:layoutBody/>
                   
                </div>
                <!-- END PAGE CONTENT WRAPPER -->                                
            </div>            
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->

        <!-- MESSAGE BOX-->
        <div class="message-box animated fadeIn" data-sound="alert" id="mb-signout">
            <div class="mb-container">
                <div class="mb-middle">
                    <div class="mb-title"><span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?</div>
                    <div class="mb-content">
                        <p>Are you sure you want to log out?</p>                    
                        <p>Press No if youwant to continue work. Press Yes to logout current user.</p>
                    </div>
                    <div class="mb-footer">
                        <div class="pull-right">
                            <g:link class="btn btn-success btn-lg" controller="autenticar" action="logout">Yes</g:link>
                            <button class="btn btn-default btn-lg mb-control-close">No</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END MESSAGE BOX-->

           <!-- START SCRIPTS -->
        <%-- START PLUGINS 
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/jquery/jquery.min.js"></script>--%>
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/jquery/jquery-ui.min.js"></script>          
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/bootstrap/bootstrap.min.js"></script>        
        <!-- END PLUGINS -->
         
    
        <!-- START THIS PAGE PLUGINS-->        
        <script type='text/javascript' src='${request.contextPath}/joli/js/plugins/icheck/icheck.min.js'></script>        
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/scrolltotop/scrolltopcontrol.js"></script>
        
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/morris/raphael-min.js"></script>
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/morris/morris.min.js"></script> 
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/rickshaw/d3.v3.js"></script>
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/rickshaw/rickshaw.min.js"></script>
        <script type='text/javascript' src='${request.contextPath}/joli/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js'></script>
        <script type='text/javascript' src='${request.contextPath}/joli/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js'></script>                
        <script type='text/javascript' src='${request.contextPath}/joli/js/plugins/bootstrap/bootstrap-datepicker.js'></script>                
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/owl/owl.carousel.min.js"></script>                 
        
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/moment.min.js"></script>
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins/daterangepicker/daterangepicker.js"></script>
        <!-- END THIS PAGE PLUGINS-->        

        <!-- START TEMPLATE -->
       <%--<script type="text/javascript" src="${request.contextPath}/joli/js/settings.js"></script>--%>
        
        <script type="text/javascript" src="${request.contextPath}/joli/js/plugins.js"></script>        
        <script type="text/javascript" src="${request.contextPath}/joli/js/actions.js"></script>
        
        <script type="text/javascript" src="${request.contextPath}/joli/js/demo_dashboard.js"></script>
        <!-- END TEMPLATE -->
    <!-- END SCRIPTS -->         
		
		
	</body>
</html>
