package com.facu.restprueba.controllers;

import com.facu.restprueba.entities.Libro;
import com.facu.restprueba.services.LibroServiceImpl;
import com.facu.restprueba.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl >{

}
