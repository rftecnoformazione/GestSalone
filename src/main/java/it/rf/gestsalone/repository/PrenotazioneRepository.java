package it.rf.gestsalone.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.DTO.SegreteriaDto;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Integer> {
	
	

	
	// @Query("SELECT new it.rf.gestsalone.model.DTO.SegreteriaDto(p.codPrenotazione, c.idOperazione) FROM Prenotazione p JOIN p.listacontiene c")
	//SELECT new it.rf.gestsalone.model.DTO.SegreteriaDto(c.nomeCliente, p.codPrenotazione) 	FROM Cliente c 	JOIN c.listaPrenotazioni p
	
	// @Query("select new it.rf.gestsalone.model.DTO.SegreteriaDto(c.nomeCliente, c.cognomeCliente, p.codPrenotazione, lc.idOperazione,s.nomeServizio)FROM Cliente c JOIN c.listaprenotazione p JOIN p.listacontiene lc JOIN lc.servizio s WHERE p.")


	@Query("SELECT new it.rf.gestsalone.model.DTO.SegreteriaDto(c.nomeCliente, c.cognomeCliente, p.codPrenotazione, lc.idOperazione, s.nomeServizio, o.nomeOperatore, o.cfOperatore) " +
		       "FROM Cliente c " +
		       "JOIN c.listaprenotazione p " +
		       "JOIN p.listacontiene lc " +
		       "JOIN lc.servizio s " +
		       "JOIN lc.operatorec o")
		Optional<List<SegreteriaDto>> elencoprenotazioni();
	

}
