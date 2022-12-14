package com.codingdojo.bookclub.services;
import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.bookclub.models.LoginUser;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.repositories.UserRepository;
    

    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    
    public User getUser(String email) {
    	Optional<User> potentialUser = userRepo.findByEmail(email);
    	return potentialUser.isPresent() ? potentialUser.get() : null;
    }
    public User getUser(Long id) {
    	Optional<User> potentialUser = userRepo.findById(id);
    	return potentialUser.isPresent() ? potentialUser.get() : null;
    }
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
    	// TO-DO - Reject values or register if no errors:
        
        // Reject if email is taken (present in database)
    	
        // Reject if password doesn't match confirmation
        
        // Return null if result has errors
    
        // Hash and set password, save user to database
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	
        return userRepo.save(newUser);
    }
    public User login(LoginUser loginUser, BindingResult result) {
        // TO-DO: Additional validations!
    	if(result.hasErrors()) {
    		return null;
    	}
    	User existingUser = getUser(loginUser.getEmail());
    	if(existingUser==null) {
    		result.rejectValue("email", "Unique", "Email is not registered user");
    		return null;
    	}
    	if(!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
    		result.rejectValue("password", "Match", "Incorrect Password");
    		return null;
    	}
    	
        return existingUser;
    }
    public User create(User user) {
		return userRepo.save(user);
	}
	
	public List<User> getAll(){
		return (List<User>) userRepo.findAll();
	}
	
	public User findOne(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}else {
			return null;
		}
	}
	public User update(Long id, String name, String vendor, double cost) {
		User userToBeUpdated = new User();
		return userRepo.save(userToBeUpdated);
	}
	
	public String deleteById(Long id) {
		userRepo.deleteById(id);;
		return "You deleted the record with an id of: " + id;
	}
}