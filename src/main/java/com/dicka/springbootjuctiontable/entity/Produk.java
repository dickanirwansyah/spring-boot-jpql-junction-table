package com.dicka.springbootjuctiontable.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUK")
public class Produk implements Serializable{

    @Id
    @Column(name = "PRODUK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer produkId;

    @Column(name = "PRODUK_CODE")
    private String produkCode;

    @Column(name = "PRODUK_NAME")
    private String produkName;

    /** declare produk kategori one to many**/
    @OneToMany(fetch = FetchType.LAZY,
    mappedBy = "pk.produk", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ProdukKategori> produkKategoris = new HashSet<>();

    public Produk(){}

    public Produk(String produkCode, String produkName){
        this.produkCode = produkCode;
        this.produkName = produkName;
    }

    public Set<ProdukKategori> getProdukKategoris(){
        return produkKategoris;
    }

    public void setProdukKategoris(Set<ProdukKategori> produkKategoris){
        this.produkKategoris = produkKategoris;
    }

    public Integer getProdukId(){
        return produkId;
    }

    public void setProdukId(Integer produkId){
        this.produkId = produkId;
    }

    public String getProdukCode(){
        return produkCode;
    }

    public void setProdukCode(String produkCode){
        this.produkCode = produkCode;
    }

    public String getProdukName(){
        return produkName;
    }

    public void setProdukName(String produkName){
        this.produkName = produkName;
    }
}
