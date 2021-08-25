package eTicaretSistemiOdev.business.abstracts;

import eTicaretSistemiOdev.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void logIn(User user);

}
