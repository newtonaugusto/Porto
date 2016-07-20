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
public class Passageiro extends Pessoa {

    private Bagagem[] bagagem;
    private int codigo;

    public Passageiro() {
    }
    
    public Passageiro(String nome){
        setNome(nome);
    }
    
    public Bagagem[] getBagagem() {
        return bagagem;
    }

    public void setBagagem(Bagagem[] bagagem) {
        this.bagagem = bagagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Passageiro:" + getNome(); //To change body of generated methods, choose Tools | Templates.
    }

}
