package exercise.E07Modelos_de_datos_Many_to_Many.service;

import exercise.E07Modelos_de_datos_Many_to_Many.model.AddedTo;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Playlist;
import exercise.E07Modelos_de_datos_Many_to_Many.model.Song;
import exercise.E07Modelos_de_datos_Many_to_Many.repos.AddedToRepository;
import exercise.E07Modelos_de_datos_Many_to_Many.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService  extends BaseService<AddedTo, Long, AddedToRepository> {

    public Song infoCancionesAgregadasAPlaylist(Song s, Playlist p) {

        p.getAddedTos().forEach(song -> {
            AddedTo a = AddedTo.builder()
                        .song(s)
                        .playlist(p)
                        .build();
            save(a);
        });
        return s;
    }
}
