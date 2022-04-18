/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikum.pkg2.modul.pkg2;

/**
 *
 * @author mimbu
 */
public class MainApp {
    public static void main(String[] args) {
        main Main = new main();

        double r = Main.setR(14d);
        System.out.println("Jari-jari : " +Main.getR());
        System.out.println("Diameter : "+Main.getD());
        System.out.println("Luas Permukaan: " +Main.getL());
        System.out.println("Volume Bola : " +Main.getV());
    }
}
/*==> var R
* ==>ShowD
* ==>ShowL
* ==>ShowV*/
