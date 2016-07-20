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
public class BagagemDAOImpl implements BagagemDAO{
    
    private Bagagem[] bagagens = new Bagagem[10];
    
    public void inserir(Bagagem bagagem){
        boolean achou = false;
        for (int i = 0; i < bagagens.length; i++) {
            if (bagagens[i] != null) {
                if (bagagens[i].getCodigo()==(bagagem.getCodigo())) {
                    System.out.println("Bagagem já cadastrada!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < bagagens.length; i++) {
                if (bagagens[i] == null) {
                    bagagens[i] = bagagem;
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
            for (int i = 0; i < bagagens.length; i++) {
            if (bagagens[i] != null) {
                if (bagagens[i].getCodigo() == codigo) {
                    bagagens[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Bagagem bagagem){
        
    }

    public Bagagem consultar(int codigo){
        
        return null;
    }

    public Bagagem[] listar(){
        
        return bagagens;
    }
    
}
