package ucsp.is2.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import ucsp.is2.model.Song;

public interface SongRepository extends Repository<Song, Long> {
	//insert into song values ...
	//song.id != null => UPDATE
	public Song save(Song song);

	// select * from song where id = :id
	public Song findById(Long id);
	// select * from song where name = :name
//	public Song findByIdAndName(String name);

//	@Query("SELECT s FROM Song s")
	public List<Song> findAll();
}
