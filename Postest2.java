package postest2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class barang{
    private String namaBarang,merk;
    private int noSeri ;
    private double hargaBarang;
    
    barang(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        this.namaBarang = namaBarang;
        this.merk = merk;
        this.noSeri = noSeri;
        this.hargaBarang = hargaBarang;
    }
    
    public void setnamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setnoSeri(int noSeri){
        this.noSeri = noSeri;
    }
    
    public void setnamaBarang(double hargaBarang){
        this.hargaBarang = hargaBarang;
    }
    
    public String getnamaBarang(){
        return this.namaBarang;
    }
    public double gethargaBarang(){
        return hargaBarang;
    }
    public int getnoSeri(){
        return this.noSeri;
    }
    public String getmerk(){
        return this.merk;
    }
    
    public String toString(){
        return getnoSeri() +"        "+getnamaBarang()+"       "+getmerk()+"     "+gethargaBarang()+"\n";
    }
    
}
       
public class Postest2 {
 public static void main(String[] args) {
        // TODO code application logic here
        int inputUser,noSeri;
        String merk,namaBarang;
        double hargaBarang;
        boolean cari;
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        List<barang> br = new ArrayList<barang>();
        
        do{
            System.out.println("--------Sistem Pemesanan Spare Part Motor--------");
            System.out.println("--------Selamat Datang Di Menu Admin--------");
            System.out.println("1.Tambah Data Barang (Create)");
            System.out.println("2.Lihat Data Barang(Read)");
            System.out.println("3.Ubah Data Barang(Update)");
            System.out.println("4.Hapus data Barang(Delete)");
            System.out.println("0.Keluar dari progeam");
            System.out.print("Silahkan Masukan Pilihan Menu (1-4) : ");
            inputUser = inputInt.nextInt();
            switch(inputUser){
                case 0:
                    System.out.println("Program Berhenti");
                    break;
                case 1:
                    System.out.print("No Seri Barang : ");
                    int nS = inputInt.nextInt();
                    System.out.print("Nama Barang : ");
                    String nB = inputStr.nextLine();
                    System.out.print("Merk Barang : ");
                    String Me = inputStr.nextLine();
                    System.out.print("Harga Barang : ");
                    double hB = inputInt.nextDouble();
                    
                    br.add(new barang(nB,Me,nS,hB));
                    break;
                case 2:
                    Iterator<barang> i = br.iterator();
                    System.out.println("-------Data Barang-------");
                    System.out.println("no seri     nama     merk     harga");
                    while(i.hasNext()){
                        barang brg = i.next();
                        System.out.print(brg);
                    }
                    break;
                    
                case 3:
                    System.out.println("Silahkan Masukan No Seri barang yang ingin di update : ");
                    noSeri = inputInt.nextInt();
                    ListIterator<barang> li = br.listIterator();
                    while(li.hasNext()){
                        barang brg = li.next();
                        if(brg.getnoSeri()== noSeri){
                            System.out.print("Masukan nama baru : ");
                            nB = inputStr.nextLine();
                            System.out.print("Masukan merk baru : ");
                            Me = inputStr.nextLine();
                            System.out.print("Masukan harga baru : ");
                            hB = inputInt.nextDouble();
                            li.set(new barang(nB,Me,noSeri,hB));
                            
                            System.out.println("data berhasil diubah !!!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    cari = false;
                    System.out.println("Masukan No Seri barang yang ingin di hapus : ");
                    noSeri = inputInt.nextInt();
                    i = br.iterator();
                    while(i.hasNext()){
                        barang brg = i.next();
                        if(brg.getnoSeri()== noSeri){
                            i.remove();
                            cari = true;
                            System.out.println("Data Berhasil di Hapus");
                        }
                    }
                    break;
                default :
                    System.out.println("Pilihan Anda Salah!!!");
            
            }
        }while(inputUser != 0);
                
    }
    
}
