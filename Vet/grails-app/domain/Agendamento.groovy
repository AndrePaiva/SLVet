

class Agendamento {
	
	Date data
	Pessoa cliente
	
	static mapping = {
		table "AGENDAMENTO"
		version false
		id column: "ID_AGENDAMENTO", generator:"increment";
		data column: "DATA";
		cliente column: "ID_PESSOA";
	
	}
	
	static constraints = {
    }
}
