public class Aluno extends Pessoa {
  public String numMat;
  public String curso;
    public Aluno(String nome, String dataNasc, String numMat, String curso) {
        super(nome, dataNasc);
        this.numMat = numMat;
        this.curso = curso;
    }
    public String getNumMat() {
        return numMat;
    }
    public void setNumMat(String numMat) {
        this.numMat = numMat;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}