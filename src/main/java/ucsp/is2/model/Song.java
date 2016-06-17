package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Song {

	@Id
	@SequenceGenerator(name="SONG_ID_GENERATOR", sequenceName="SONG_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SONG_ID_GENERATOR")
	private long id;
	private Long CounterPlayed;
	private String name;
	private Long puntuation;

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

	public void IncreamentCounter(){
		this.CounterPlayed = this.CounterPlayed + 1;
	}

	public void setPuntuation( Long scores ){
		this.puntuation = scores;	
	}
	
	public Long getPuntuation(){
		return this.puntuation;
	}

}
