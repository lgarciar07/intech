package com.bci.service;

import com.bci.bean.out.LoginOut;

public interface LoginService {
	
	LoginOut findByUsuario(String usuario);
}
