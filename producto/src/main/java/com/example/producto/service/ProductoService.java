package com.example.producto.service;

import com.example.producto.model.Producto;
import com.example.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public List<Producto> listar(){
        return repository.findAll();
    }

    public Optional<Producto> obtener(Long id){
        return repository.findById(id);
    }
}
