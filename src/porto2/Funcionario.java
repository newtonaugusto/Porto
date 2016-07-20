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
public class Funcionario extends Pessoa{
    private String funcao;
    private int codigo;

    public Funcionario(String nome) {
        setNome(nome);
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionário: " + getNome();
    }
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
