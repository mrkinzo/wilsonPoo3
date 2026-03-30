public class FuncionarioBonificado extends FuncionarioComm {
    private double Bonus;

    public FuncionarioBonificado(String nome, double salarioBase, double vendasMensais, double percentual,
            double bonus) {
        super(nome, salarioBase, vendasMensais, percentual);
        Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

}
