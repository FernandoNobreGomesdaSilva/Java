package Set.Operacoes_Basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<String>ConjuntoSet;

	public ConjuntoPalavrasUnicas() {
		this.ConjuntoSet = new HashSet<>();
	}
	
	public Set<String> getConjuntoSet() {
		return ConjuntoSet;
	}
	
	public void adicionarPalavra(String palavra) {
		ConjuntoSet.add(palavra);
	}
	public void removerPalavra(String palavra) {
		if(!ConjuntoSet.isEmpty()) {
			if(ConjuntoSet.contains(palavra)) {
				ConjuntoSet.remove(palavra);
			}else {
				System.out.println("Palavra não encontrada no conjunto!");
			}
		}else {
			System.out.println("O conjunto está vazio!");
		}
	}
	 public boolean verificarPalavra(String palavra) {
		return ConjuntoSet.contains(palavra);
	 }
	 public void exibirPalavrasUnicas() {
		    if(!ConjuntoSet.isEmpty()) {
		      System.out.println(ConjuntoSet);
		    } else {
		      System.out.println("O conjunto está vazio!");
		    }
		  }

		  public static void main(String[] args) {
		    // Criando uma instância da classe ConjuntoPalavrasUnicas
		    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		    // Adicionando linguagens únicas ao conjunto
		    conjuntoLinguagens.adicionarPalavra("Java");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("JavaScript");
		    conjuntoLinguagens.adicionarPalavra("Python");
		    conjuntoLinguagens.adicionarPalavra("C++");
		    conjuntoLinguagens.adicionarPalavra("Ruby");

		    // Exibindo as linguagens únicas no conjunto
		    conjuntoLinguagens.exibirPalavrasUnicas();

		    // Removendo uma linguagem do conjunto
		    conjuntoLinguagens.removerPalavra("Python");
		    conjuntoLinguagens.exibirPalavrasUnicas();

		    // Removendo uma linguagem inexistente
		    conjuntoLinguagens.removerPalavra("Swift");

		    // Verificando se uma linguagem está no conjunto
		    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
		    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

		    // Exibindo as linguagens únicas atualizadas no conjunto
		    conjuntoLinguagens.exibirPalavrasUnicas();
		  }
}
