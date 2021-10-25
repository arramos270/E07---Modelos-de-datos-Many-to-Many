package exercise.E07Modelos_de_datos_Many_to_Many.repos;

import exercise.E07Modelos_de_datos_Many_to_Many.model.Artist;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findByArtist(Artist artist);
}
