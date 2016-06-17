package ucsp.is2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ucsp.is2.model.Song;

@RestController
@RequestMapping("/puntuation")
public class PuntuationController {
	
	@Autowired
	private Song puntuation;
	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET, produces = "aplication/json")
	public Song getPuntuation(@PathVariable long score, long id){
		puntuation.setId(id);
		puntuation.setScore(score);
		return puntuation;		
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.POST, produces = "aplication/json")
    public void savePuntuation (long id, long score){
    	puntuation.add(0, score +" " +id);
    }
}
