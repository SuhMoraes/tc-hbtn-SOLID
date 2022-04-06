public class BankCard implements IPayment {

    @Override
    public void validate() throws Exception {

    }

    public void collectPayment(){
        System.out.println("Pagamento Realizado");
    }


}
