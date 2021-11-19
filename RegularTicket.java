import java.io.*;

public class RegularTicket {
    public String specialService;

    public void getservice(){
        System.out.println(this.specialService);
    }
    public void setService(String serv){
        this.specialService = serv;
    }
}