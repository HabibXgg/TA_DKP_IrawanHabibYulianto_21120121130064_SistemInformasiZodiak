package com.TugasAkhir;

public class Zodiak {
    private int tanggal;
    private String bulan;
    String zodiak,sifat,keterangan;
    dataZodiak data = new dataZodiak();


    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public void zodiak(){
        if (getTanggal()> 21 && getBulan()== "Desember" || getTanggal() <= 19 && getBulan() == "Januari"){
            zodiak = (data.zodiak1[0]);
            sifat = (data.sifat[0]);
            keterangan = (data.keterangan[0]);
        }
        else if(getTanggal()> 20 && getBulan()== "Januari" || getTanggal() <= 18 && getBulan() == "Februari"){
            zodiak = (data.zodiak1[1]);
            sifat = (data.sifat[1]);
            keterangan = (data.keterangan[1]);
        }
        else if(getTanggal()> 19 && getBulan()== "Februari" || getTanggal() <= 20 && getBulan() == "Maret"){
            zodiak = (data.zodiak1[2]);
            sifat = (data.sifat[2]);
            keterangan = (data.keterangan[2]);
        }
        else if(getTanggal()> 21 && getBulan()== "Maret" || getTanggal() <= 20 && getBulan() == "April"){
            zodiak = (data.zodiak1[3]);
            sifat = (data.sifat[3]);
            keterangan = (data.keterangan[3]);;
        }
        else if(getTanggal()> 21 && getBulan()== "April" || getTanggal() <= 20 && getBulan() == "Mei"){
            zodiak = (data.zodiak1[4]);
            sifat = (data.sifat[4]);
            keterangan = (data.keterangan[4]);
        }
        else if(getTanggal()> 21 && getBulan()== "Mei" || getTanggal() <= 20 && getBulan() == "Juni"){
            zodiak = (data.zodiak1[5]);
            sifat = (data.sifat[5]);
            keterangan = (data.keterangan[5]);
        }
        else if(getTanggal()> 21 && getBulan()== "Juni" || getTanggal() <= 20 && getBulan() == "Juli"){
            zodiak = (data.zodiak1[6]);
            sifat = (data.sifat[6]);
            keterangan = (data.keterangan[6]);
        }
        else if(getTanggal()> 21 && getBulan()== "Juli" || getTanggal() <= 20 && getBulan() == "Agustus"){
            zodiak = (data.zodiak1[7]);
            sifat = (data.sifat[7]);
            keterangan = (data.keterangan[7]);
        }
        else if(getTanggal()> 21 && getBulan()== "Agustus" || getTanggal() <= 22 && getBulan() == "September"){
            zodiak = (data.zodiak1[8]);
            sifat = (data.sifat[8]);
            keterangan = (data.keterangan[8]);
        }
        else if(getTanggal()> 23 && getBulan()== "September" || getTanggal() <= 20 && getBulan() == "Oktober"){
            zodiak = (data.zodiak1[9]);
            sifat = (data.sifat[9]);
            keterangan = (data.keterangan[9]);
        }
        else if(getTanggal()> 21 && getBulan()== "Oktober" || getTanggal() <= 22 && getBulan() == "November"){
            zodiak = (data.zodiak1[10]);
            sifat = (data.sifat[10]);
            keterangan = (data.keterangan[10]);
        }
        else if(getTanggal()> 23 && getBulan()== "November" || getTanggal() <= 20 && getBulan() == "Desember"){
            zodiak = (data.zodiak1[11]);
            sifat = (data.sifat[11]);
            keterangan = (data.keterangan[11]);
        }
    }
}