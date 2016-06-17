package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User{

	@Id
	@SequenceGenerator(name="USERS_ID_GENERATOR", sequenceName="USERS_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_ID_GENERATOR")
	private Long id;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Password;
	private String Nickname;

	public User( String f, String l, String e, String p, String n ){
		this.Firstname = f;
		this.Lastname = l;
		this.Email = e;
		this.Password = p;
		this.Nickname = n;	
	}

	public User(){
	}

	public void SetFirstName( String n ){
		this.Firstname = n;
	}

	public void SetLastName( String l ){
		this.Lastname = l;
	}

	public void SetEmail( String e ){
		this.Email = e;
	}

	public void SetPassword( String p ){
		this.Password = p;
	}

	public void SetNickname( String n ){
		this.Nickname = n;	
	}

	public String GetFirstName( ){
		return Firstname;
	}

	public String GetLastName( ){
		return Lastname;
	}

	public String GetEmail( ){
		return Email;
	}

	public String GetPassword(  ){
		return Password;
	}

	public String GetNickname( ){
		return Nickname;	
	}
	
}
