
public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String editora;
    private String edicao;
    private String[] autores;
    private int qtdAcervo;

    public int getQtdAcervo() {
        return qtdAcervo;
    }

    public void setQtdAcervo(int qtdAcervo) {
        this.qtdAcervo = qtdAcervo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public Livro(String titulo, String autor, String ano, String editora, String edicao, String[] autores,
            int qtdAcervo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
        this.edicao = edicao;
        this.autores = autores;
        this.qtdAcervo = qtdAcervo;
    }
}