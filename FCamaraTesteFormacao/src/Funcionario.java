import java.util.*;
public class Funcionario {

	public static void main(String[] args) {
		int ano;
		double salario;
		
		
		salario = 1000;
		
		System.out.println("Ano - Salário");
		
		for(ano = 2005; ano<=2018; ano++){
			salario =  salario + salario*0.015;
			System.out.printf("%0,2d - %.2f\n", ano, salario);
		}

	}

}
