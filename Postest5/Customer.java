package postest5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Customer extends Barang{
    private String nama;
    int inputUser,noSeri;
    
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
    
    
    public Customer(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        super(namaBarang,merk,noSeri,hargaBarang);

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void menuCustomer(String Username){
        do{
            Scanner inputInt = new Scanner (System.in);
            Scanner inputStr = new Scanner (System.in);
            List<CRUD> cr = new ArrayList<CRUD>();
            List<Customer> cs = new ArrayList<Customer>();
            System.out.println("1.Tambah Data Pesanan (Create)");
            System.out.println("2.Lihat Data Pesanan(Read)");
            System.out.println("3.Ubah Data Pesanan(Update)");
            System.out.println("4.Hapus data Pesanan(Delete)");
            System.out.println("5.Menu Login");
            System.out.println("0.Keluar dari program");
            System.out.print("Silahkan Masukan Pilihan Menu (1-4) : ");
            inputUser = inputInt.nextInt();
            switch(inputUser){
                case 0:
                    System.out.println("Program Berhenti");
                    break;
                case 1:
                    Iterator<Customer> i = cs.iterator();
                    System.out.println("-------Data Barang-------");
                    System.out.println("no seri     nama     merk     harga");
                    while(i.hasNext()){
                        Customer cus = i.next();
                        System.out.print(cus);
                    }
                    break;
                    
                    
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Silahkan Masukan No Seri barang yang ingin di update : ");
                    noSeri = inputInt.nextInt();
                    ListIterator<Customer> li = cs.listIterator();
                    while(li.hasNext()){
                        Customer brg = li.next();
                        if(brg.getNoSeri()== noSeri){
                            System.out.print("Masukan nama baru : ");
                            String nB = inputStr.nextLine();
                            System.out.print("Masukan merk baru : ");
                            String Me = inputStr.nextLine();
                            System.out.print("Masukan harga baru : ");
                            double hB = inputInt.nextDouble();
                            li.set(new Customer(nB,Me,noSeri,hB));
                            
                            System.out.println("data berhasil diubah !!!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    boolean cari = false;
                    System.out.println("Masukan No Seri barang yang ingin di hapus : ");
                    noSeri = inputInt.nextInt();
//                    it = cs.iterator();
//                    while(it.hasNext()){
//                        Customer brg = it.next();
//                        if(brg.getNoSeri()== noSeri){
//                            it.remove();
//                            cari = true;
//                            System.out.println("Data Berhasil di Hapus");
//                        }
//                    }
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
    

