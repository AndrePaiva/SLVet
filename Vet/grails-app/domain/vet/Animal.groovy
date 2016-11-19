package vet


//import br.com.sqlvet.Pessoa

class Animal {

	Pessoa cliente
	String nome
	String especie
	String raca
	Double peso
	Double tamanho 
	
	@Override
	String toString(){
		return this.nome
	}
	
	static mapping = {
		table "ANIMAL"
		version false
		id column: "ID_ANIMAL", generator:"increment";
		cliente column: "ID_PESSOA";
		nome column: "NOME";
		especie column: "ESPECIE";
		raca column: "RACA";
		peso column: "PESO";
		tamanho column: "TAMANHO";
	}
	
	static constraints = {
	}
}
