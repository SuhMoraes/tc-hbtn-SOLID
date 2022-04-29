package repository;

import model.Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContaRepositoyTest {

    private ContaRepository contaRepository;

    @Test
    public void deveraSalvarUmaContaComSucesso(){

        Conta conta = new Conta(1, "Mariana Ferreira", 650.0, 300.0);

        Conta resposta = contaRepository.salvar(conta);

        assertTrue(1 == resposta.getId());
        assertEquals("Mariana Ferreira" , resposta.getNome());
        assertTrue(650.0 == resposta.getSaldo());
        assertTrue(300.0 == resposta.getLimite());
    }

    @Test
    public void deveraRetornarUmaContaPorIdComSucesso(){

        int id = 2;

        Conta resposta = contaRepository.findById(id);

        assertTrue(2 == resposta.getId());
        assertEquals("Lucimara Correia" , resposta.getNome());
        assertTrue(750.0 == resposta.getSaldo());
        assertTrue(200.0 == resposta.getLimite());
    }

    public Conta instaciaConta(){
        Conta conta = new Conta();
        conta.setId(1);
        conta.setNome("Mariana Ferreira");
        conta.setSaldo(650.0);
        conta.setLimite(300.0);

        return conta;
    }
}
