package com.springjpaeducandoweb.springjpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpaeducandoweb.springjpacourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
