package exercise.E07Modelos_de_datos_Many_to_Many.service;

import exercise.E07Modelos_de_datos_Many_to_Many.model.Artist;
import exercise.E07Modelos_de_datos_Many_to_Many.repos.ArtistRepository;
import exercise.E07Modelos_de_datos_Many_to_Many.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
