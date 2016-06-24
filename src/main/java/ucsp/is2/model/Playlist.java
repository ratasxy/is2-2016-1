package ucsp.is2.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Playlist {

	@Id
	@SequenceGenerator(name="PLAYLIST_ID_GENERATOR", sequenceName="PLAYLIST_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLAYLIST_ID_GENERATOR")
	private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany
    public List<Song> list;
	
	//@ManyToOne
    //public User user;
}