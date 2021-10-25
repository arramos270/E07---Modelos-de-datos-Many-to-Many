package exercise.E07Modelos_de_datos_Many_to_Many;

import exercise.E07Modelos_de_datos_Many_to_Many.model.AddedTo;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Artist;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Playlist;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Song;
import exercise.E07Modelos_de_datos_Many_to_Many.service.AddedToService;
import exercise.E07Modelos_de_datos_Many_to_Many.service.ArtistService;
import exercise.E07Modelos_de_datos_Many_to_Many.service.PlaylistService;
import exercise.E07Modelos_de_datos_Many_to_Many.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test(){
        Optional<Artist> artistEX = artistService.findById(2L);

        artistEX.ifPresent(c -> {
            System.out.println("Artist: " + c.getNombre());
            System.out.println("Nº canciones:"+ c.getCanciones().size());
            c.getCanciones().forEach(a -> {
                System.out.println("\tCancion: " + a.getTitle() + " " + a.getArtist() + " " + a.getAlbum() + " " + a.getYear());
            } );
        });


        Optional<Song> unaCancion = songService.findById(5L);

        unaCancion.ifPresent(a -> {
            System.out.println("Canción: " + a.getTitle());
            System.out.println("Artista: " + a.getArtist().getNombre());
        });

        Artist artist1 = Artist.builder()
                .nombre("Melendi")
                .build();

        Artist artist2 = Artist.builder()
                .nombre("Imagine Dragons")
                .build();

        List<Song> canciones = List.of(
                Song.builder().title("Mi primer beso").artist(artist1).album("Tocado y Hundido").year("2001").build(),
                Song.builder().title("Radioactive").artist(artist2).album("Night Visions").year("2015").build()
        );

        Song song1 = Song.builder()
                .title("Tocado y Hundido")
                .artist(artist1).album("Tocado y Hundido")
                .year("2000")
                .build();

        Playlist playlist1 = Playlist.builder()
                .nombre("Canta en la ducha")
                .description("Canciones súper motivadoras para cantar en la ducha")
                .build();

        playlistService.save(playlist1);

        AddedTo addedTo1 = AddedTo.builder()
                .playlist(playlist1)
                .song(canciones.get(0))
                .datetime(LocalDate.now())
                .order(1)
                .build();


        song1 = addedToService.infoCancionesAgregadasAPlaylist(song1, playlist1);

    }
}
