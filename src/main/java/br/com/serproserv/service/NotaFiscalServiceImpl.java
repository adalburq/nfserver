package br.com.serproserv.service;

import org.springframework.stereotype.Service;

@Service
public class NotaFiscalServiceImpl implements NotaFiscalService {

	public boolean existsById(Integer id) {
		
		if(id == 10) {
			return true;
		} else {
			return false;
		}

	}

	public boolean cnpjIsPresent(String cnpj) {
		
		if(cnpj.equals("11111111111111")) {
			return true;
		} else {
			return false;
		}
		
	}

}
