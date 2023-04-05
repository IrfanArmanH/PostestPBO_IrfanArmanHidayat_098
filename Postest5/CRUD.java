
package postest5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CRUD extends Barang{
    protected boolean cari;
    protected int inputUser;
    
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
    
    public CRUD(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        super(namaBarang,merk,noSeri,hargaBarang);
    }
    public void menuAdmin(){
        int noSeri;
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        
//        List<Barang> br = new ArrayList<Barang>();
        List<CRUD> cr = new ArrayList<CRUD>();
        List<Customer> cs = new ArrayList<Customer>();
    
        do{
           
            System.out.println("1.Tambah Data Barang (Create)");
            System.out.println("2.Lihat Data Barang(Read)");
            System.out.println("3.Ubah Data Barang(Update)");
            System.out.println("4.Hapus data Barang(Delete)");
            System.out.println("5.Menu Login");
            System.out.println("0.Keluar dari program");
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
                    
                    cr.add(new CRUD(nB,Me,nS,hB));
                    cs.add(new Customer(nB,Me,nS,hB));
                    break;
                case 2:
                    Iterator<CRUD> i = cr.iterator();
                    System.out.println("-------Data Barang-------");
                    System.out.println("no seri     nama     merk     harga");
                    while(i.hasNext()){
                        CRUD crud = i.next();
                        System.out.print(crud);
                    }
                    break;
                    
                case 3:
                    System.out.println("Silahkan Masukan No Seri barang yang ingin di update : ");
                    noSeri = inputInt.nextInt();
                    ListIterator<CRUD> li = cr.listIterator();
                    
                    while(li.hasNext()){
//                        Barang brg = li.next();
                        CRUD crud = li.next();
                        if(crud.getNoSeri() == noSeri){
                            System.out.print("Masukan nama baru : ");
                            nB = inputStr.nextLine();
                            System.out.print("Masukan merk baru : ");
                            Me = inputStr.nextLine();
                            System.out.print("Masukan harga baru : ");
                            hB = inputInt.nextDouble();
                            li.set(new CRUD(nB,Me,noSeri,hB));
//                            Customer produkupdate = new Customer("","",0,0);
//                            li.set(new Customer(nB,Me,noSeri,hB));
                            
                            System.out.println("data berhasil diubah !!!");
                        }else{
                            System.out.println(" -> nomor seri yang anda masukan salah!!!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    cari = false;
                    System.out.println("Masukan No Seri barang yang ingin di hapus : ");
                    noSeri = inputInt.nextInt();
                    i = cr.iterator();
                    while(i.hasNext()){
                        CRUD crud = i.next();
                        if(crud.getNoSeri()== noSeri){
                            i.remove();
                            cari = true;
                            System.out.println("Data Berhasil di Hapus");
                        }else{
                            System.out.println("nomor seri yang anda masukan salah!!!");
                        }
                    }
                    break;
                case 5 :
                    Login login = new Login();
                    login.MenuLogin();
                    break;
                default :
                    System.out.println("Pilihan Anda Salah!!!");
            
            }
        }while(inputUser != 0);
        
}
    }
        
        

