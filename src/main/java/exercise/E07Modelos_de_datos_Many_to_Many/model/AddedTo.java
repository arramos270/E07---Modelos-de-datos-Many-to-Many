package exercise.E07Modelos_de_datos_Many_to_Many.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private LocalDate datetime;
    private int order;

    //HELPERS

    public void addToPlaylist(Playlist p){
        playlist = p;
        p.getAddedTos().add(this);
    }

    public void removeFromPlaylist(Playlist p){
        p.getAddedTos().remove(this);
        playlist = null;
    }

    public void addToSong(Song s){
        song = s;
        s.getAddedTos().add(this);
    }

    public void removeFromSong(Song s){
        s.getAddedTos().remove(this);
        song = null;
    }

    public void addPlaylistSong(Playlist playlist, Song song){
        addToPlaylist(playlist);
        addToSong(song);
    }

    public void removePlaylistSong(Playlist playlist, Song song){
        removeFromPlaylist(playlist);
        removeFromSong(song);
    }
}
