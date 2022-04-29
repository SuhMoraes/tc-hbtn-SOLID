package model;

import exception.ContaLimiteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContaTest {

    @Test
    public void deveraInstaciarUmObjetoDoTipoConta(){

        // Preparação do cenaro
        Conta conta = new Conta();

        // Execução do teste
        conta.setId(1);
        conta.setNome("Mariana Ferreira");
        conta.setSaldo(2000.0);
        conta.setLimite(500.0);


        // Resultados obtidos do teste
        Assertions.assertTrue(1 == conta.getId());
        Assertions.assertEquals("Mariana Ferreira" , conta.getNome());
        Assertions.assertTrue(2000.0 == conta.getSaldo());
        Assertions.assertTrue(500.0 == conta.getLimite());

    }

    @Test
    public void deveraRetornarSucessoAoEfetuarDepositoEmUmaConta(){

//        // Preparação do cenaro
        Conta conta = this.instaciaConta();

//        // Execução do teste
       String resposta = conta.deposita(100.00);

        // Resultados obtidos do teste
        Assertions.assertTrue(750.00 == conta.getSaldo());
        Assertions.assertEquals("Depósito de 100.0 efetuado com sucesso", resposta);
    }

    @Test
    public void deveraRetornarUmaExceptionAoRealizarUmDepositoAcimaDoLimitePermitido(){

         // Preparação do cenário
         Conta conta = this.instaciaConta();

         try {
             // Execução do teste
             String resposta = conta.deposita(301.0);

         } catch (Exception e) {
             // Resultado obitdo do teste
             Assertions.assertTrue(ContaLimiteException.class == e.getClass());
             Assertions.assertEquals("Valor de deposito acima do limite permitido.", e.getMessage());
         } finally {
             Assertions.assertTrue(650.0 == conta.getSaldo());
         }
    }

    @Test
    public void deveraRetornarSucessoAoEfetuarOSaqueEmUmaConta(){

//        // Preparação do cenaro
        Conta conta = this.instaciaConta();

//        // Execução do teste
        String resposta = conta.saque(100.00);

        // Resultados obtidos do teste
        Assertions.assertEquals(550.00 , conta.getSaldo());
        Assertions.assertEquals("Saque de 100.0 efetuado com sucesso", resposta);
    }


    @Test
    public void deveraRetornarUmaExceptionAoRealizarUmSaqueAcimaDoLimitePermitido(){

        // Preparação do cenário
        Conta conta = this.instaciaConta();

        try {
            // Execução do teste
            String resposta = conta.saque(100.0);

        } catch (Exception e) {
            // Resultado obitdo do teste
            Assertions.assertTrue(ContaLimiteException.class == e.getClass());
            Assertions.assertEquals("Valor de saque acima do limite permitido.", e.getMessage());
        } finally {
            Assertions.assertTrue(550.0 == conta.getSaldo());
        }
    }

    // Criação de um objeto do tipo conta
    public Conta instaciaConta(){
        Conta conta = new Conta();
        conta.setId(1);
        conta.setNome("Mariana Ferreira");
        conta.setSaldo(650.0);
        conta.setLimite(300.0);

        return conta;
    }
}

