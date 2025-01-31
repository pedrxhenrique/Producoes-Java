abstract class Producao {
    private String nome;
    private int classIndicativa;
    private int ano;

    // CONSTRUTOR
    public Producao(String nome, int classIndicativa, int ano) {
        this.nome = nome;
        this.classIndicativa = classIndicativa;
        this.ano = ano;
    }

    // CONSTRUTOR VAZIO
    public Producao() {

    }
    // METODOS

    public abstract void exibir();

    // METODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getClassIndicativa() {
        return classIndicativa;
    }

    public void setClassIndicativa(int classIndicativa) {
        this.classIndicativa = classIndicativa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}