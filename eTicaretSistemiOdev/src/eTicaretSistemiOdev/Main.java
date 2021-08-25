package eTicaretSistemiOdev;

import eTicaretSistemiOdev.business.abstracts.UserService;
import eTicaretSistemiOdev.business.concretes.VerificationMailManager;
import eTicaretSistemiOdev.business.concretes.UserCheckManager;
import eTicaretSistemiOdev.business.concretes.UserManager;
import eTicaretSistemiOdev.core.jLoggerManagerAdapter;
import eTicaretSistemiOdev.core.LoggerService;

import eTicaretSistemiOdev.dataAccess.concretes.HibernateUserDao;
import eTicaretSistemiOdev.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new UserCheckManager(),new HibernateUserDao(), new VerificationMailManager());
        LoggerService loggerService = new jLoggerManagerAdapter();
        
        
        User dogruUser = new User(1, "Mert", "Aslay", "mert_aslay@gmail.com", "123647");
		User yanlismailuser = new User(2, "Özge", "Selvi", "yanlis.+.yanlis@gmail.com", "123456");
		User yanlissifreuser = new User(3, "Emre", "Derya", "deneme2@gmail.com", "1234");
		userService.signUp(dogruUser);
		userService.signUp(yanlismailuser);
		userService.signUp(yanlissifreuser);
		
		userService.logIn(yanlissifreuser);
		userService.logIn(dogruUser);
		
		
		loggerService.logIn(dogruUser);

 }
}
