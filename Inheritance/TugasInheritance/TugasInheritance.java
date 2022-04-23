/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinheritance;

/**
 *
 * @author Fonda
 */
public class TugasInheritance {
    public static void main(String[] args) {
        Overload a = new Overload();
        Admin b = new Admin();
        newPegawai c = new newPegawai();
        
        c.nama();
        b.setNama("Diah");
        System.out.println("Nama = "+b.getNama());
        b.setJenisKelamin("Perempuan");
        System.out.println("Jenis Kelamin = "+b.getJenisKelamin());
        b.setId("333333");
        System.out.println("Nomor Pegawai = "+b.getId());
        c.pekerjaan();
        a.gaji("Admin");
        a.gaji("Admin", "Baik");
    }
    
}
