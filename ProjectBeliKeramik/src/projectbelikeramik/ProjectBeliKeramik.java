/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbelikeramik;

/**
 *
 * @author asus
 */
public class ProjectBeliKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses membuat obyek*/
        Keramik kerA = new Keramik();
        kerA.panjangKeramik = 30;
        kerA.lebarKeramik= 30;
        kerA.hargaKeramik= 54000;
        kerA.jumlahKeramikperBox = 10;
        kerA.luasLantai= 1000000;
        kerA.hitungLuasKeramik();
        kerA.hitungLuasKeramikSatuBox();
        kerA.hitungKebutuhanKeramik();
        kerA.hitungHargaTotalKeramik();
                
        Keramik kerB = new Keramik();
        kerB.panjangKeramik = 40;
        kerB.lebarKeramik= 40;
        kerB.hargaKeramik= 65000;
        kerB.jumlahKeramikperBox = 5;
        kerB.luasLantai= 1000000;
        kerB.hitungLuasKeramik();
        kerB.hitungLuasKeramikSatuBox();
        kerB.hitungKebutuhanKeramik();
        kerB.hitungHargaTotalKeramik();
        
        Keramik kerC = new Keramik();
        kerC.panjangKeramik = 30;
        kerC.lebarKeramik= 40;
        kerC.hargaKeramik= 60000;
        kerC.jumlahKeramikperBox = 8;
        kerC.luasLantai= 1000000;
        kerC.hitungLuasKeramik();
        kerC.hitungLuasKeramikSatuBox();
        kerC.hitungKebutuhanKeramik();
        kerC.hitungHargaTotalKeramik();
    }
}
