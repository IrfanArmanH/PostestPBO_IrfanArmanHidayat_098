
package postest2;


public class User {
    private String nama;
    private int password;
    public User(String nama,int password){
    this.nama = nama;
    this.password = password ;
    
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
}
