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
public interface EmpresaDAO {

    public void inserir(Empresa empresa);

    public void remover(String cnpj);

    public void alterar(Empresa empresa);

    public Empresa consultar(String cnpj);

    public Empresa[] listar();
    
}
