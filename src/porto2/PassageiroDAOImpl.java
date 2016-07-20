/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto2;

/**
 *
 * @author newton
 */
public class PassageiroDAOImpl implements PassageiroDAO{
    private Passageiro[] passageiros = new Passageiro[10];
    
    public void inserir(Passageiro passageiro){
        if(passageiro.getCpf().equals("")){
            System.out.println("O campo CPF não pode estar vazio!");
            return;
        }
        boolean achou = false;
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null) {
                if (passageiros[i].getCpf().equals(passageiro.getCpf())) {
                    System.out.println("Passageiro já cadastrado!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < passageiros.length; i++) {
                if (passageiros[i] == null) {
                    passageiros[i] = passageiro;
                    System.out.println("Inserido com Sucesso!");
                    inseriu = true;
                    break;
                }
            }
            if(!inseriu){
                System.out.println("Não há mais espaço para novos cadastros! ");
            }
        }
    }

    public void remover(String cpf){
            for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null) {
                if (passageiros[i].getCpf().equals(cpf)) {
                    passageiros[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Passageiro passageiro){
        
    }

    public Passageiro consultar(String cpf){
        
        return null;
    }

    public Passageiro[] listar(){
        
        return passageiros;
    }
}
