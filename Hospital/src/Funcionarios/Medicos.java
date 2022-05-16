package Funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// class de medicos onde vai ficar tudo que o medico pode fazer 
public class Medicos {
	
	// atributos que armazenam todos os dados de medico
	private String nome; 
	private int idade;
	private int cpf;
	private String tipo;
	private int senha;
	private String path; 
	
	// construtor da class medico passando os parametros cpf, senha e o caminho da pasta 
	public Medicos(int cpf, int senha, String path) {
		this.setCpf(cpf);
		this.setSenha(senha);
		this.setPath(path);
	}
	
	// metodo medico que procura os dados de enfermeiro e passa para os atibutos logo acima
	private void medico() {
		try(BufferedReader br = new BufferedReader(new FileReader(getPath()))){
			String line = br.readLine();
			while(line != null) { 
				line = br.readLine();
				String vect[] = line.split(",");
				
				String nome = vect[0];
				Integer idade = Integer.parseInt(vect[1]);
				String tipo = vect[2];
				Integer cpf = Integer.parseInt(vect[3]);
				Integer senha = Integer.parseInt(vect[4]);
				
				if(this.getSenha() == senha && this.getCpf() == cpf) {
					this.setNome(nome);
					this.setIdade(idade);
					this.setTipo(tipo);
					break;
				}
				
			}
		
		}catch(IOException x){
			x.getMessage();
		}
		
	}
	
	
	// metodo mostra que apenas mostra os dados do medico
	public void mostra() {
		medico();
		System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf() + "\nMédico de: " + getTipo() + "\nSenha: " + getSenha());
	}
	
	
	
	
	// metodos getters e setters 
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
	
	
	
}
