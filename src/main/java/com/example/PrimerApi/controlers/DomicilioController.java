package com.example.PrimerApi.controlers;

import com.example.PrimerApi.entities.Domicilio;
import com.example.PrimerApi.services.DomiclioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path= "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomiclioServiceImpl> {
}
