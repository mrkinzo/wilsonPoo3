public class FuncionarioHorista extends Funcionario {

    private int HorasTrabalhadas;
    private double valorPorHora;

    public int getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        HorasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase);
        HorasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
}
