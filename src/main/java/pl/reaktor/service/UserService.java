package pl.reaktor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.reaktor.model.NewMember;
import pl.reaktor.repository.UserRepository;

@Service
public class UserService {
	private UserRepository users;

	
	@Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.users = userRepository;
    }
	
	public void addNewMember(NewMember newMember) {
		users.save(newMember);
	}
}
