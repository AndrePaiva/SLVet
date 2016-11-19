package vet

class ArquivoLaudo {
	String nomeArquivo
	byte[] arquivo
	Date uploadData = new Date()
	
	@Override
	String toString(){
		return this.nomeArquivo
	}
	
	static mapping = {
		table "ARQUIVO_LAUDO"
		version false
		id column: "ID_ARQUIVO_LAUDO", generator:"increment";
		nomeArquivo cloumn:"NOME_ARQUIVO";
		arquivo cloumn:"ARQUIVO";
		uploadData cloumn:"DATA";		
	}
	
	static constraints = {
		nomeArquivo(blank:false,nullable:true)
		arquivo(blank: true, nullable:true, maxSize:1024*200)
	}
}
