package ucsp.is2.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ucsp.is2.model.Playlist;
import ucsp.is2.repository.PlaylistRepository;
import ucsp.is2.model.Song;
import ucsp.is2.repository.SongRepository;
//import ucsp.is2.repository.UsuarioRepository;

@RestController
public class PlaylistController {

	@Autowired
	PlaylistRepository repository;
	SongRepository songRepository;
	//UsuarioRepository userRepository;
	
	@RequestMapping(value = "playlist", method = RequestMethod.GET)
	public List<Playlist> listAll() {
		return repository.findAll();
	}
/*	
	@RequestMapping(value = "/playlist/add/{id_song}")
	public List<Playlist> AddSong(@PathVariable Long id_song) {
		Song song = songRepository.findById(id_song);
		if (song == null) {
			//Mostrar error Vista
			return repository.findAll();
		}
		repository.add(song); 
		return repository.findAll();
	}
	
	@RequestMapping(value = "/playlist/delete/{id_song}")
	public List<Playlist> DeleteSong(@PathVariable Long id_song) {
		Song song = songRepository.findById(id_song);
		if (song == null) {
			//Mostrar error Vista
			return repository.findAll();
		}
		repository.delete(song); 
		return repository.findAll();
	}*/
	
}