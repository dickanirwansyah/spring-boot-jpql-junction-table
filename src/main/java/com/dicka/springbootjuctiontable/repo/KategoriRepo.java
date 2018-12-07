package com.dicka.springbootjuctiontable.repo;

import com.dicka.springbootjuctiontable.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategoriRepo extends JpaRepository<Kategori, Integer> {
}
