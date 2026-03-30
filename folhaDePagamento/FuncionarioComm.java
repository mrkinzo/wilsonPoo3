public class FuncionarioComm extends Funcionario {
    double vendasMensais;
    double percentual;

    public FuncionarioComm(String nome, double salarioBase, double vendasMensais, double percentual) {
        super(nome, salarioBase);
        this.vendasMensais = vendasMensais;
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
}
