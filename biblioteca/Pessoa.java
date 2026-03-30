package biblioteca;

public class Pessoa {

    private String nome;
    private String dataNasc;
   

    public String getDataNasc() {
        return dataNasc;
    }

    public Pessoa(String nome, String dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    }
