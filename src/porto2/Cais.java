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
public class Cais {
    private int numero;

    public Cais() {
    }

    public Cais(int numero) {
        setNumero(numero);
    }
    
    @Override
    public String toString() {
        return " Embarque/Desembarque: " + getNumero();
    }    
   
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
