package biblioteca;

public class Professor extends Pessoa {
    
    String dept;
    public Professor(String nome, String dataNasc, String dept) {
        super(nome, dataNasc);
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
}
