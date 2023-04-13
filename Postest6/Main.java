

package postest5;
import java.util.Scanner;
class Login{
    
    
    public final void MenuLogin(){
        
        final int inputUser;
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Login login = new Login();
        login.validasi("login");
        System.out.println("  Login Sebagai : ");
        System.out.println("  1.Customer");
        System.out.println("  2.Admin\n");
        System.out.print("  Masukan Pilihan anda(1/2) : ");
        inputUser = inputInt.nextInt();
        
        switch(inputUser){
            case 1 :
                System.out.print("Masukan Nama : ");
                String username = inputStr.nextLine();
                System.out.print("Masukan Password : ");
                String password = inputStr.nextLine();
                System.out.println("Press enter to continue");
                new Scanner(System.in).nextLine();
                System.out.print("Masukan no HP : ");
                int noHp = inputInt.nextInt();
                Login customer = new customer();
                customer.validasi(username);
                Login log = new Login();
                log.identity(noHp);
                Customer pelanggan = new Customer("","",0,0);
                pelanggan.menuCustomer(username);
                
                break;
            case 2 :
                System.out.print("  Masukan Nama : ");
                String usernameA = inputStr.nextLine();
                System.out.print("  Masukan Password : ");
                String passwordA = inputStr.nextLine();
                cek(usernameA,passwordA);
                break;
            
        }
    }
    public static void cek(String usnm,String pw){
        if (usnm.equals("admin") ){
            if(pw.equals("admin")){  
                System.out.print("  Masukan Nama Admin : ");
                Scanner inputInt = new Scanner(System.in);
                Scanner inputStr = new Scanner(System.in);
                String nama = inputStr.nextLine();
                Login Admin = new Admin();
                Admin.validasi(usnm);
                Login log = new Login();
                log.identity(nama);
                CRUD admin = new CRUD("","",0,0);
                admin.menuAdmin();
            }else{
                System.out.println("Password salah!!!");
                MenuLogin();
            }
        }else{
            System.out.println("Username salah!!");
            MenuLogin();
        }
    }
    //overloading
    public void identity(String nama){
        
        System.out.println("Nama Admin : "+nama);
    }
    //overloading
    public void identity(int noHP){
        System.out.println("No Hp User : "+noHP);
    }
    
    public static void validasi(String Username){
            System.out.println(" ->Menu Login");
        }  

class customer extends Login{
    @Override
    public void validasi(String Username){
        System.out.println("------- Sistem Pemesanan Spare Part Motor   --------");
        System.out.println("-------  Selamat Datang Di Menu Customer  --------\n");
        System.out.println("User : "+Username);
        
    }
}

class Admin extends Login{
    @Override
    public void validasi(String Username){
        System.out.println("--------  Sistem Pemesanan Spare Part Motor  --------");
        System.out.println("--------    Selamat Datang Di Menu Admin  --------\n");
        System.out.println("User : "+Username);
    }
}
}





public final class Main {
    
    public static void main(String[] args) {
    Login log = new Login();
    log.MenuLogin();
        
    
    
    }
    
}


