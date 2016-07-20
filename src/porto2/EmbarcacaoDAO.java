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
public interface EmbarcacaoDAO {
    
    public void inserir(Embarcacao embarcacao);

    public void remover(int codigo);

    public void alterar(Embarcacao embarcacao);

    public Embarcacao consultar(int codigo);

    public Embarcacao[] listar();
    
}
