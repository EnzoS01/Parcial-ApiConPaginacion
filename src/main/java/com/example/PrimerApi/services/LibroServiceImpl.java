package com.example.PrimerApi.services;

import com.example.PrimerApi.entities.Libro;
import com.example.PrimerApi.repositories.BaseRepository;
import com.example.PrimerApi.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
