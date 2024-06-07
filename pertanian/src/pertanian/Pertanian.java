/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertanian;
import penjualanObat.*;

/**
 *
 * @author ASUS
 */
public class Pertanian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        penjualan db = new penjualan();
//        db.simpanJual("", "", "", "", "");
//        db.dataJual("");

//        pembelian db = new pembelian();
//        db.simpanBeli("", "", "", "", "", "");
//        db.dataBeli("");

//        barang db = new barang();
//        db.simpanBarang("1", "sabun", "box", "700.000", "1.100.000");
//        db.dataBarang("");
    
        supplier db = new supplier();
        db.simpanSuplier("1", "PT BASIRIH", "JL. GUBERNUR SOEBARJO", "0511 2811 22", "basirih@company.com");
        db.dataSuplier("");
    }
    
}
