// Classe derivada para representar funcionários em tempo integral
class FuncionarioTempoIntegral extends Funcionario {
    // Construtor
    public FuncionarioTempoIntegral(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    // Sobrescrita do método calcularBonus para funcionários em tempo integral
    @Override
    public double calcularBonus() {
        return super.calcularBonus() + 1000;
    }
}
