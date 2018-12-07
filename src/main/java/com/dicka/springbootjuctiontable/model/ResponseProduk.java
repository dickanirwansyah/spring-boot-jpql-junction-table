package com.dicka.springbootjuctiontable.model;

import com.dicka.springbootjuctiontable.entity.Kategori;
import com.dicka.springbootjuctiontable.entity.Produk;

import java.util.List;

public class ResponseProduk {

    private Produk produk;
    private List<Kategori> kategoris;

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk){
        this.produk = produk;
    }

    public List<Kategori> getKategoris(){
        return kategoris;
    }

    public void setKategoris(List<Kategori> kategoris){
        this.kategoris = kategoris;
    }
}
