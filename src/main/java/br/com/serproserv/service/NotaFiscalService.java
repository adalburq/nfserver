package br.com.serproserv.service;

public interface NotaFiscalService {

	public boolean existsById(Integer id);

	public boolean cnpjIsPresent(String cnpj);	
	
}
