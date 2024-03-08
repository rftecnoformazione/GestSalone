package it.rf.gestsalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import it.rf.gestsalone.model.Cliente;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
 

public Integer countByCfCliente(String cf);

//public Cliente  findByPswClienteUserCliente(String pswCliente,String UserCliente);

public Optional <Cliente> findByUserClienteAndPswCliente(String userCliente, String pswCliente);

	
}
