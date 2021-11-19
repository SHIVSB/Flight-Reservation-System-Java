import java.io.*;

public class Contact extends Passenger {
    public String name;
    private int phone;
    private String email;

    public void getcontact(int phone){
        System.out.println("Passenger Details are as follows : ");
        System.out.println("Name : " + this.name);
        System.out.println("Phone : " + this.phone);
        System.out.println("Email : " + this.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}