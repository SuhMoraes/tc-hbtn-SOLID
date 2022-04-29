package repository;

import model.Conta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class  ContaRepository  {

    private ContaRepository contaRepository;

    public Conta salvar(Conta conta){
        if(conta.getId() != null) {
            return new Conta(conta.getId(), conta.getNome(), conta.getSaldo(), conta.getLimite());
        }
        return conta;
    }

    public Conta findById(Integer id){
        for (Conta conta : this.getAll()){
            if(Objects.equals(conta.getId(), id)){
                return conta;
            }
        }
        return null;
    }

    private List<Conta> getAll() {
        return new ArrayList<>(Arrays.asList(
                new Conta(1, "Marlucy Mendes", 650.0, 200.0),
                new Conta(2, "Lucimara Correia", 750.0, 200.0),
                new Conta(3, "Fernando Lucas", 850.0, 200.0)
        ));
    }
}
