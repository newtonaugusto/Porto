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
public interface ComandanteDAO {
    
    public void inserir(Comandante comandante);

    public void remover(String cpf);

    public void alterar(Comandante comandante);

    public Comandante consultar(String cpf);

    public Comandante[] listar();
    
}
