class Serie extends Producao {

    private int quantEps;
    private int temps;

    public Serie(int quantEps, int temps, String nome, int classIndicativa, int ano) {
        super(nome, classIndicativa, ano);
        this.quantEps = quantEps;
        this.temps = temps;
    }

    public Serie() {

    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Quantidade Episódios: " + quantEps);
        System.out.println("Temporadas: " + temps);
        System.out.println("Ano de Lançamento: " + this.getAno());
    }

    public int getQuantEps() {
        return quantEps;
    }

    public void setQuantEps(int quantEps) {
        this.quantEps = quantEps;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Serie [quantEps=" + quantEps + ", temps=" + temps + "]";
    }
}