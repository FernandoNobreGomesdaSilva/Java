package List.Operacoes_Basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item>CarrinhoDeComprasList;

	public CarrinhoDeCompras() {
		this.CarrinhoDeComprasList = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		CarrinhoDeComprasList.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		List<Item>removerItemList = new ArrayList<>();
		for(Item i : CarrinhoDeComprasList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				removerItemList.add(i);
			}	
		}
		CarrinhoDeComprasList.removeAll(removerItemList);
	}
		
		
		
	
		
	public double calcularValorTotal() {
		double ValorTotal = 0; 
		for(Item v :CarrinhoDeComprasList) {
			double valorItem = v.getQuantidade() * v.getPreco();
			ValorTotal +=valorItem;
		}
		return ValorTotal;
			
	}
	public void exibirItens() {
		System.out.println(this.CarrinhoDeComprasList);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras compras = new CarrinhoDeCompras();
		compras.adicionarItem("Lapis", 1.5, 5);
		compras.adicionarItem("Caneta", 2.1, 5);
		compras.exibirItens();
		//System.out.println("Item removido!");
		//compras.removerItem("Lapis");
		//compras.exibirItens();
		System.out.println("O valor total da compra: "+compras.calcularValorTotal());
		
		
	}
}
