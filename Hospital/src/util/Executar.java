package util;

// Inicio do software classe que executa tudo
public class Executar {
	public static void main(String[] args){
		// Chamei a classe login que vai decidir se entro ou n�o no sistema
		Login login = new Login();
		// o metodo area em login � onde o usuario vai dizer em qual area ele atua
		login.area();
	}

}