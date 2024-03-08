package it.rf.gestsalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.rf.gestsalone.model.Cliente;
import it.rf.gestsalone.service.ClienteService;

@RestController
public class RestControllerGenerico {
	

@Autowired
private ClienteService cS;


@PostMapping("inserisciCliente")
public ResponseEntity<Cliente> inserisciCliente(@RequestBody Cliente cliente)
{
	Cliente clienteSalvato  = this.cS.salvaCliente(cliente).get();
	
    return new ResponseEntity<>(clienteSalvato, HttpStatus.CREATED);

}

@PutMapping("aggiornaCliente")
public ResponseEntity<Cliente> aggiornaCliente(@RequestParam String codiceFiscale, @RequestBody Cliente cliente)
{
	
	Cliente clienteDaAggiornare = this.cS.ricercaPerCf(codiceFiscale).get();
	clienteDaAggiornare.setNomeCliente(cliente.getNomeCliente());
	clienteDaAggiornare.setCognomeCliente(cliente.getCognomeCliente());
	
	Cliente clienteSalvato  = this.cS.salvaCliente(clienteDaAggiornare).get();
	
    return new ResponseEntity<>(clienteSalvato, HttpStatus.CREATED);

}


}
