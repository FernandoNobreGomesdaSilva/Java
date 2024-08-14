import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> ListaItem = new ArrayList<Item>();
	
	public CarrinhoDeCompras() {
		}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
	      this.ListaItem.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<Item>();
	      if (!this.ListaItem.isEmpty()) {
	         Iterator<Item> var3 = this.ListaItem.iterator();
	         while(var3.hasNext()) {
	            Item i = (Item)var3.next();
	            if (i.getNome().equalsIgnoreCase(nome)) {
	               itensParaRemover.add(i);
	            }
	         }

	         this.ListaItem.removeAll(itensParaRemover);
	      } else {
	         System.out.println("A lista esta vazia!");
	      }
	}
	
	public double calcularValorTotal() {
	    double valorTotal = 0.0;
	    if (this.ListaItem.isEmpty()) {
	        throw new RuntimeException("A lista esta vazia!");
	    }
	    for(Item item : this.ListaItem) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem;
	    }
	    return valorTotal;
	}
	
	public void exibirItens() {
	      if (!this.ListaItem.isEmpty()) {
	         System.out.println(this.ListaItem);
	      } else {
	         System.out.println("A lista esta vazia!");
	      }

	   }

	   public String toString() {
	      return "CarrinhoDeCompras{itens=" + this.ListaItem + "}";
	   }
	   
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	     carrinhoDeCompras.adicionarItem("Lapis", 2.0, 3);
	     carrinhoDeCompras.adicionarItem("Caneta", 2.0, 3);
	     carrinhoDeCompras.exibirItens();
	     System.out.println("O valor total da compra: " + carrinhoDeCompras.calcularValorTotal());
	     carrinhoDeCompras.removerItem("Lapis");
	     carrinhoDeCompras.exibirItens();
	     System.out.println("O valor total da compra: " + carrinhoDeCompras.calcularValorTotal());
	}
}
