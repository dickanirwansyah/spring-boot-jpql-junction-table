package com.dicka.springbootjuctiontable.service;

import com.dicka.springbootjuctiontable.entity.Produk;
import com.dicka.springbootjuctiontable.repo.ProdukRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdukService {

    @Autowired
    private ProdukRepo produkRepo;

    public List<Produk> listProduk(){
        return produkRepo.findAll();
    }
}
