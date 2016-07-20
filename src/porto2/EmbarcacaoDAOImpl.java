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
public class EmbarcacaoDAOImpl implements EmbarcacaoDAO{
    
    private Embarcacao[] embarcacoes = new Embarcacao[10];
    
    public void inserir(Embarcacao embarcacao){
        boolean achou = false;
        for (int i = 0; i < embarcacoes.length; i++) {
            if (embarcacoes[i] != null) {
                if (embarcacoes[i].getCodigo()==(embarcacao.getCodigo())) {
                    System.out.println("Embarcação já cadastrada!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < embarcacoes.length; i++) {
                if (embarcacoes[i] == null) {
                    embarcacoes[i] = embarcacao;
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
            for (int i = 0; i < embarcacoes.length; i++) {
            if (embarcacoes[i] != null) {
                if (embarcacoes[i].getCodigo() == codigo) {
                    embarcacoes[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Embarcacao embarcacao){
        
    }

    public Embarcacao consultar(int codigo){
        
        return null;
    }

    public Embarcacao[] listar(){
        
        return embarcacoes;
    }    
}
