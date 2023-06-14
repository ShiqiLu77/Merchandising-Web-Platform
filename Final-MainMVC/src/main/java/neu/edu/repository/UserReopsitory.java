package neu.edu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import neu.edu.entity.Address;
import neu.edu.entity.User;

@Repository
public class UserReopsitory {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public List<User> getAllUsers() {
		return (List<User>)em.createQuery("from User").getResultList();
	}

	@Transactional
	public boolean save(User user) {
		try {
			em.persist(user);
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}
	}

	public User findByUserName(String username) {
		if(false) {
			String sql = "SELECT u from User u where u.username = '" + username + "'";
			Query query = em.createQuery(sql);
			User user = null;
			try {
			 user = (User) query.getSingleResult();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			return user;
		}else {
			return (User)em.find(User.class, username);
		}
	}

	@Transactional
	public boolean addAddress(Address address) {
		em.merge(address);
		return true;
	}

}
