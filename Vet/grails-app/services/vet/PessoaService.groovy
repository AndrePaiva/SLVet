package vet

import grails.transaction.Transactional

@Transactional
class PessoaService {

	@Transactional
	def save(Pessoa pessoa){
		pessoa.save flush:true
	}
	
}
