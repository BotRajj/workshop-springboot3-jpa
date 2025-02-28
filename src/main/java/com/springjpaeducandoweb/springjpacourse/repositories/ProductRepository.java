package com.springjpaeducandoweb.springjpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpaeducandoweb.springjpacourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
