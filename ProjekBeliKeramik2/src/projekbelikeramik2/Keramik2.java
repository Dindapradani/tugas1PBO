/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekbelikeramik2;

/**
 *
 * @author asus
 */
   
public class Keramik2 {
/*membuat atribut*/
int hargaKeramik;
int panjangKeramik;
int lebarKeramik;
int luasLantai;
int jumlahKeramikperBox;

/*constructor*/
Keramik2(int h, int p, int l, int k, int j){
    this.hargaKeramik = h;
    this.panjangKeramik = p;
    this.lebarKeramik = l;
    this.luasLantai = k;
    this.jumlahKeramikperBox = j;
    
}

/*membuat methods*/
int hitungLuasKeramik(){
    int luasSatuanKeramik;
    luasSatuanKeramik= this.panjangKeramik * this.lebarKeramik;
    return luasSatuanKeramik;    
}
int hitungLuasKeramikSatuBox() {
    int luasSatuBoxKeramik;
    luasSatuBoxKeramik= this.jumlahKeramikperBox * this.hitungLuasKeramik();
    return luasSatuBoxKeramik;
}
int hitungKebutuhanKeramik(){
    double kebutuhanKeramik;
    kebutuhanKeramik = Math.ceil((double)this.luasLantai / this.hitungLuasKeramikSatuBox());
    return (int) kebutuhanKeramik;
}
void hitungHargaTotalKeramik(){
    int hargaTotalKeramik;
    hargaTotalKeramik = this.hargaKeramik * this.hitungKebutuhanKeramik() ;
    System.out.println("Harga Total Kebutuhan Keramik: " + hargaTotalKeramik + " rupiah");
    
}
}
