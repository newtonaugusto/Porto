/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porto2;

import java.util.ArrayList;

/**
 *
 * @author newton
 */
public class Viagem {
    private Comandante comandante;
    private Rota rota;
    private ArrayList <Passageiro> passageiros;
    private Embarcacao embarcacao;

    public Viagem(Embarcacao embarcacao) {
        setEmbarcacao(embarcacao);
    }
    
    

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }

    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }
    
    
    
}
