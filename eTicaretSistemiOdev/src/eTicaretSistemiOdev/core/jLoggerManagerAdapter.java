package eTicaretSistemiOdev.core;

import eTicaretSistemiOdev.entities.concretes.User;
import eTicaretSistemiOdev.google.GoogleLoginManager;

public class jLoggerManagerAdapter  implements LoggerService{

	
	//google servisini adapter sayesinde sisteme ekleyebildik
		//GoogleLoginManager googleAuth = new GoogleLoginManager();
		//yukardakini metodlar içindede tanýmlayabiliriz
	
	@Override
	public void logIn(User user) {
		GoogleLoginManager googleAuth = new GoogleLoginManager();
		googleAuth.logIn(user.getEmail(),user.getPassword());
		
	}

	@Override
	public void signUp(User user) {
		GoogleLoginManager googleAuth = new GoogleLoginManager();
		googleAuth.signUp(user.getEmail(),user.getPassword());
		
		
	}

	
	

}
