package ucsp.is2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import ucsp.is2.model.Song;
import ucsp.is2.repository.SongRepository;



@RestController
public class SongController {

	@Autowired
	SongRepository repository;
	
	@RequestMapping(name = "song", method = RequestMethod.GET)
	public List<Song> listAll(){
		return repository.findAll();
	}
	
	@RequestMapping(name = "song", method = RequestMethod.POST)
	public long saveSong(Song song){
		return repository.save(song).getId();
	}
}
