package eTicaretSistemiOdev.business.concretes;

import eTicaretSistemiOdev.business.abstracts.UserCheckService;
import eTicaretSistemiOdev.business.abstracts.UserService;
import eTicaretSistemiOdev.business.abstracts.VerificationMailService;
import eTicaretSistemiOdev.entities.concretes.User;
import eTicaretSistemiOdev.dataAccess.abstracts.UserDao;


public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerificationMailService verificationMailService;
	
	public UserManager(UserCheckService userCheckService,UserDao userDao,VerificationMailService verificationMailService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verificationMailService = verificationMailService;
	}



	//sign up = kay�t ol
	@Override
	public void signUp(User user) {
		if(userCheckService.checkFirstName(user) && userCheckService.checkLastName(user) 
				&& userCheckService.checkPassword(user) && userCheckService.checkEmail(user) == true) {
			System.out.println("Kay�t ba�ar�l�");
			System.out.println("---signup");
			verificationMailService.sendMailwithUser(user,user.getEmail());
			userDao.add(user);
			
		}else {
			System.out.println("kay�t ba�ar�s�z");
			System.out.println("---signup");
		}
			
		
	}


	// log �n = giri� yap
	@Override
	public void logIn(User user) {
		if(userDao.email(user.getEmail()) && userDao.password(user.getPassword()) 
				&& verificationMailService.verificatedMail(user.getEmail())) {
			System.out.println("Giri� basar�l�");
		}else if(verificationMailService.verificatedMail(user.getEmail()) == false){
			System.out.println("E-mailiniz dogru de�il ");
		}else {
			System.out.println("Girilen bilgileri tekrar g�zden ge�iriniz ");
		}
		System.out.println("----- logIn");
	}

}
