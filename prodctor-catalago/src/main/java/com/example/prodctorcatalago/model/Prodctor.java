package com.example.prodctorcatalago.model;


//import org.springframework.data.elasticsearch.annotations.Document;

//@Document(indexName = "prodctot")

import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prodctor {

    @Id
    @Generated
    private Long id;
    private int quant;
    private String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
