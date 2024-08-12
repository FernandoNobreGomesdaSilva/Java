public class ReprodutorMusical implements DispositivoMultifuncional {
	
	public void tocar(){
        System.out.println("Executando uma música!");
    }
    public void pausar(){
        System.out.println("Pausando a música em execução!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Musica: " + musica + " foi selecionada!");
    }
    @Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}
	
}