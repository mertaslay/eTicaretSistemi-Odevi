package eTicaretSistemiOdev.dataAccess.abstracts;

import eTicaretSistemiOdev.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete (User user);
	boolean email(String email);
	boolean password(String password);
	
	
}
