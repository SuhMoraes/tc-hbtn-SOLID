package service;

import model.Conta;
import repository.ContaRepository;

public class ContaService {

    private ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta salvar(Conta conta){
        return contaRepository.salvar(conta);
    }
}
