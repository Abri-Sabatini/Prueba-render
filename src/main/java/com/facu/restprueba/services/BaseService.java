package com.facu.restprueba.services;

import com.facu.restprueba.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService  <E extends Base,ID extends Serializable>{

  // creamos todos los métodos Abstractos

// Para listar todos los registros
    public List<E> findAll() throws Exception;
    // Para buscar un registro en la base de Datos, pasando un id como parámetro
    public E findById(ID id) throws Exception;
    // Grabo la entidad genérica
    public E save(E entity) throws Exception;
    // Actualizo una entidad, pero previo la debo buscar en la base de datos
    public E update(ID id, E entity) throws Exception;

    // Elimino un entidad y le paso un id como parámetro
    public boolean delete(ID id) throws Exception;

}
