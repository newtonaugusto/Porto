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
public class Bagagem {
    private float peso;
    private int codigo;

    public Bagagem() {
    }

    public Bagagem(float peso) {
        setPeso(peso);
    }

    @Override
    public String toString() {
        return "Peso: " + getPeso();
    }
    
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
