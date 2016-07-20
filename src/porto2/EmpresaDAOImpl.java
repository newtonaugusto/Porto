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
public class EmpresaDAOImpl implements EmpresaDAO{
    private Empresa[] empresas = new Empresa[10];
    
    public void inserir(Empresa empresa){
        if(empresa.getCnpj().equals("")){
            System.out.println("O campo CNPJ não pode estar vazio!");
            return;
        }
        boolean achou = false;
        for (int i = 0; i < empresas.length; i++) {
            if (empresas[i] != null) {
                if (empresas[i].getCnpj().equals(empresa.getCnpj())) {
                    System.out.println("Empresa já cadastrada!");
                    achou = true;
                    break;
                }
            }
        }
        if (!achou) {
            boolean inseriu = false;
            for (int i = 0; i < empresas.length; i++) {
                if (empresas[i] == null) {
                    empresas[i] = empresa;
                    System.out.println("Inserido com Sucesso!");
                    inseriu = true;
                    break;
                }
            }
            if(!inseriu){
                System.out.println("Não há mais espaço para novos cadastros! ");
            }
        }
    }

    public void remover(String cnpj){
            for (int i = 0; i < empresas.length; i++) {
            if (empresas[i] != null) {
                if (empresas[i].getCnpj().equals(cnpj)) {
                    empresas[i] = null;
                    break;
                }
            }
        }   
    }

    public void alterar(Empresa empresa){
        
    }

    public Empresa consultar(String empresa){
        
        return null;
    }

    public Empresa[] listar(){
        
        return empresas;
    }    
}
