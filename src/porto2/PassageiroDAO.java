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
public interface PassageiroDAO {
    
    public void inserir(Passageiro passageiro);

    public void remover(String cpf);

    public void alterar(Passageiro passageiro);

    public Passageiro consultar(String cpf);

    public Passageiro[] listar();   
    
}
