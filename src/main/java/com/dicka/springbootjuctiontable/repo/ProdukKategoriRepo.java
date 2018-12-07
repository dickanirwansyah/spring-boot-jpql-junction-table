package com.dicka.springbootjuctiontable.repo;

import com.dicka.springbootjuctiontable.entity.ProdukKategori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdukKategoriRepo extends JpaRepository<ProdukKategori, Integer> {

    //List<ProdukKategori> findAllProdukKategori();

}
