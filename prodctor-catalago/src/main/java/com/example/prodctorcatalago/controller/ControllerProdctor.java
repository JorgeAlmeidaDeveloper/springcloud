package com.example.prodctorcatalago.controller;


import com.example.prodctorcatalago.model.Prodctor;
import com.example.prodctorcatalago.service.ProdctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prodctor")
public class ControllerProdctor {


    ProdctorService prodctoService;

    @PostMapping
    @RequestMapping("/creat")
    public Prodctor crtProdctor(@RequestBody Prodctor prodctor){
        return prodctoService.crtProdcto(prodctor);
    }

    @PutMapping
    @RequestMapping("/update")
    public Prodctor updProdctor(@RequestBody Prodctor prodctor){
        return prodctoService.updProdcto(prodctor);

    }

    @GetMapping
    @RequestMapping("consultar")
    public List<Prodctor> lstProdctor(){
        return prodctoService.lstProdctor();
    }

    @GetMapping
    @RequestMapping("listarid")
    public Optional<Prodctor> lstProdctorId(@PathVariable Long lstId){
        return prodctoService.lstProdctorId(lstId);
    }



}
