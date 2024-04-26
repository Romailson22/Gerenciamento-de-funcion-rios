// Classe base Funcionario
class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    // Construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Método getter para o nome
    public String getNome() {
        return nome;
    }

    // Método getter para a idade
    public int getIdade() {
        return idade;
    }

    // Método getter para o salário
    public double getSalario() {
        return salario;
    }

    // Método para calcular bônus
    public double calcularBonus() {
        return this.salario * 0.1; // Exemplo simples de cálculo de bônus
    }
}
