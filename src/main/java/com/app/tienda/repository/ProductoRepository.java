package com.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tienda.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
