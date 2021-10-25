package exercise.E07Modelos_de_datos_Many_to_Many.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    //Ponemos el fetch EAGER y una relación bidireccional porque al traernos
    // un artista, queremos traernos todas sus canciones
    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Song> canciones = new ArrayList<>();

    public Artist(String nombre) {
        this.nombre = nombre;
    }
}
