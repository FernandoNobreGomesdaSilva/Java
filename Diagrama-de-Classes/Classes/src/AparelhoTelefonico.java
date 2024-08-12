public class AparelhoTelefonico implements DispositivoMultifuncional {
	
	public void ligar(String numero){
        System.out.println("Número: "+numero+" está ligando!");
    }
    public void atender(){
        System.out.println("Ligação atendida!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Mensagem  de correio de voz!");
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
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		
	}
}