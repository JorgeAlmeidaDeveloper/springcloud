package com.example.prodctorcatalago.repository;

import com.example.prodctorcatalago.model.Prodctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdctorRepository extends CrudRepository<Prodctor, Long> {


}
