package org.nrj.servlets.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UsersUtil {
	
	
	public static final String UNAME="user";
	public static final String PASS="pass";

	
	public static String getPasswordHash(String password) throws NoSuchAlgorithmException {
		byte[] barr = MessageDigest.getInstance("SHA-256").digest(password.getBytes(StandardCharsets.UTF_16));
		String sha3_256hex = new String(barr, StandardCharsets.UTF_16);
		return sha3_256hex;
	}
	
	
	/*
	 * password : 5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8
	 * pass : d74ff0ee8da3b9806b18c877dbf29bbde50b5bd8e4dad7a3a725000feb82e8f1
	 * user : 04f8996da763b7a969b1028ee3007569eaf3a635486ddab211d512c85b9df8fb
	 * 
	 * */
	
	
	
	
	
}
