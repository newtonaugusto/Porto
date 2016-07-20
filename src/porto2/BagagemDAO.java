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
public interface BagagemDAO {
    
    public void inserir(Bagagem bagagem);

    public void remover(int codigo);

    public void alterar(Bagagem bagagem);

    public Bagagem consultar(int codigo);

    public Bagagem[] listar();
    
}
