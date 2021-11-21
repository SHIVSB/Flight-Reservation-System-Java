import java.io.*;

class RegularTicket extends Ticket{
    private String specialService;

    super();
    public void getservice(){
        System.out.println(this.specialService);
    }
    public void setService(String serv){
        this.specialService = serv;
    }
}