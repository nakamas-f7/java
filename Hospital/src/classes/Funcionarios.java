package classes;

import java.io.Serializable;

import metodos.Metodo;


public class Funcionarios extends Metodo implements Serializable{
	
	private String nome;
	private int idade;
	private int cpf;
	private String tipo;
	private String senha;
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Funcionarios() {
		
	}

	public Funcionarios(String nome, int idade, int cpf, String tipo, String senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.tipo = tipo;
		this.senha = senha;
	}
	
	
	public void medico() {
		Medico medico = new Medico(this.nome, this.idade, this.cpf, this.tipo, this.senha);
		System.out.println(medico.printa());
		
	}
	
	
	
	
	




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


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}



	
	
	
	
	
		
	}

