package com.bci.repository;

import com.bci.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long> {

	Login findByUsuarioAndEstadoTrue(String username);
}
