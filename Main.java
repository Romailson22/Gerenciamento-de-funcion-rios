// Classe principal
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do sistema
        FuncionarioTempoIntegral funcionario1 = new FuncionarioTempoIntegral("João", 30, 5000);
        FuncionarioMeioPeriodo funcionario2 = new FuncionarioMeioPeriodo("Maria", 25, 2000, 20);

        System.out.println("Bônus do " + funcionario1.getNome() + ": R$" + funcionario1.calcularBonus());
        System.out.println("Bônus da " + funcionario2.getNome() + ": R$" + funcionario2.calcularBonus());
    }
}
