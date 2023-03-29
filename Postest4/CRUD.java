
package postest4_098;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CRUD extends Barang{
    protected boolean cari;
    protected int inputUser,noSeri;
    public CRUD(String namaBarang,String merk,int noSeri,double hargaBarang)  {
        super(namaBarang,merk,noSeri,hargaBarang);
    }
    public void menuAdmin(){
        
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Customer produk = new Customer("","",0,0,"");
        List<Barang> br = new ArrayList<Barang>();
    
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
                    
                    br.add(new Barang(nB,Me,nS,hB));
                    br.add(new Customer(nB,Me,nS,hB,""));
                    break;
                case 2:
                    Iterator<Barang> i = br.iterator();
                    System.out.println("-------Data Barang-------");
                    System.out.println("no seri     nama     merk     harga");
                    while(i.hasNext()){
                        Barang brg = i.next();
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
                            nB = inputStr.nextLine();
                            System.out.print("Masukan merk baru : ");
                            Me = inputStr.nextLine();
                            System.out.print("Masukan harga baru : ");
                            hB = inputInt.nextDouble();
                            li.set(new Barang(nB,Me,noSeri,hB));
                            
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
                        Barang brg = i.next();
                        if(brg.getNoSeri()== noSeri){
                            i.remove();
                            cari = true;
                            System.out.println("Data Berhasil di Hapus");
                        }
                    }
                    break;
                case 5 :
                    Login log = new Login();
                    log.MenuLogin();
                    break;
                default :
                    System.out.println("Pilihan Anda Salah!!!");
            
            }
        }while(inputUser != 0);
        
}
    }
        
        

