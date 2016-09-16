package vet

class ArquivoLaudo {
	String nomeArquivo
	byte[] arquivo
	Date uploadData = new Date()
	
	static mapping = {
		table "ARQUIVO_LAUDO"
		version false
		id column: "ID_ARQUIVO_LAUDO", generator:"increment";
		nomeArquivo cloumn:"NOME_ARQUIVO";
		arquivo cloumn:"ARQUIVO";
		uploadData cloumn:"DATA";		
	}
	
	static constraints = {
		nomeArquivo(blank:false,nullable:false)
		arquivo(blank: true, nullable:true, maxSize:1024*200)
	}
}
