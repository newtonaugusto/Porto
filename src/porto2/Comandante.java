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
public class Comandante extends Funcionario {
    private String registro;

    public Comandante() {
    }

    public Comandante(String registro) {
        setRegistro(registro);
    }    

    @Override
    public String toString() {
        return "Comandante: " + getNome();
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    
}
