package it.rf.gestsalone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.DTO.SegreteriaDto;
import it.rf.gestsalone.repository.PrenotazioneRepository;
import lombok.Getter;
import lombok.Setter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Service
public class PrenotazioneService {
	
	@Autowired
	private PrenotazioneRepository Pr;
	
	 public void inserisciPrenotazione(Prenotazione p)
	 {
		 
		 this.Pr.save(p);
		 
		 
	 }

	 
 public void elencodelgiorno()
	 {
		 Optional<List<SegreteriaDto>> listaoptionalPrenotazioni = this.Pr.elencoprenotazioni();

		      if(listaoptionalPrenotazioni.isPresent())
		      {
		    	  List<SegreteriaDto>listasegreteria=listaoptionalPrenotazioni.get();
		    	  
		    	  System.out.print("-----------------------------INIZIO-----------------------------");
		    	  
		    	  for(int i=0;i<listasegreteria.size();i++)
		    	  {
		    		 
		    		  System.out.print(listasegreteria.get(i).getNomeCliente());
			    	  System.out.print(listasegreteria.get(i).getCognomeCliente());
			    	  System.out.print(listasegreteria.get(i).getCodPrenotazione());
		    		  System.out.print(listasegreteria.get(i).getIdOperazione());
			    	  System.out.print(listasegreteria.get(i).getNomeServizio());
			    	  System.out.print(listasegreteria.get(i).getCfOperatore());
			       	  System.out.print("---------------------------------------------------------------ook");
		    	  }
		    	 
		      }
		      else
		      {
		    	  System.out.print("--------------------------------------------------------------NIENTE");
		      }

		   
		}
}
