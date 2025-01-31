import java.util.ArrayList;
import java.util.List;

class Produtora {
    private String nome;
    private List<Producao> listadeproducoes;

    public Produtora(String nome) {
        this.nome = nome;
        this.listadeproducoes = new ArrayList<>();
    }

    public Produtora() {
        this.listadeproducoes = new ArrayList<>();
    }

    public void adicionarProducao(Producao producao) {
        this.listadeproducoes.add(producao);
    }

    public void exibirProducoes() {
        System.out.println("\n\n");
        System.out.println("Produtora: " + nome);
        for (Producao p : listadeproducoes) {
            System.out.println("---------------");
            p.exibir();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Producao> getListadeproducoes() {
        return listadeproducoes;
    }

    public void setListadeproducoes(List<Producao> listadeproducoes) {
        this.listadeproducoes = listadeproducoes;
    }

    @Override
    public String toString() {
        return "Produtora [listadeproducoes=" + listadeproducoes + ", nome=" + nome + "]";
    }
}