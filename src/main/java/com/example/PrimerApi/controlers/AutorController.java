package com.example.PrimerApi.controlers;

import com.example.PrimerApi.entities.Autor;
import com.example.PrimerApi.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path= "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
