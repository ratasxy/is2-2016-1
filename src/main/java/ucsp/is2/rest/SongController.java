package ucsp.is2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ucsp.is2.model.Song;
import ucsp.is2.repository.SongRepository;

@RestController
public class SongController {

	@Autowired
	SongRepository repository;

	@RequestMapping(value = "songs", method = RequestMethod.GET)
	//@RequestMapping("song")
	public List<Song> listAll() {
		return repository.findAll();
	}

	@RequestMapping(value = "song/{id}")
	public HttpEntity<Song> listAll(@PathVariable Long id) {
		Song song = repository.findById(id);
		if (song == null) {
			return (HttpEntity<Song>) HttpEntity.EMPTY;
		}
		return new HttpEntity<Song>(song);
	}

	@RequestMapping(value = "song", method = RequestMethod.POST)
	public Long saveSong(@RequestBody Song song) {
		return repository.save(song).getId();
	}
}
