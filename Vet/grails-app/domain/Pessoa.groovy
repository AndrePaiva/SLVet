

class Pessoa {
	
	String nome
	String cpf
	Integer rg
	Date dataNascimento	
	String telefone1
	String telefone2
	String userEmail
	String logradouro
	Integer numero
	String bairro
	String cep
	String complemento
	String cidade
	String uf
	
	@Override
	String toString(){
		return nome
	}
	static mapping = {
		table "PESSOA"
		version false
		id column:"ID_PESSOA", generator:"increment";
		nome column:"NOME";
		cpf column:"CPF";
		rg column:"RG";
		dataNascimento column:"DATA_NASCIMENTO";
		telefone1 column:"TELEFONE1";
		telefone2 column:"TELEFONE2";
		userEmail column:"EMAIL";
		logradouro column:"LOGRADOURO";
		numero column:"NUMERO";
		bairro column:"BAIRRO";
		cep column:"CEP";
		complemento column:"complemento";
		cidade column:"CIDADE";
		uf column:"UF"
	}
	
    static constraints = {
		userEmail email: true;
		telefone1 maxSize: 13;
		telefone2 maxSize: 13;
		complemento nullable :true
    }
}
