package ucsp.is2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ucsp.is2.repository.UserRepository;
import ucsp.is2.model.MinimumUser;
import ucsp.is2.model.User;

import java.util.Optional;

@RestController
public class UserController{

	@Autowired
	UserRepository Repository;

	@RequestMapping( value = "/user/register" , method = RequestMethod.POST )	
	public void RegisterUser( @RequestBody MinimumUser Datas ){
		Optional< User > usuario = Repository.findByEmail( Datas.Email );
		if( usuario.isPresent() == false ){
			User NewUsuario = new User( Datas.Firstname, Datas.Lastname, Datas.Email, Datas.Password, Datas.Nickname );
			Repository.save( NewUsuario );	
		}
	}
}
