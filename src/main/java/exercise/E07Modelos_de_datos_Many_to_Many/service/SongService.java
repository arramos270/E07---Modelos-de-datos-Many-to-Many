package exercise.E07Modelos_de_datos_Many_to_Many.service;

import exercise.E07Modelos_de_datos_Many_to_Many.model.Song;
import exercise.E07Modelos_de_datos_Many_to_Many.repos.SongRepository;
import exercise.E07Modelos_de_datos_Many_to_Many.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
