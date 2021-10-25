package exercise.E07Modelos_de_datos_Many_to_Many.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddedToPK implements Serializable {

    private Long artist_id;

    private Long song_id;
}
