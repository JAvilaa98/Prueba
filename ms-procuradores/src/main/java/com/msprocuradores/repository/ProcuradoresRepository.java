package com.msprocuradores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msprocuradores.entity.Procuradores;

@Repository
public interface ProcuradoresRepository extends JpaRepository<Procuradores,Integer> {

}
