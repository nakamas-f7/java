package Funcionarios;

import metodos.Metodos;
import util.Hospital;
import util.Tabela;
// class atendente onde ficara todos os metodos do atendente que erda todos os metodos da class Metodos
public class Atendente extends Metodos{
	// o Atendente tem acesso a lista de medicos e enfermeiros por isso foi criado atributos que guardam o local desses arquivos 
	private String medico = "C:\\Users\\Cerâmica Betel\\Documents\\carlos\\java\\Hospital\\src\\medicos";
	private String enfermeiros = "C:\\Users\\Cerâmica Betel\\Documents\\carlos\\java\\Hospital\\src\\enfermeiros.txt";
	
	// ?
	private Tabela tabela;
	private Hospital hospital;
	
	
	
	
}
