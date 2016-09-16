

class Veterinario {
	
	Pessoa veterinario
	String crmv
	
	static mapping = {
		table "VETERINARIO"
		version false
		id column: "ID_VETERINARIO", generator:"increment";
		veterinario column:"ID_PESSOA";
		crmv cloumn:"CRMV";
	}
	
    static constraints = {
    }
}
