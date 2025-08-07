package com.SistemaGestionMedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SistemaGestionMedica.entity.ItemReceta;

@Repository
public interface ItemRecetaRepository extends JpaRepository<ItemReceta, Long>{

}
