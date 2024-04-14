package br.Produto.com;

class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor 1: Aceita apenas o nome do produto e inicializa os demais atributos com valores padrão
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    // Construtor 2: Aceita o nome e o preço do produto, inicializando a quantidade em estoque com o valor padrão (0)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    // Construtor 3: Aceita o nome, o preço e a quantidade em estoque do produto
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para exibir as características do produto
    public void exibirCaracteristicas() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}