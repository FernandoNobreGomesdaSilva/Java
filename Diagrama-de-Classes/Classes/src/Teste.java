public class Teste {
    public static void main(String[] args) {
    	DispositivoMultifuncional dispositos1 = new AparelhoTelefonico();
    	System.out.println("||----------APARELHO TELEFÔNICO----------||");
    	String numero = "9999999999";
    	dispositos1.ligar(numero);
    	dispositos1.atender();
    	dispositos1.iniciarCorreioVoz();
    	
    	DispositivoMultifuncional dispositos2 = new NavegadorNaInternet();
    	System.out.println("||----------NAGEGADOR INTERNET----------||");
    	String url = "wwww.internet";
    	dispositos2.exibirPagina(url);
    	dispositos2.adicionarNovaAba();
    	dispositos2.atualizarPagina();
    	
    	DispositivoMultifuncional dispositos3 = new ReprodutorMusical();
    	System.out.println("||----------REPRODUTOR MUSICAL----------||");
    	String musica = "XXXXXXXX";
    	dispositos3.tocar();
    	dispositos3.pausar();
    	dispositos3.selecionarMusica(musica);
    	
    }
}
