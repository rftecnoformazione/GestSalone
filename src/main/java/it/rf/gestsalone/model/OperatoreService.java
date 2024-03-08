package it.rf.gestsalone.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.repository.OperatoreRepository;

@Service
public class OperatoreService {
	
	@Autowired
	private OperatoreRepository oR;
	
	public Operatore trovaOperatore(String cfOperatore)
	{
		
		Optional<Operatore> operatoreTrovato=this.oR.findById(cfOperatore);
		
		if(operatoreTrovato.isPresent())
		{
			return operatoreTrovato.get();
		}
		else
		{
			return null;
		}
	
	}

}
