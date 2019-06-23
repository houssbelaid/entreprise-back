package com.crud.entreprise.services;

import com.crud.entreprise.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {


     void ajouter(Product product);
     void modifier(Product product);
     void supprimer(Product product);
     Optional<Product> findByID(Long id);
     List<Product> findAll();

}
