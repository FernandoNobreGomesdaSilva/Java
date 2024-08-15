package List;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titiulo, String autor, int anoPublicacao) {
		this.titulo = titiulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitiulo() {
		return titulo;
	}

	public void setTitiulo(String titiulo) {
		this.titulo = titiulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro [titiulo=" + titulo + ", "
				+ "autor=" + autor + ", "
				+ "anoPublicacao=" + anoPublicacao + "]";
	}
	
}
