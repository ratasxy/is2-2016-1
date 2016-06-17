package ucsp.is2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpEntity;

import ucsp.is2.model.MinimumLogin;
import ucsp.is2.model.User;
import ucsp.is2.repository.UserRepository;

import java.util.Optional;

@RestController
public class LoginController{

	@Autowired
	UserRepository Repository;

	@RequestMapping( value= "/login/access" , method = RequestMethod.GET )
	@ResponseBody
	public HttpEntity< User > Loging(@RequestBody MinimumLogin logings ){
			Optional< User > usuario = Repository.findByEmail( logings.Email );
			if( usuario.isPresent() == false){
				return ( HttpEntity< User > ) HttpEntity.EMPTY;			
			}
			HttpEntity< User > NewHttpUsuario = new HttpEntity< User >( usuario.get() );
			return NewHttpUsuario;
	}
}
