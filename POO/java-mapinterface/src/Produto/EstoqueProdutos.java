package Produto;
import java.util.HashMap;
import java.util.Map;
public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();//n recebe so incializa
    }

    public void adicionarProduto(Long cod, String nome,int quant, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome,preco,quant));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque =0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){// for each com cada interação sendo o value do map na qual é um produto p 
                valorTotalEstoque += p.getQuant() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    //considerando que n tem valores iguais
    public Produto exibirProdutoMaisCaro(){
        Produto produtoMaisCaro =  null;//referencia mas n instancia
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            //vai pegar objeto instanciado a referencia acima
            for (Produto p: estoqueProdutosMap.values()) {
                if (p.getPreco()> maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;

    }   

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1l, "produto A", 10, 5.8);
        estoque.adicionarProduto(2l, "produto b", 3, 5.0);
        estoque.adicionarProduto(10l, "produto c", 2, 5.96);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ "+ estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.exibirProdutoMaisCaro());

    }
}