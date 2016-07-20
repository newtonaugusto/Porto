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
public interface LocalDAO {
    
    public void inserir(Local local);

    public void remover(int codigo);

    public void alterar(Local local);

    public Local consultar(int codigo);

    public Local[] listar();    
}
