package exception;

public class ContaNotFoundException extends RuntimeException{

    public ContaNotFoundException(String msg){
        super(msg);
    }
}