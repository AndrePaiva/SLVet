package vet

import grails.transaction.Transactional
import static org.springframework.http.HttpStatus.*

@Transactional
class ArquivoLaudoService {

    def serviceMethod() {

    }
	
	@Transactional
	def save(ArquivoLaudo arquivoLaudo){
		arquivoLaudo.save flush:true
	}
	
	@Transactional
	def upload(ArquivoLaudo arquivoLaudoInstance) {
		def file = request.getFile('arquivo.arquivo')
//		def arquivoLaudoInstance = new ArquivoLaudo()
		if(file.empty) {
			flash.message = "File cannot be empty"
		} else {
			arquivoLaudoInstance.nomeArquivo = file.originalFilename
			arquivoLaudoInstance.arquivo = file.getBytes()
			arquivoLaudoInstance.uploadData = new Date()
//            arquivoLaudoInstance.save()
			save(arquivoLaudoInstance)
		}
//		redirect (action:'index')
	}
}
