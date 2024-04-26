// Classe derivada para representar funcionários em meio período
class FuncionarioMeioPeriodo extends Funcionario {
    private int horasPorSemana;

    // Construtor
    public FuncionarioMeioPeriodo(String nome, int idade, double salario, int horasPorSemana) {
        super(nome, idade, salario);
        this.horasPorSemana = horasPorSemana;
    }

    // Sobrescrita do método calcularBonus para funcionários em meio período
    @Override
    public double calcularBonus() {
        return super.calcularBonus() + (this.horasPorSemana * 10);
    }
}
