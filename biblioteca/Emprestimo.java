
public class Emprestimo {
    public Emprestimo(Livro livro, Pessoa pessoa, String dataDev) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataDev = dataDev;
    }

    private Livro livro;
    private Pessoa pessoa;
    private String dataDev;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDataDev() {
        return dataDev;
    }

    public void setDataDev(String dataDev) {
        this.dataDev = dataDev;
    }

}