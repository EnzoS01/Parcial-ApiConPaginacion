package com.example.PrimerApi.repositories;

import com.example.PrimerApi.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
