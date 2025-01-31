class Filme extends Producao {

    private double duracao;

    public Filme(double duracao, String nome, int classIndicativa, int ano) {
        super(nome, classIndicativa, ano);
        this.duracao = duracao;
    }

    public Filme() {

    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Duracao: " + duracao);
        System.out.println("Classificação Indicativa: " + this.getClassIndicativa());
        System.out.println("Ano de Lançamento: " + this.getAno());
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme [duracao=" + duracao + " nome= " + this.getNome() + "]";
    }

}