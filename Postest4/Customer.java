package postest4_098;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Customer extends Barang{
    private String nama;
    int inputUser,noSeri;
    
    public Customer(String namaBarang,String merk,int noSeri,double hargaBarang,String nama)  {
        super(namaBarang,merk,noSeri,hargaBarang);
        this.nama = nama;
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
            List<Customer> cs = new ArrayList<Customer>();
            List<Barang> br = new ArrayList<Barang>();
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
                        Barang brg = i.next();
                        System.out.print(brg);
                    }
                    
                    
                    
                    break;
                case 2:
                    Iterator<Customer> it = cs.iterator();
                    System.out.println("-------Data Pesanan-------");
                    System.out.println("no seri     nama     merk     harga");
                    while(it.hasNext()){
                        Customer brg = it.next();
                        System.out.print(brg);
                    }
                    break;
                    
                case 3:
                    System.out.println("Silahkan Masukan No Seri barang yang ingin di update : ");
                    noSeri = inputInt.nextInt();
                    ListIterator<Barang> li = br.listIterator();
                    while(li.hasNext()){
                        Barang brg = li.next();
                        if(brg.getNoSeri()== noSeri){
                            System.out.print("Masukan nama baru : ");
                            String nB = inputStr.nextLine();
                            System.out.print("Masukan merk baru : ");
                            String Me = inputStr.nextLine();
                            System.out.print("Masukan harga baru : ");
                            double hB = inputInt.nextDouble();
                            li.set(new Barang(nB,Me,noSeri,hB));
                            
                            System.out.println("data berhasil diubah !!!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    boolean cari = false;
                    System.out.println("Masukan No Seri barang yang ingin di hapus : ");
                    noSeri = inputInt.nextInt();
                    it = cs.iterator();
                    while(it.hasNext()){
                        Barang brg = it.next();
                        if(brg.getNoSeri()== noSeri){
                            it.remove();
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
    

