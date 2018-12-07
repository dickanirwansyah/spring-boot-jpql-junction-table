package com.dicka.springbootjuctiontable.repo;

import com.dicka.springbootjuctiontable.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KategoriRepo extends JpaRepository<Kategori, Integer> {


    //List<Kategori> findAllKategori();
}
