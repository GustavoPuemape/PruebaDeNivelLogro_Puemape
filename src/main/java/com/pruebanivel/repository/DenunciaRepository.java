package com.pruebanivel.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebanivel.entity.Denuncia;

import java.util.List;

@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Integer>{
    List<Denuncia> findByTituloContaining(String titulo, Pageable pageable);

}
