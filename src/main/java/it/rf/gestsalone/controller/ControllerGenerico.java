package it.rf.gestsalone.controller;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import it.rf.gestsalone.model.Cliente;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.model.OperatoreService;
import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.repository.ClienteRepository;
import it.rf.gestsalone.repository.ContieneRepository;
import it.rf.gestsalone.repository.OperatoreRepository;
import it.rf.gestsalone.service.ClienteService;
import it.rf.gestsalone.service.ContieneService;
import it.rf.gestsalone.service.PrenotazioneService;
import it.rf.gestsalone.service.ServizioService;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import it.rf.gestsalone.model.Servizio;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Controller
//@RequestMapping("GestSalone/")
public class ControllerGenerico {
	
@Autowired
private ServizioService Ss;

@Autowired
private PrenotazioneService pS;

@Autowired
private ClienteService cS;

@Autowired
private ContieneService cServ;

@Autowired
private OperatoreService oS;




	
	@GetMapping("home")
	public String vaiHome() {
		return "home";
	}
	
	
	
	
	@GetMapping("registraprenotazione")
	public String vaiRegistra(HttpSession session,Model m) {
		if(session.getAttribute("cfLoggato")==null)
		{
			return "redirect:logincliente";
		}
		else
		{
			List<Servizio> servizidisponibili=this.Ss.elencaServizi();
			m.addAttribute("listaservizi", servizidisponibili);
			return "registraprenotazione";
		}

	}
	
	@PostMapping("inserisciprenotazione")
	public String insPrenotazione(@RequestParam("elencoservizi") Servizio[] elencosettati,String cfCliente,Date dataEsecuzione)
	{	
		Optional<Cliente> c=this.cS.ricercaPerCf(cfCliente);
		Operatore operatoreDefault=this.oS.trovaOperatore("fld");
		
		if((c.isPresent()) && (elencosettati!=null))
		{
			 long miliseconds = System.currentTimeMillis();
			 Date date = new Date(miliseconds);
			Prenotazione prenotazione=new Prenotazione();
			  this.pS.inserisciPrenotazione(prenotazione);
			prenotazione.setCliente(c.get());
			prenotazione.setDataPrenotazione(date);
            prenotazione.setStatoPrenotazione(true);		
			    
		    for(Servizio s :elencosettati)
		    {
		     	System.out.print(operatoreDefault);
			  this.cServ.insertContiene(prenotazione, s,operatoreDefault,dataEsecuzione);    	 		    	  
		    }

			return "redirect:registraprenotazione";
		}
		else
		{
			return "redirect:riserrore";
		}

	}
	
	
	
	@GetMapping("logincliente")
	public String VaiLoginCliente()
	{
		return"logincliente";
	}
	
	
	@RequestMapping("effettualogin")
	public String faiLogin(String userCliente,String pswCliente,HttpSession session,Model m)
	{
		Optional<Cliente> trovato=this.cS.trovaClienteUserPsw(userCliente, pswCliente);
		if(trovato.isPresent()) {
		    session.setAttribute("cfLoggato",trovato.get().getCfCliente());
			return "homecliente";
			}
		else
		{
			m.addAttribute("messaggio","Credenziali Errate");
			return "logincliente";
		}

	}
	
	@GetMapping("terminasessione")
	public String logout(HttpSession session)
	{
		session.setAttribute("cfLoggato",null);
		return"logincliente";
	}
	
	
	@GetMapping("prenotazionidelgiorno")
	public String vaiPrenotazioniDelGiorno() {
		
		
		
		this.pS.elencodelgiorno();
		
		return "prenotazionidelgiorno";
	}
	
	
	
}
