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
public class LocalDAOImpl implements LocalDAO{
    private Local[] locais = new Local[10];
    
    public void inserir(Local local){
        boolean achou = false;
        for (int i = 0; i < locais.length; i++) {
            if (locais[i] != null) {
                if (locais[i].getCodigo()==(local.getCodigo())) {
                    System.out.println("Local já cadastrado!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < locais.length; i++) {
                if (locais[i] == null) {
                    locais[i] = local;
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

    public void remover(int codigo){
            for (int i = 0; i < locais.length; i++) {
            if (locais[i] != null) {
                if (locais[i].getCodigo() == codigo) {
                    locais[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Local local){
        
    }

    public Local consultar(int codigo){
        
        return null;
    }

    public Local[] listar(){
        
        return locais;
    }
}
