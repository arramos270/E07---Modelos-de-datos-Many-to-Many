package exercise.E07Modelos_de_datos_Many_to_Many.repos;

import exercise.E07Modelos_de_datos_Many_to_Many.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
