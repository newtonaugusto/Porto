/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto2;

import java.util.Date;

/**
 *
 * @author newton
 */
public class Passagem {
    private Rota rota;
    private Passageiro passageiro;
    private Embarcacao embarcacao;
    private int poltrona;

    public Passagem(int poltrona) {
        setPoltrona(poltrona);
    }

    public Passagem() {
    }

    @Override
    public String toString() {
        return "Embarcação: " + getEmbarcacao().getEmpresa() + " Poltrona: " + getPoltrona() ;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    } 
    
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
    
}
