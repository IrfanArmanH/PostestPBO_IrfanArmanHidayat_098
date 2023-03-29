
package postest4_098;


public class Barang {
    private String namaBarang,merk;
    private int noSeri ;
    private double hargaBarang;
    
    Barang(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        this.namaBarang = namaBarang;
        this.merk = merk;
        this.noSeri = noSeri;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getNoSeri() {
        return noSeri;
    }

    public void setNoSeri(int noSeri) {
        this.noSeri = noSeri;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    public String toString(){
        return getNoSeri() +"        "+getNamaBarang()+"       "+getMerk()+"     "+getHargaBarang()+"\n";
    }
}
