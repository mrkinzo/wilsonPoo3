import java.util.ArrayList;
import java.util.List;
public class Main {
    static List<Funcionario> ListaFunc = new ArrayList<Funcionario>();

    public static void main(String[] args) {
        FuncionarioBonificado wellington = new FuncionarioBonificado("Wellington", 0, 0, 0, 0);
        ListaFunc.add(wellington);
       
    }

}
