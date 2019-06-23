package com.crud.entreprise.services;

import com.crud.entreprise.entities.Product;
import com.crud.entreprise.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements  IProductService {

    @Autowired
    IProductRepository repository;

    @Override
    public void ajouter(Product product) {
        repository.save(product);
    }

    @Override
    public void modifier(Product product) {
        repository.saveAndFlush(product);
    }

    @Override
    public void supprimer(Product product) {
        repository.delete(product);
    }

    @Override
    public Optional<Product> findByID(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
