package classes;

public class Medico{
	private String nome;
	private int idade;
	private int cpf;
	private String tipo;
	private String senha;
	
	
	
	public Medico(String nome, int idade, int cpf, String tipo, String senha) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.tipo = tipo;
		this.senha = senha;
	}
	
	public String printa() {
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCpf: " + this.cpf + "\nArea: " + this.tipo + "\nSenha: " + this.senha ;
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
