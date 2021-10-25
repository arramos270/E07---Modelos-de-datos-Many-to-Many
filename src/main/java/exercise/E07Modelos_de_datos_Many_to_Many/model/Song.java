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
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title, album, year;

    @ManyToOne
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTos = new ArrayList<>();

    public void addArtista(Artist a){
        this.artist = a;
        a.getCanciones().add(this);
    }

    public void removeArtista(Artist a){
        a.getCanciones().remove(this);
        this.artist = null;
    }
}
