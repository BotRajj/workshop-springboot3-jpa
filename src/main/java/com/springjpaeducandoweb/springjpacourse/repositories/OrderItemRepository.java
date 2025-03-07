package com.springjpaeducandoweb.springjpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpaeducandoweb.springjpacourse.entities.OrderItem;
import com.springjpaeducandoweb.springjpacourse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
