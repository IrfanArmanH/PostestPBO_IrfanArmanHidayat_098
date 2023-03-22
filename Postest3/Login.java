
package postest2;
import java.util.Scanner;


public class Login extends User{
    Scanner inputStr = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    public Login (String nama,int password){
    super(nama,password);
    }
    public void MenuLogin(){
        System.out.println("-----Menu Login Spare Part Motor------");
        System.out.print("Nama : ");
        String nama = inputStr.nextLine();
        System.out.print("Password : ");
        int password = inputStr.nextInt();
    }
    
}
