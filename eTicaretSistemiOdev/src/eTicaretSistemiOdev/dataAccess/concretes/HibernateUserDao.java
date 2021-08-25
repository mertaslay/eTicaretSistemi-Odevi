package eTicaretSistemiOdev.dataAccess.concretes;

import java.util.List;
import java.util.ArrayList;

import eTicaretSistemiOdev.dataAccess.abstracts.UserDao;
import eTicaretSistemiOdev.entities.concretes.User;

//veriye eriþim kodlarýný yazýyor olacaðýz
public class HibernateUserDao implements UserDao {
	
	//buna bak
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
      users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean email(String email) {
		
		for(User user : users) {
			if(user.getEmail() == email) {
				return true;
		}		
	
	}
		return false;
}

	@Override
	public boolean password(String password) {
	     for(User user: users) {
	    	 if(user.getEmail()== password) {
	    	 
	    		 return true;
	    	 }
	     }
	     
		return false;
	}

}
