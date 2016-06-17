package ucsp.is2.repository;

import org.springframework.data.repository.Repository;

import ucsp.is2.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends Repository<Song, Long> {
	public Song save(Song song);
	public Song findById(Long id);

	public void delete( Song song );
	public List< Song > findAll();
	public Optional< Song > findOne( Long id );
	public Optional< Song > findBypuntuation( Long id );
}
