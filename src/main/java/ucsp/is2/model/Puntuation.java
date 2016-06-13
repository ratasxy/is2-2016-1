package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Puntuation{
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE , generator ="PUNTUATION_SEQ")
	public static String TABLE_NAME="puntuation";
    private long id;
    private long score = 0;
    
    public Puntuation(long score){
    	this.score =score;
    }

	public long getId(){
    	return id;
    }
    
    public void setId(long id){
    	this.id=id;
    }
    
  	public long getScore() {
  		return score;
  	}

  	public void setScore(long score) {
  		this.score = score;
  	}

	public void add(int num, String name) {
		//
	}
}
