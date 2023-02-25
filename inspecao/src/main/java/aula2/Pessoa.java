package aula2;

public class Pessoa {

    private String nome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String concatenaNomeSobreNome(String nome, String sobreNome) {
        return nome + sobreNome;
    }

}
