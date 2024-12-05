package com.Food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Food.Model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{


	
}