/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikum.modul.pkg2;

/**
 *
 * @author mimbu
 */
import tugas.praktikum.modul.pkg2.Bus;
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini=new Bus(10);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.getAverage(77);


    }
}