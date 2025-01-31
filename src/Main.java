class Main {

    public static void main(String[] args) {
        Filme f1 = new Filme(175, "The Batman", 14, 2022);
        Filme f2 = new Filme(180, "Aquaman", 12, 2018);

        Serie s1 = new Serie(8, 1, "Pacificador", 18, 2022);
        Serie s2 = new Serie(100, 5, "Gotham", 12, 2014);

        Produtora p1 = new Produtora("DC");
        p1.adicionarProducao(f1);
        p1.adicionarProducao(f2);
        p1.adicionarProducao(s1);
        p1.adicionarProducao(s2);

        p1.exibirProducoes();

        Filme f3 = new Filme(133, "Viúva Negra", 12, 2021);
        Filme f4 = new Filme(182, "Vingadores Ultimato", 12, 2019);

        Serie s3 = new Serie(6, 1, "Loki", 12, 2021);
        Serie s4 = new Serie(9, 1, "Wanda Vision", 10, 2021);

        Produtora p2 = new Produtora("Marvel");
        p2.adicionarProducao(f3);
        p2.adicionarProducao(f4);
        p2.adicionarProducao(s3);
        p2.adicionarProducao(s4);

        p2.exibirProducoes();
    }
}