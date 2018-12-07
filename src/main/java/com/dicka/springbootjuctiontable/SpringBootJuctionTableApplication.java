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


@Component
class CommandLine implements CommandLineRunner{

	@Autowired
	KategoriRepo kategoriRepo;

	@Autowired
	ProdukRepo produkRepo;

	@Override
	public void run(String... args) throws Exception {
		Produk produk = new Produk();
		produk.setProdukCode("p/005");
		produk.setProdukName("Samsung Galaxy 1");

		Produk produk1 = new Produk();
		produk1.setProdukCode("p/003");
		produk1.setProdukName("Samsung Galaxy 2");

		Produk produk2 = new Produk();
		produk2.setProdukCode("p/004");
		produk2.setProdukName("Samsung Galaxy 3");

		Kategori kategori = new Kategori("notepad");
		kategoriRepo.save(kategori);

		ProdukKategori produkKategori = new ProdukKategori();
		produkKategori.setProduk(produk);
		produkKategori.setKategori(kategori);
		produkKategori.setCreatedBy("dicka nirwansyah");
		produkKategori.setCreatedDate(new Date());

		ProdukKategori produkKategori1 = new ProdukKategori();
		produkKategori1.setProduk(produk1);
		produkKategori1.setKategori(kategori);
		produkKategori1.setCreatedDate(new Date());
		produkKategori1.setCreatedBy("system");

		ProdukKategori produkKategori2 = new ProdukKategori();
		produkKategori2.setProduk(produk2);
		produkKategori2.setKategori(kategori);
		produkKategori2.setCreatedDate(new Date());
		produkKategori2.setCreatedBy("system");

		produk.getProdukKategoris().add(produkKategori);
		produk1.getProdukKategoris().add(produkKategori1);
		produk2.getProdukKategoris().add(produkKategori2);
		produkRepo.save(produk);
		produkRepo.save(produk1);
		produkRepo.save(produk2);
	}
}

