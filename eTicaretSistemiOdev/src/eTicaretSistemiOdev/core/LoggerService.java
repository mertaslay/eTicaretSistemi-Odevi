package eTicaretSistemiOdev.core;

import eTicaretSistemiOdev.entities.concretes.User;

public interface LoggerService {
	
	void logIn(User user);
	
	void signUp(User user);

}
