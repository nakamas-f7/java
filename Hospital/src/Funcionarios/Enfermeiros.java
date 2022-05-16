package Funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// class enfermeiros onde vai ficar tudo o que o infermeiro pode fazer
public class Enfermeiros {
	
	// Atributos do Enfermeiros
	private String nome; 
	private int idade;
	private int cpf;
	private int senha;
	private String path; 
	
	// Construtor da class Enfermeiros
	public Enfermeiros(int cpf, int senha, String path) {
		this.setCpf(cpf);
		this.setSenha(senha);
		this.setPath(path);;
	}
	
	// metodo Enfermeiro que procura os dados do enfermeiro e passa para os atributos logo acima 
	private void Enfermeiro() {
		try(BufferedReader br = new BufferedReader(new FileReader(this.getPath()))){
			String line = br.readLine();
			line = br.readLine();
			while(line != null) { 
				
				String vect[] = line.split(",");
				
				String nome = vect[0];
				Integer idade = Integer.parseInt(vect[1]);
				Integer cpf = Integer.parseInt(vect[2]);
				Integer senha = Integer.parseInt(vect[3]);
				
				if(this.getSenha() == senha && this.getCpf() == cpf) {
					this.setNome(nome);
					this.setIdade(idade);
					
					break;
				}
				
				line = br.readLine();
				
			}
		
		}catch(IOException x){
			System.out.println("Usuario ou senha invalidos!");
		}

	}
	// metodo mostra que apenas printa todos os dados do enfermeiro
	public void mostra() {
		Enfermeiro();
		System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf() + "\nSenha: " + getSenha());
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
