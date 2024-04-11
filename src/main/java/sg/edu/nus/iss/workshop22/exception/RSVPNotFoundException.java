package sg.edu.nus.iss.workshop22.exception;

public class RSVPNotFoundException  extends RuntimeException{
    public RSVPNotFoundException() {
        super();
    }

    public RSVPNotFoundException(String msg){
        super(msg);
    }
}
