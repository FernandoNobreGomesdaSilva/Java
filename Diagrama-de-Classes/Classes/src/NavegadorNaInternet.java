public class NavegadorNaInternet implements DispositivoMultifuncional {
	
	public void exibirPagina(String url){
        System.out.println("Conectado ao site: "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba aberta!");
    }
    public void atualizarPagina(){
        System.out.println("Página atualizada!");
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