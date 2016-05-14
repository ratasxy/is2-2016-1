package ucsp.is2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucsp.is2.model.Song;
import ucsp.is2.repository.SongRepository;

@Service
public class TestService {

//	@Autowired
//	SongRepository respository;
	
	public String test() {
//		Song song = new Song();
//		song.setName("Cancion 1");
//		respository.save(song);
//		respository.findAll();
        return "Hello, World!";
    }

}
