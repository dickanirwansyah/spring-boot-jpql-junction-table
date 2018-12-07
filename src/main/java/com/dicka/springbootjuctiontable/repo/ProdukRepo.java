package com.dicka.springbootjuctiontable.repo;

import com.dicka.springbootjuctiontable.entity.Produk;
import com.dicka.springbootjuctiontable.entity.ProdukKategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdukRepo extends JpaRepository<Produk, Integer> {

    /** with join produk kategories **/
    @Query("SELECT p, pk FROM Produk p JOIN p.produkKategoris pk")
    List<Produk> findAllProduk();
}
