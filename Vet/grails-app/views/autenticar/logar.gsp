<!DOCTYPE html>
<html>
	<head>
		<title>Autenticar</title>
		<link rel="stylesheet" type="text/css" id="theme" href="${request.contextPath}/joli/css/theme-default.css"/>
	</head>
	<body>
        
        <div class="login-container">
        
            <div class="login-box animated fadeInDown">
                <div class="login-logo"></div>
                <div class="login-body">
                    <div class="login-title"><strong>Log In</strong> to your account</div>
                    <form  action='${request.contextPath}/j_spring_security_check' method='POST' id='frmLogar' name='frmLogar'>
                    <div class="form-group">
                        <div class="col-md-12">
                            <input type="text" class="form-control" placeholder="Usuário" name='j_username' id='username' />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <input type="password" class="form-control" placeholder="Password" name='j_password' id='password'/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-6">
                            <a href="#" class="btn btn-link btn-block">Forgot your password?</a>
                        </div>
                        <div class="col-md-6">
                            <button class="btn btn-info btn-block">Log In</button>
                        </div>
                    </div>
                    
                    
                    <div class="login-subtitle">
                        Don't have an account yet? <a href="#">Create an account</a>
                    </div>
                    </form>
                </div>
                <div class="login-footer">
                    <div class="pull-left">
                        &copy; 2016 SLVet
                    </div>
                    <div class="pull-right">
                        <a href="#">About</a> |
                        <a href="#">Privacy</a> |
                        <a href="#">Contact Us</a>
                    </div>
                </div>
            </div>
            
        </div>
        
    </body>
	
	<!-- <body>
		<form action='${request.contextPath}/j_spring_security_check' method='POST' id='frmLogar' name='frmLogar'>
			<p>
				Email
				<input type='text' name='j_username' id='username' />
			</p>
			<p>
				Senha
				<input type='password' name='j_password' id='password' />
			</p>
			<input type="submit" value="Entrar" />
		</form>
	</body> -->
</html>
