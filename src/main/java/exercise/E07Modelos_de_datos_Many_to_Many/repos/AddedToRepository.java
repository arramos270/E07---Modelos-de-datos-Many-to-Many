package exercise.E07Modelos_de_datos_Many_to_Many.repos;

import exercise.E07Modelos_de_datos_Many_to_Many.model.AddedTo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, Long> {
}
