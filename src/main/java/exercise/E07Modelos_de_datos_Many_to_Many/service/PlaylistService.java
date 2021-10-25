package exercise.E07Modelos_de_datos_Many_to_Many.service;

import exercise.E07Modelos_de_datos_Many_to_Many.model.Playlist;
import exercise.E07Modelos_de_datos_Many_to_Many.repos.PlaylistRepository;
import exercise.E07Modelos_de_datos_Many_to_Many.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService  extends BaseService<Playlist, Long, PlaylistRepository> {
}
