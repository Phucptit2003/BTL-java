package Service;

import java.util.List;

import Model.User;

public interface UserService {
	void insert(User user);

	void edit(User user);

	void delete(int id);

	User get(String username);
	
	User get(int id);
	
	User login(String username, String password);
	
	boolean register(String email, String password, String username);
        
        boolean checkExistEmail(String email);
	
	boolean checkExistUsername(String username);

	List<User> getAll();

	
	
}
