package eTicaretSistemiOdev.business.concretes;

import eTicaretSistemiOdev.business.abstracts.VerificationMailService;
import eTicaretSistemiOdev.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class VerificationMailManager implements VerificationMailService{

	List<String> verifyEmails = new ArrayList<String>();
	
	
	@Override
	public void sendMail(String mail) {
	    System.out.println("Mail gonderildi.");
		
	}

	@Override
	public void verifyCheckMail(String email) {
		verifyEmails.add(email);
		
	}

	@Override
	public boolean verificatedMail(String email) {
		verifyEmails.add(email); // sisteme giriþ yaptýrmak için mail ekledim
		if(verifyEmails.contains(email)) {  
			return true;
		}
		return false;
	}

	@Override
	public void sendMailwithUser(User user, String mail) {
		System.out.println(user.getEmail() + " adresinize mail gonderilmistir");
		System.out.println("----- mail gonderme");
		
	}

	

}
