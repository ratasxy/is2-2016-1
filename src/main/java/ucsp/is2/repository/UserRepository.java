package ucsp.is2.repository;

import org.springframework.data.repository.Repository;

import ucsp.is2.model.User;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends Repository< User , Long >{
	public User save(User song);
	public User findById(Long id);
	public List< User > findAll();
	public Optional< User > findByEmail( String email );
	public Optional< User > findByPassword( String password ); /// checkout
	public void delete( User userdead );
}
