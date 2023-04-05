
package postest5;


public abstract class Barang {
    protected String namaBarang,merk;
    protected int noSeri ;
    protected double hargaBarang;
    
    Barang(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        this.namaBarang = namaBarang;
        this.merk = merk;
        this.noSeri = noSeri;
        this.hargaBarang = hargaBarang;
    }

//    public String getNamaBarang() {
//        return namaBarang;
//    }
//
//    public void setNamaBarang(String namaBarang) {
//        this.namaBarang = namaBarang;
//    }
//
//    public String getMerk() {
//        return merk;
//    }
//
//    public void setMerk(String merk) {
//        this.merk = merk;
//    }
//
//    public int getNoSeri() {
//        return noSeri;
//    }
//
//    public void setNoSeri(int noSeri) {
//        this.noSeri = noSeri;
//    }
//
//    public double getHargaBarang() {
//        return hargaBarang;
//    }
//
//    public void setHargaBarang(double hargaBarang) {
//        this.hargaBarang = hargaBarang;
//    }
//   
    abstract void setNamaBarang(String namaBarang);
    abstract void setMerk(String merk);
    abstract void setNoSeri(int noSeri);
    abstract void setHargaBarang(double hargaBarang);
    abstract String getNamaBarang();
    abstract int getNoSeri();
    abstract String getMerk();
    abstract double getHargaBarang();
    public String toString(){
        return noSeri+"        "+namaBarang+"       "+merk+"     "+hargaBarang+"\n";
    }
    
    
    
}
