package com.example.PrimerApi.services;


import com.example.PrimerApi.entities.Libro;
import org.springframework.stereotype.Service;

@Service
public interface LibroService extends BaseService<Libro, Long> {
}
