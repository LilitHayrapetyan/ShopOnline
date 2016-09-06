import java.io.IOException;
import java.util.List;

import interfaces.IUserRepositor;

public class UserRepository implements IUserRepositor{

	
	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userName) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userListContainUserOrNot(List<User> userList, User usr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void editUser(User user, int userId) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
