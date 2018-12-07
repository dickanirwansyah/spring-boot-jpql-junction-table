package com.dicka.springbootjuctiontable.controller;

import com.dicka.springbootjuctiontable.entity.Produk;
import com.dicka.springbootjuctiontable.entity.ProdukKategori;
import com.dicka.springbootjuctiontable.repo.ProdukKategoriRepo;
import com.dicka.springbootjuctiontable.repo.ProdukRepo;
import com.dicka.springbootjuctiontable.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/produk")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @Autowired
    private ProdukRepo produkRepo;

    @Autowired
    private ProdukKategoriRepo produkKategoriRepo;

    @GetMapping
    public List<Produk> listProduk(){
        return produkRepo.findAllProduk();
    }

    @GetMapping(value = "/pk")
    public List<ProdukKategori> listProdukKategori(){
        return produkKategoriRepo.findAll();
    }
}
