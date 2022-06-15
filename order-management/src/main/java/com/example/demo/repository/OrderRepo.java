package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Order;


@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
	
    @Query
	List<Order> findByPin(int pin);

}
