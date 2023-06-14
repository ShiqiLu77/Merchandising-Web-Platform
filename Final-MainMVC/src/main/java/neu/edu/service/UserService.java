package neu.edu.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.controller.model.AddressModel;
import neu.edu.controller.model.UserModel;
import neu.edu.entity.Address;
import neu.edu.entity.AddressId;
import neu.edu.entity.User;
import neu.edu.repository.UserReopsitory;

@Service
public class UserService {
	
	@Autowired
	private UserReopsitory userReopsitory;

	@Transactional
	public List<UserModel> getAllUsers(){
		System.out.println("User Service");
		List<UserModel> userModels = new ArrayList<UserModel>();
		for(User user:userReopsitory.getAllUsers()) {
			System.out.println(user.getUsername());
			System.out.println(user.getAddresses().size());
		}
		return userModels;
	}
	
	public boolean saveUser(UserModel userModel) {
		User user = new User();
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setPassword(userModel.getPassword());
		user.setUsername(userModel.getUsername());
		
		
		return userReopsitory.save(user);
	}
	
	public boolean createAddress(String username,AddressModel addressModel) {
		AddressId addressId = new AddressId(username, "Home");
		Address address = new Address(addressId, new User(username), "AddLine12", "city2", "NY");
		
		return userReopsitory.addAddress(address);
	}
}
