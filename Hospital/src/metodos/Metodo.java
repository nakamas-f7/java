package metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import classes.Funcionarios;


public class Metodo{
	
	private String path = "C:\\Users\\Cerâmica Betel\\eclipse-workspace\\Hospital\\src\\medicos.txt";
	
	
	
	
	public void medicos(String nome, String senha){
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			line = br.readLine();
			while(line != null) {
				
				String[] vect = line.split(",");
				
				String name = vect[0];
				Integer idade = Integer.parseInt(vect[1]);
				Integer cpf = Integer.parseInt(vect[2]);
				String tipo = vect[3];
				String sen = vect[4];
				
				Funcionarios funcionarios = new Funcionarios(name,idade,cpf,tipo,sen);
				funcionarios.medico();
				
				
				
				if(nome.length() == name.length()) {
					break;
				}
				
				line = br.readLine();
				
				
				}
				
				
				
				
				
				
			}catch(IOException x){
				System.out.println(x.getMessage());
			}
			
			
			
		}
			
		
		
			
			
			
			
			}


