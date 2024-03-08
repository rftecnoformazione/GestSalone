package it.rf.gestsalone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Cliente;
import it.rf.gestsalone.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository cR;
	
	
	
	public Optional<Cliente> salvaCliente(Cliente cliente)
	{
		return Optional.of(this.cR.save(cliente));
	}
	
	
	
	public Optional<Cliente> ricercaPerCf(String cfDaRicercare)
	{
		Optional<Cliente> clienteTrovato= this.cR.findById(cfDaRicercare);
		return clienteTrovato;
	}
	
	public void UpdateCliente(Cliente c)
	{
		this.cR.save(c);
	}
	
	
	public Optional<Cliente> trovaClienteUserPsw(String userDaRic,String pswDaRic)
	{
		Optional<Cliente> clienteTrovato=this.cR.findByUserClienteAndPswCliente(userDaRic, pswDaRic);
		return clienteTrovato;
	}
	

}
