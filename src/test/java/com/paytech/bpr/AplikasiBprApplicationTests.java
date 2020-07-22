/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.bpr;

import com.paytech.bpr.Entity.*;
import com.paytech.bpr.Service.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author denigunawan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AplikasiBprApplicationTests extends TestCase {
    @Autowired
    private AgamaService agamaService;

    @Autowired
    private PendidikanService pendidikanService;

    @Autowired
    private WilayahService wilayahService;

    @Autowired
    private UserService userService;

    @Autowired
    private NasabahService nasabahService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void SimpanData() {

        Agama islam = new Agama(null, "Islam", "muslim",
                Timestamp.valueOf(LocalDateTime.now()), "deni");
        agamaService.save(islam);

        Agama kristen = new Agama(null, "kristen", "protestan",
                Timestamp.valueOf(LocalDateTime.now()), "deni");
        agamaService.save(kristen);

        List<Agama> daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(), 2);

        List<Agama> daftarAgamaByNamaOrDesk = agamaService.mencariBerdasarkanNamaAtauDeskripsi("Islam");
        assertEquals(daftarAgamaByNamaOrDesk.size(), 1);

//        agamaService.updateById(kristen.getId(), "budha", "agama");
//        agamaService.findById(kristen.getId());
//        assertEquals(kristen.getNama(), "Budha");
//        assertEquals(kristen.getDeskripsi(), "agama");

        islam = agamaService.findByNama("Islam");
        assertNotNull(islam);

    }


        // ini adalah fungsi test hapus
//        agamaService.delete(daftarAgama);
//        daftarAgama = agamaService.findAll();
//        assertEquals(daftarAgama.size(), 0);


//    }

     @Test
 public void testPendidikan(){
        List<Pendidikan> daftarPendidikan = pendidikanService.findAll();
        assertEquals(daftarPendidikan.size(), 7);
 }

 @Test
    public  void testWilayah(){
        List<Provinsi> daftarWilayah = this.wilayahService.findAllProvinsi();
        assertEquals(daftarWilayah.size(), 3);

//           Provinsi jawaBarat  =  this.wilayahService.findProvinsiById("001");
//            assertNotNull(jawaBarat);
//            assertEquals(2, jawaBarat.getListKota().size());

        List<KotaKabupaten> daftarKota = this.wilayahService.findAllKotaKabupaten();
        assertEquals( daftarWilayah.size(), 3);

        daftarKota.forEach((k) -> {
            System.out.println(k.toString());
        });
    }

    @Test
    public  void testUser(){
            List<RoleSecurity>  roles  =   this.userService.listRole();
            assertEquals(2, roles.size());
            List<UserSecurity>  users = this.userService.findUser();
            assertEquals(2, users.size());

            UserSecurity admin = this.userService.findByUserName("admin");
            assertNotNull(admin);
            assertEquals(2, admin.getListRole().size());

            UserSecurity deni = this.userService.findByUserName("deni");
            assertNotNull(deni);
            assertEquals(1, deni.getListRole().size());
    }

    @Test
    public  void  testSimpanNasabah(){
        NasabahPerorangan deni = new NasabahPerorangan();
        deni.setNamaLengkap("Deni Gunawan");
        deni.setJenisKelamin("L");
        deni.setNomerIdentitas("08569583625");
        deni.setAlamat("Jl. assyafiiyah 2 ");
        deni = this.nasabahService.save(deni);
        assertNotNull(deni.getId());

//        deni  = this.nasabahService.findPeroranganById(deni.getId());
//        assertNotNull(deni);
//         Optional<NasabahBadanUsaha> bukan = this.nasabahService.findBadanUsahaById(deni.getId());
//         assertNull(bukan);
////         this.nasabahService.delete(deni);

            NasabahBadanUsaha tabeldata = new NasabahBadanUsaha();
            tabeldata.setNamaLengkap("tabel data informasi");
            tabeldata.setNomorNpwp("12454654");
            tabeldata.setAlamat("jl wehrwj  no 242");
            tabeldata =   this.nasabahService.save(tabeldata);
            assertNotNull(tabeldata.getId());
//            this.nasabahService.delete(tabeldata);
    }

}