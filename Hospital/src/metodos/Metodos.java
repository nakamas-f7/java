package metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import util.Dados;
import util.Login;

// class metodos vai contender muitos metodos importantes para todo o software erdando todos os metodos de dados
public class Metodos extends Dados{
	
	
	// metodo dadosdeacesso que é chamado pelo metodo area na class login
	public void dadosdeacesso() {
		// chamei a class login e usei o metodo inteiros para pedir o cpf e a senha para confirmação de login 
		Dados pede = new Dados();
		
		
		
		int x = 0;
		int y = 0;
		if(x >= 0 && y >= 0) {
			x = pede.inteiros("Digite seu cpf: ");
			y = pede.inteiros("Digite sua senha: ");
		}else
			System.out.println("Valor inserido invalido");
		
		
		
		
		
		// chamei agora a class login passando para o construtor os parametros senha e cpf armazenados nos atributos x e y
		Login login = new Login(x, y);
		
		
	}
	// metodo cadastro de consulta que vai salvar em um arquivo txt todos os dados de consulta do paciente
	public void cadastro_consulta() {
		// ainda imcompleto
		Path path = Path.of("C:\\Users\\Cerâmica Betel\\Documents\\carlos\\java\\Hospital\\Consulta.txt");
		
		try{
			if(Files.notExists(path)) {
				Files.createFile(path);
			}
			
			String x = texto("Digite o nome do paciente: ");
			
			Files.writeString(path, x + x);
			
			
		}catch(IOException x) {
			System.out.println("Erro: " + x);
		}
	}
	
	
	
	
	
	
	
	

}
