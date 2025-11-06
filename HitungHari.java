/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MyBook SAGA 12
 */
public class HitungHari {

    public int hitung(int tahun, String bulan) {
        int hari = 0;
        switch (bulan) {
            case "Januari": case "Maret": case "Mei": case "Juli":
            case "Agustus": case "Oktober": case "Desember":
                hari = 31;
                break;
            case "April": case "Juni": case "September": case "November":
                hari = 30;
                break;
            case "Februari":
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    hari = 29; // tahun kabisat
                } else {
                    hari = 28;
                }
                break;
        }
        return hari;
    }
}




