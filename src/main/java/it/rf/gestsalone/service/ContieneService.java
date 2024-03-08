package it.rf.gestsalone.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Contiene;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.Servizio;
import it.rf.gestsalone.repository.ContieneRepository;

@Service
public class ContieneService {
	
	@Autowired
	private ContieneRepository cR;

	public void insertContiene(Prenotazione prenotazione,Servizio servizio,Operatore o,Date dataEsecuzione)
	{
		Contiene cn=new Contiene();
		cn.setPrenotazione(prenotazione);
		cn.setServizio(servizio);
		cn.setOperatorec(o);
		cn.setStatoOperazione(true);
		cn.setDataEsecuzione(dataEsecuzione);
     	this.cR.save(cn);	
		
	}
	
}
