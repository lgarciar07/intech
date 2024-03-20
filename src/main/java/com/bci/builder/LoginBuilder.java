package com.bci.builder;

import com.bci.bean.out.LoginOut;
import com.bci.model.Login;
import com.bci.util.Util;

public class LoginBuilder {
		public static LoginOut findByUsuario(Login user) {
		return Util.objectToObject(LoginOut.class, user);
	}
}