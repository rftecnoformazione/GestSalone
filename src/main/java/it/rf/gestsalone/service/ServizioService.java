package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Servizio;
import it.rf.gestsalone.repository.ServizioRepository;

@Service
public class ServizioService {

	@Autowired
	private ServizioRepository Sr;
	
	public List<Servizio> elencaServizi()
	{
		List <Servizio>listaservizi=this.Sr.findAll();
		return listaservizi;
	}
	
	
	public Servizio trovaServizio(Integer idServizio)
	{
		
		Optional<Servizio> serv=this.Sr.findById(idServizio);
		if(serv.isPresent())
		{
			Servizio sTrovato=serv.get();
			
			return sTrovato;
		}
		else
		{
			return null;
		}
		
	}
	
}
