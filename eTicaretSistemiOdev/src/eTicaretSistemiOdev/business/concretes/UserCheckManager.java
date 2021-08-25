package eTicaretSistemiOdev.business.concretes;

import eTicaretSistemiOdev.business.abstracts.UserCheckService;
import eTicaretSistemiOdev.entities.concretes.User;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {

	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("name length must be at least 2");
		    return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length()<2) {
			System.out.println("name length must be at least 2");
		    return false;
		}
		return true;

	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("please enter your password");
			return false;
		}else {
			if(user.getPassword().length() < 6) {
				System.out.println("password cannot be less than 6 characters");
	            return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE); //buna bak
		
		if(user.getEmail().isEmpty()) {
			System.out.println("Please enter your e-mail");
			return false;
		}else {
			if(pattern.matcher(user.getEmail()).find() == false){
				System.out.println("The email address entered is not in accordance with the format. Example: example@example.com");
			    return false;
			}
		}		
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean result= true;
		if(listOfEmail.contains(user.getEmail())) {
			System.out.println("This e-mail address is registered, please try a different e-mail address.");
		     result=false;
		}else {
			result=true;
			listOfEmail.add(user.getEmail());
		}
		return result ;
	}

	@Override
	//valid= geçerli
	public boolean isValidUser(User user) {
		if(checkFirstName(user)&& checkLastName(user) && checkEmail(user) && checkPassword(user) && uniqueEmail(user) == true) {
			return true;
		}
		return false;
	}
	

}
