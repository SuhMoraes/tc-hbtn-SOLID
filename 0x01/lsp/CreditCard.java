public class CreditCard extends BankCard {
    @Override
    public void validate() throws Exception {
        super.validate();
        System.out.println("Verificando Limite!");
        System.out.println("Limite disponível!");
    }
}
