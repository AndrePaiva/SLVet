import vet.security.Permissao
import vet.security.Usuario
import vet.security.UsuarioPermissao

class BootStrap {

    def init = { servletContext ->
		
		
		Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
		if (admin == null){
			admin = new Permissao(authority: "ROLE_ADMIN").save(flush:true)
		}
		
		
		Usuario administrador = Usuario.findByUsername("administrador")
		if (administrador == null){
			administrador = new Usuario(username: "admin", password: "123",
				enabled: true, accountExpired: false, accountLocked: false,
				passwordExpired: false).save(flush:true)
		}
		
		
		if (UsuarioPermissao.findByUsuarioAndPermissao(administrador,admin) == null)
		{
			new UsuarioPermissao(usuario: administrador, permissao: admin).save(flush:true)
		}
		
		
    }
    def destroy = {
    }
}
