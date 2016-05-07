package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Puntuation{
    @ID
    @SequenceGenerator(name="PUNTIATION_GENERATOR", sequenceName="PUNTUATION_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUNTUATION_GENERATOR")


    private integer score = 0;
    public Puntuacion(){
    
	}
	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
    
    public static integer clasification(){
        
            score = score + 1;
            Puntuation.save(score);
            System.out.println(score);
    }
 
}