public enum Servicos {
	
	MOVEL("Movel"), 
    FIXA("Fixa"), 
    BANDA_LARGA("Banda Larga"), 
    TV("TV");
	
	private String produto;
	
	Servicos(String produto){
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}	
}

