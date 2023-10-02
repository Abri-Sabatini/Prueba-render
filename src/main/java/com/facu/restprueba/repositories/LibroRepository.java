package com.facu.restprueba.repositories;

import com.facu.restprueba.entities.Libro;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}
