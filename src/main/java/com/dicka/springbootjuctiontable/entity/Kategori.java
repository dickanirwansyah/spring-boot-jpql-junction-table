package com.dicka.springbootjuctiontable.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "KATEGORI")
public class Kategori implements Serializable{

    @Id
    @Column(name = "KATEGORI_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kategoriId;
    private String name;

    /** one to many produkkategori **/
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "pk.kategori",
            cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ProdukKategori> produkKategoris = new HashSet<>();

    public Kategori(){}

    public Kategori(String name){
        this.name = name;
    }

    public Integer getKategoriId(){
        return kategoriId;
    }

    public void setKategoriId(Integer kategoriId){
        this.kategoriId = kategoriId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
