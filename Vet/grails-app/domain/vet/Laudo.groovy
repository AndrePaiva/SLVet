package vet

class Laudo {

	Animal animal
//	static belongsTo = [arquivo: ArquivoLaudo]
	ArquivoLaudo arquivo
	Date data
	Veterinario veterinario
	
	static mapping = {
		table "LAUDO"
		version false
		id column: "ID_LAUDO", generator:"increment";
		animal cloumn:"ANIMAL";
		arquivo cloumn:"ID_ARQUIVO_LAUDO";
		data cloumn:"DATA";
		veterinario cloumn:"VETERINARIO";
	}
	
	static constraints = {
	}
}
