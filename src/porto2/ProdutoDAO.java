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
public interface ProdutoDAO {

    public void inserir(Produto produto);

    public void remover(int codigo);

    public void alterar(Produto produto);

    public Produto consultar(int codigo);

    public Produto[] listar();   
    
}
