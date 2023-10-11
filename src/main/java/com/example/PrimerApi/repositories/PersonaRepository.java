package com.example.PrimerApi.repositories;

import com.example.PrimerApi.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Notacion de metodo de query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);


    // Notacion JPQL parametros indexados
    @Query(value = "SELECT p FROM Persona p where p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p where p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    //Notacion Query Nativo

    @Query(value = "SELECT * FROM persona where persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
    nativeQuery = true)
    List<Persona> searchNat(@Param("filtro") String filtro);


    @Query(value = "SELECT * FROM persona where persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true)
    Page<Persona> searchNat(@Param("filtro") String filtro, Pageable pageable);

}
