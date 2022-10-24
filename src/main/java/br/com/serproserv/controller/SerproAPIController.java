package br.com.serproserv.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.serproserv.model.NotaFiscal;
import br.com.serproserv.service.NotaFiscalService;

@Controller
@RequestMapping(path = "/serproAPI/v1")
public class SerproAPIController {

	Logger logger = LoggerFactory.getLogger(SerproAPIController.class);
	
	@Autowired
	NotaFiscalService notaFiscalService;
	
	@GetMapping("/teste")
	public ResponseEntity<String> teste() {
        String retorno = "API serproserv ativa  ! "; 
		return new ResponseEntity<String>(retorno, HttpStatus.OK);
	}	
	
	@PostMapping("/notasFiscais")
	public ResponseEntity<Object> postData(@RequestBody NotaFiscal notaFiscal) {
		
		logger.info("SERVER postData id ==> " + notaFiscal.getId());
		
        if(notaFiscalService.existsById(notaFiscal.getId())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("SERVER Error: Nota Fiscal já Existe !");
        }
        if(!notaFiscalService.cnpjIsPresent(notaFiscal.getCnpj())){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("SERVER Error: CNPJ não está cadastrado no Serpro");
        } 
        
        notaFiscal.setNotaFiscalValida(Boolean.TRUE);
        
        logger.info("SERVER postData NF valida ==> " + notaFiscal.getNotaFiscalValida());
        
        return  ResponseEntity.status(HttpStatus.CREATED).body(notaFiscal);
	}
	
	
}
