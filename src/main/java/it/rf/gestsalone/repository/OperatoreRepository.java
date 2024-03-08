package it.rf.gestsalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.rf.gestsalone.model.Operatore;

@Repository
public interface OperatoreRepository extends JpaRepository<Operatore, String> {

}
