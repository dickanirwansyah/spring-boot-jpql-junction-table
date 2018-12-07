package com.dicka.springbootjuctiontable;

import com.dicka.springbootjuctiontable.entity.Kategori;
import com.dicka.springbootjuctiontable.entity.Produk;
import com.dicka.springbootjuctiontable.entity.ProdukKategori;
import com.dicka.springbootjuctiontable.repo.KategoriRepo;
import com.dicka.springbootjuctiontable.repo.ProdukRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Date;

@SpringBootApplication
public class SpringBootJuctionTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJuctionTableApplication.class, args);
	}
}

/**
@Component
class CommandLine implements CommandLineRunner{

	@Autowired
	KategoriRepo kategoriRepo;

	@Autowired
	ProdukRepo produkRepo;

	@Override
	public void run(String... args) throws Exception {
		Produk produk = new Produk();
		produk.setProdukCode("p/001");
		produk.setProdukName("Iphone 4");

		Kategori kategori = new Kategori("gadged");
		kategoriRepo.save(kategori);

		ProdukKategori produkKategori = new ProdukKategori();
		produkKategori.setProduk(produk);
		produkKategori.setKategori(kategori);
		produkKategori.setCreatedBy("dicka nirwansyah");
		produkKategori.setCreatedDate(new Date());

		produk.getProdukKategoris().add(produkKategori);
		produkRepo.save(produk);
	}
}
 **/
