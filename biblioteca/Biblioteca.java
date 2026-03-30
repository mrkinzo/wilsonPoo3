package biblioteca;

public class Biblioteca {
    private String nome;
    private String endereco;
    private Livro[] listaLivros;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Livro[] getListaLivros() {
        return listaLivros;
    }
    public void setListaLivros(Livro[] listaLivros) {
        this.listaLivros = listaLivros;
    }
    public Biblioteca(String nome, String endereco, Livro[] listaLivros) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaLivros = listaLivros;
    }
}
