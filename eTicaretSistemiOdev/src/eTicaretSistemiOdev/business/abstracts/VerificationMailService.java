package eTicaretSistemiOdev.business.abstracts;

import eTicaretSistemiOdev.entities.concretes.User;

public interface VerificationMailService {
	
	void sendMail(String mail);

	void verifyCheckMail(String email);

	boolean verificatedMail(String email);

	void sendMailwithUser(User user, String mail);
	
	//verification->do�rulama,verify->do�rulay�n
}
