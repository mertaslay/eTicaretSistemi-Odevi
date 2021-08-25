package eTicaretSistemiOdev.business.abstracts;

import eTicaretSistemiOdev.entities.concretes.User;

public interface UserCheckService {
	
	boolean checkFirstName(User user);
	
	boolean checkLastName(User user);
	
	boolean checkPassword(User user);
	
	boolean checkEmail(User user);
	
	boolean uniqueEmail(User user);
	
	boolean isValidUser(User user);
		
	//unique->benzersiz ,check->kontrol,valid->geçerli
	
}
