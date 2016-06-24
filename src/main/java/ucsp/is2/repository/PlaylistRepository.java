package ucsp.is2.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import ucsp.is2.model.Playlist;
import ucsp.is2.model.Song;

public interface PlaylistRepository extends Repository<Playlist, Long> {
	public Playlist save(Playlist playlist);
	//public Playlist add(Song song); 	
	public Playlist findByName(String name);
	//public Playlist findByUser(Long id_user);
	public Playlist findById(Long id); 
	public List<Playlist> findAll();
	public void delete(Playlist playlist); 
}
