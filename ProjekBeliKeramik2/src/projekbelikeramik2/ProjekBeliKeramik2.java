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
public class ProjekBeliKeramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses membuat obyek*/
        Keramik2 kerA = new Keramik2(54000, 30, 30, 100000, 10);
        
        kerA.hitungLuasKeramik();
        kerA.hitungLuasKeramikSatuBox();
        kerA.hitungKebutuhanKeramik();
        kerA.hitungHargaTotalKeramik();
                
        Keramik2 kerB = new Keramik2(65000, 40, 40, 100000, 5);
        
        kerB.hitungLuasKeramik();
        kerB.hitungLuasKeramikSatuBox();
        kerB.hitungKebutuhanKeramik();
        kerB.hitungHargaTotalKeramik();
        
        Keramik2 kerC = new Keramik2(60000, 30, 40, 100000, 8);
        
        kerC.hitungLuasKeramik();
        kerC.hitungLuasKeramikSatuBox();
        kerC.hitungKebutuhanKeramik();
        kerC.hitungHargaTotalKeramik();}
    
}
