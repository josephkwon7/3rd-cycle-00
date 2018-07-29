package com.joseph.web;

import javax.servlet.http.HttpSession;

import com.joseph.domain.User;

public class HttpSessionUtils {
	public static final String USER_SESSION_KEY = "sessionedUser";
	
	public static boolean isLoginUser(HttpSession session) {
		System.out.println("!!!!! isLoginUser called");
		Object sessionedUser = session.getAttribute(USER_SESSION_KEY);
		if (sessionedUser == null) {
			System.out.println("!!!!! sessionedUser null");
			return false;
		}
		System.out.println("!!!!! isLoginUser true");
		return true;
	}
	
	public static User getUserFromSession(HttpSession session) {
		System.out.println("!!!!! getUserFromSession called");
		if (!isLoginUser(session)) {
			return null;
		}
		
		return (User)session.getAttribute(USER_SESSION_KEY);
		
	}
}
