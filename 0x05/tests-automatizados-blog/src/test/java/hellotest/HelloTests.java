package hellotest;

import hello.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HelloTests {

    @Test
    public void  aoInformarUmNomeCompletoComoArgumentoDeveraRetornarUmaMensagemDeSaudacao(){

        // Cenario - tudo que precisamos para executar nossos testes
        Hello hello =  new Hello();

        // Execução de testes
        String resposta = hello.saudaPessoa("Maria");

        // Verificações
        Assertions.assertEquals("Olá Maria ! Seja Bem-vinda(o).", resposta);
    }
}
