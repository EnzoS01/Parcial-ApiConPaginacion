package com.example.PrimerApi.controlers;

import com.example.PrimerApi.entities.Libro;
import com.example.PrimerApi.services.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path= "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
