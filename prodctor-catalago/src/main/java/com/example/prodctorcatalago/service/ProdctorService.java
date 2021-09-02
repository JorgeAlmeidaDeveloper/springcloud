package com.example.prodctorcatalago.service;

import com.example.prodctorcatalago.model.Prodctor;
import com.example.prodctorcatalago.repository.ProdctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProdctorService {



    @Autowired
    ProdctorRepository prodctorRepository;

    public ProdctorService(ProdctorRepository prodctorRepository) {
        this.prodctorRepository = prodctorRepository;
    }


    public Prodctor crtProdcto(Prodctor prodctor){
        return prodctorRepository.save(prodctor);
    }

    public Prodctor updProdcto(Prodctor prodctor){
        return prodctorRepository.save(prodctor);
    }

    public List<Prodctor> lstProdctor(){
        return (List<Prodctor>) prodctorRepository.findAll();
    }

    public Optional<Prodctor> lstProdctorId(Long lstId){
        return prodctorRepository.findById(lstId);
    }

    public void dltProdctor(Long idProdctor){
        prodctorRepository.deleteById(idProdctor);
    }






}
