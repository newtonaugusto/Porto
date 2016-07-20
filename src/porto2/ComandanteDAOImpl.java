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
public class ComandanteDAOImpl implements ComandanteDAO{
    
    private Comandante[] comandantes = new Comandante[10];
    
    public void inserir(Comandante comandante){
        if(comandante.getCpf().equals("")){
            System.out.println("O campo CPF não pode estar vazio!");
            return;
        }
        boolean achou = false;
        for (int i = 0; i < comandantes.length; i++) {
            if (comandantes[i] != null) {
                if (comandantes[i].getCpf().equals(comandante.getCpf())) {
                    System.out.println("Comandante já cadastrado!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < comandantes.length; i++) {
                if (comandantes[i] == null) {
                    comandantes[i] = comandante;
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
            for (int i = 0; i < comandantes.length; i++) {
            if (comandantes[i] != null) {
                if (comandantes[i].getCpf() == cpf) {
                    comandantes[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Comandante comandante){
        
    }

    public Comandante consultar(String cpf){
        
        return null;
    }

    public Comandante[] listar(){
        
        return comandantes;
    }    
}
    