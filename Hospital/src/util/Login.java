package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Funcionarios.Enfermeiros;
import Funcionarios.Medicos;
import metodos.Metodos;

public class Login {
	// aqui tem alguns atributos staticos privados, coloquei statico pois em varios momentos ficaremos trocando de class
	// e os valores dos atributos se perderiam com determiando tempo.
	private static int cpf;
	private static int senha;
	private static String path;
	
	// construtor vazio da class
	public Login() {
		
	}
	// construtor da class passando dois parametros, fiz dois construtores pois tem momentos em que eu não quero 
	// passar valor nenhum, e colocar dois construtores realmente foi muito util.
	public Login(int cpf, int senha) {
		this.setCpf(cpf);
		this.setSenha(senha);
	}
	
	
	
	
	// metodo de autenticacao, ele serve para ver se a area a qual o usuario escolheu e digitou cpf e senha exisyem
	// apesar de o metodo de autenticacao vir primeiro que o metodo area, ele e executado só depois no metodo area
	private boolean autenticacao(){
		// aqui eu usei try,catch para tratar exceções no codigo, pois mexer com arquivos pode haver muito erros
		// usando o try with resources passando o BufferedReader junto ao FileReader(dentro dele o atibuto path) que são responsaveis por ler os arquivos
		try(BufferedReader br = new BufferedReader(new FileReader(getPath()))){
			// criando atributo line que vai receber cada linha do arquivo
			String line = br.readLine();
			line = br.readLine();
			// line != null significa que enquanto tiver conteudo na line ele vai executar
			while(line != null) {
				String vect[] = line.split(",");
				// pequena ganbiarra para saber quantos valores existem na Array vect
				int x = 0;
				for(String y: vect) {
					x += 1;
				}
				
				// medico tem 5 valores 
				if(x == 5) {
					Integer cpf = Integer.parseInt(vect[3]);
					Integer senha = Integer.parseInt(vect[4]);
					if(this.getSenha() == senha && this.getCpf() == cpf) {
						return true;
						
						
					}
				// enfermeiro tem 4 valores
				}else if(x == 4) {
					Integer cpf = Integer.parseInt(vect[2]);
					Integer senha = Integer.parseInt(vect[3]);
					if(this.getSenha() == senha && this.getCpf() == cpf) {
						return true;
						
					}
				}
				// passando para proxima linha do arquivo
				line = br.readLine();
				
				
				
				
				
			}
		// caso haja alguma exceção catch ira passar uma mensagem do erro
		}catch(IOException x){
			x.getMessage();
		}
		
		return false;
	}
	
	// metodo area, aqui sera o primeiro metodo executado
	public void area() {
		//usando classe tabela para printar opções de area do usuario
		Tabela tabela = new Tabela();
		tabela.tabelalogin();
		
		
		Dados pergunta = new Dados();
		//usando class Dados para receber a opção do usuario
		int x = pergunta.inteiros("Digite aqui: ");
		
		// caso o usuario seja  um medico
		if(x == 1) {
			// passa o local em que esta o arquivo da lista de medicos
			this.setPath("C:\\Users\\Cerâmica Betel\\Documents\\carlos\\java\\Hospital\\src\\medicos.txt");;
			Metodos metodo = new Metodos();
			
			boolean y = true;
			while(y == true) {
				//usando o metodo dadosdeacesso eu pergunto ao usuario cpf e senha e mando para o metodo autenticacao acima
				metodo.dadosdeacesso();
				// se o cpf e senha inseridos existirem de fato, o metodo autenticacao ira retorna true confirmando que os dados são verdadeiros 
				
				if(autenticacao() == true) {
					//e manda o usuario direto para a class medico com todos os seus dados(senha,nome,cpf, etc)
					Medicos medico = new Medicos(this.getCpf(), this.getSenha(), this.getPath());
					medico.mostra();
					break;
					
				// caso retorne false o programa imprime a mensagem abaixo	
				}else
					System.out.println("Usuario ou senha invalidos !\n");
			}
				
			
		// caso o usuario seja um enfermeiro
		}else if(x == 2) {
			// passa o local em que esta o arquivo da lista de enfermeiros
			this.setPath("C:\\Users\\Cerâmica Betel\\Documents\\carlos\\java\\Hospital\\src\\enfermeiros.txt");;
			Metodos metodo = new Metodos();
			
			boolean y = true;
			while(y == true) {
				//usando o metodo dadosdeacesso eu pergunto ao usuario cpf e senha e mando para o metodo autenticacao acima
				metodo.dadosdeacesso();
				
				// se o cpf e senha inseridos existirem de fato, o metodo autenticacao ira retorna true confirmando que os dados são verdadeiros
				if(autenticacao() == true) {
					
					// e manda o usuario direto para a class enfermeiro com todos os seus dados(senha,nome,cpf, etc)
					Enfermeiros enfermeiro = new Enfermeiros(this.getCpf(),this.getSenha(),this.getPath());
					enfermeiro.mostra();
					break;
					
				// caso retorn false o programa imprime a mensagem abaixo
				}else
					System.out.println("Usuario ou senha invalidos !\n");
			}
				
		}
		
		
				
		}
	
	
	// metodos getters e setters
	
	
	public static int getCpf() {
		return cpf;
	}
	public static void setCpf(int cpf) {
		Login.cpf = cpf;
	}
	public static int getSenha() {
		return senha;
	}
	public static void setSenha(int senha) {
		Login.senha = senha;
	}
	public static String getPath() {
		return path;
	}
	public static void setPath(String path) {
		Login.path = path;
	}
	
	
	
		
		
		
		
		
		
	}
	
	
	
