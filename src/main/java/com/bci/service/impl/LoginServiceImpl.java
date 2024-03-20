package com.bci.service.impl;

import com.bci.repository.LoginRepository;
import com.bci.bean.out.LoginOut;
import com.bci.builder.LoginBuilder;
import com.bci.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public LoginOut findByUsuario(String username) {
		return LoginBuilder.findByUsuario(loginRepository.findByUsuarioAndEstadoTrue(username));
	}	
}
