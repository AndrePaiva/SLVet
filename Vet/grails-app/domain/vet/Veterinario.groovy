package vet



class Veterinario extends Pessoa {
	
	
	String crmv

	static mapping = {
		table "VETERINARIO"
		version false
		id column: "ID_VETERINARIO", generator:"increment";
		crmv cloumn:"CRMV";
	}
	
    static constraints = {
    }
}
