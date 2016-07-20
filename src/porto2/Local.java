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
public class Local {
    private int codigo;
    private String cidade;
    private Cais cais;
    private String nomePorto;
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Local() {
    }

    public Local(int numero) {
        cais.setNumero(numero);
    }             

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Cais getCais() {
        return cais;
    }

    public void setCais(Cais cais) {
        this.cais = cais;
    }

    public String getNomePorto() {
        return nomePorto;
    }

    public void setNomePorto(String nomePorto) {
        this.nomePorto = nomePorto;
    }
    
    
}
