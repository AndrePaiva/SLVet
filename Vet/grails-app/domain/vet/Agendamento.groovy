package vet

import java.security.PublicKey;
import java.util.Date;


class Agendamento {
	
	Animal animal
	String title// = (animal.cliente.nome.split(" "))[0] + " - " + animal.nome
	Date start
	
	
	static mapping = {
		table "AGENDAMENTO"
		version false
		id column: "ID_AGENDAMENTO", generator:"increment";
		title column: "TITULO_EVENTO";
		animal column: "ID_ANIMAL";
		start column: "DATA_INICIO";
	
	}
	
	static constraints = {
		title nullable:true, blank:true;
    }
}
