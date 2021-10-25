package exercise.E07Modelos_de_datos_Many_to_Many.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> addedTos = new ArrayList<>();

}
