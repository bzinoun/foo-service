package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.FooDTO;
import java.util.List;

/**
 * Service Interface for managing Foo.
 */
public interface FooService {

    /**
     * Save a foo.
     *
     * @param fooDTO the entity to save
     * @return the persisted entity
     */
    FooDTO save(FooDTO fooDTO);

    /**
     *  Get all the foos.
     *  
     *  @return the list of entities
     */
    List<FooDTO> findAll();

    /**
     *  Get the "id" foo.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    FooDTO findOne(Long id);

    /**
     *  Delete the "id" foo.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
