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
public class ProdutoDAOImpl implements ProdutoDAO{
    private Produto[] produtos = new Produto[10];
    
    public void inserir(Produto produto){
        boolean achou = false;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].getCodigo()==(produto.getCodigo())) {
                    System.out.println("Produto já cadastrado!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] == null) {
                    produtos[i] = produto;
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
            for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].getCodigo() == codigo) {
                    produtos[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Produto produto){
        
    }

    public Produto consultar(int codigo){
        
        return null;
    }

    public Produto[] listar(){
        
        return produtos;
    }    
}
