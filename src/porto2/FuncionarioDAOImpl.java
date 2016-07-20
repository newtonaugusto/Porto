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
public class FuncionarioDAOImpl implements FuncionarioDAO{
    private Funcionario[] funcionarios = new Funcionario[10];
    
    public void inserir(Funcionario funcionario){
        if(funcionario.getCpf().equals("")){
            System.out.println("O campo CPF não pode estar vazio!");
            return;
        }
        boolean achou = false;
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                if (funcionarios[i].getCpf().equals(funcionario.getCpf())) {
                    System.out.println("Funcionário já cadastrado!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < funcionarios.length; i++) {
                if (funcionarios[i] == null) {
                    funcionarios[i] = funcionario;
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
            for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                if (funcionarios[i].getCpf().equals(cpf)) {
                    funcionarios[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Funcionario funcionario){
        
    }

    public Funcionario consultar(String cpf){
        
        return null;
    }

    public Funcionario[] listar(){
        
        return funcionarios;
    }
}
