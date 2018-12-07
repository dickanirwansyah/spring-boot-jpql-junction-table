package com.dicka.springbootjuctiontable.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ProdukKategoriId implements Serializable{

    /** get id produk **/
    @ManyToOne
    private Produk produk;
    /** get id kategori **/
    @ManyToOne
    private Kategori kategori;

    public Produk getProduk(){
        return produk;
    }

    public void setProduk(Produk produk){
        this.produk = produk;
    }

    public Kategori getKategori(){
        return kategori;
    }

    public void setKategori(Kategori kategori){
        this.kategori = kategori;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdukKategoriId that = (ProdukKategoriId) o;

        if (produk != null ? !produk.equals(that.produk) : that.produk != null) return false;
        if (produk != null ? !produk.equals(that.produk) : that.produk != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (produk != null ? produk.hashCode() : 0);
        result = 31 * result + (produk != null ? produk.hashCode() : 0);
        return result;
    }
}
