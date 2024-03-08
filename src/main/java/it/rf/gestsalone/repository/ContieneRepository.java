package it.rf.gestsalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.rf.gestsalone.model.Contiene;

@Repository
public interface ContieneRepository extends JpaRepository<Contiene, Integer>{

}
