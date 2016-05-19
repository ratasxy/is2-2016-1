package ucsp.is2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Puntuation{
    @Id
    @SequenceGenerator(name="PUNTIATION_GENERATOR", sequenceName="PUNTUATION_SEQ")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUNTUATION_GENERATOR")


    private static long score = 0;
    public void Puntuacion(){
    
	}
	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		Puntuation.score = score;
	}
    
    public static void clasification(){
        
            score = score + 1;
            Puntuation.save(score);
            System.out.println(score);
    }
	private static void save(long score2) {
		// TODO Auto-generated method stub
		
	}
 
}