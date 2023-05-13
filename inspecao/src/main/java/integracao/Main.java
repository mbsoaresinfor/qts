/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracao;

/**
 *
 * @author marcelo.soares
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BancoDados banco = new BancoDados();
       
       // crio pessoa para salvar
       Pessoa pessoa1 = new Pessoa();
       pessoa1.setNome("pedro");
       pessoa1.setIdade(40);
       banco.insertPessoa(pessoa1);
       
    // crio outra pessoa para salvar
       Pessoa pessoa2 = new Pessoa();
       pessoa2.setNome("maria");
       pessoa2.setIdade(50);
       banco.insertPessoa(pessoa2);
       
    // LISTA DO BANCO
       for(Pessoa p : banco.listPessoa()){
       	System.out.println("-------------------------------");
           System.out.println("Pessoa id " + p.getId());
           System.out.println("Pessoa nome " + p.getNome());
           System.out.println("Pessoa idade " + p.getIdade());
           System.out.println("-------------------------------");
       }
       
             
      // ATUALIZA AS PESSOAS
       pessoa1.setIdade(90);       
       banco.updatePessoa(pessoa1);
       pessoa2.setIdade(130);       
       banco.updatePessoa(pessoa2);
       
       
    // LISTA DO BANCO
       for(Pessoa p : banco.listPessoa()){
       	System.out.println("-------------------------------");
           System.out.println("Pessoa id " + p.getId());
           System.out.println("Pessoa nome " + p.getNome());
           System.out.println("Pessoa idade " + p.getIdade());
           System.out.println("-------------------------------");
       }
       
       // DELETA NO BANCO AS PESSOAS
       banco.deletePessoa(pessoa1.getId());
       banco.deletePessoa(pessoa2.getId());
       
       // LISTA DO BANCO
       for(Pessoa p : banco.listPessoa()){
       	System.out.println("-------------------------------");
           System.out.println("Pessoa id " + p.getId());
           System.out.println("Pessoa nome " + p.getNome());
           System.out.println("Pessoa idade " + p.getIdade());
           System.out.println("-------------------------------");
       }
       
    }
    
}
