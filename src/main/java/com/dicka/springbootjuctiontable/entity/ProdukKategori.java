package com.dicka.springbootjuctiontable.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRODUK_KATEGORI")
@AssociationOverrides({
        @AssociationOverride(name = "pk.produk",
            joinColumns = @JoinColumn(name = "PRODUK_ID")),
        @AssociationOverride(name = "pk.kategori",
            joinColumns = @JoinColumn(name = "KATEGORI_ID"))
})
public class ProdukKategori implements Serializable{

    @EmbeddedId
    private ProdukKategoriId pk = new ProdukKategoriId();

    @Transient
    private Produk produk;

    @Transient
    private Kategori kategori;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    public ProdukKategori(){}

    public ProdukKategoriId getPk(){
        return pk;
    }

    public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate = createdDate;
    }

    public String getCreatedBy(){
        return createdBy;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public void setPk(ProdukKategoriId pk){
        this.pk = pk;
    }

    public Produk getProduk(){
        return getPk().getProduk();
    }

    public void setProduk(Produk produk){
        getPk().setProduk(produk);
    }

    public Kategori getKategori(){
        return getPk().getKategori();
    }

    public void setKategori(Kategori kategori){
        getPk().setKategori(kategori);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ProdukKategori that = (ProdukKategori) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null)
            return false;

        return true;
    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
