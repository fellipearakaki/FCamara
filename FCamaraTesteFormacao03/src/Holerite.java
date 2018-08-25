import java.util.*;

public class Holerite {
	public static double calculaHora(double sal){
		double hr;
		hr = sal * 0.1;
		return hr;
	}
	public static double salarioBruto(double horas, double hora){
		double salariobruto;
		salariobruto = horas * hora;
		return salariobruto;
	}
	
	public static double salarioLiquido(double b){
		double liq;
		liq = b- (b*0.03);
		return liq;
	}

	public static void main(String[] args) {
		double liquido, bruto, salario, hrs, hr;
		int horas, hora;
		Scanner h = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario minimo");
		salario = s.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas");
		horas = h.nextInt();
		
		hora =(int) (calculaHora(salario));
		hrs = (double)horas;
		hr = (double)hora;
		
		bruto = salarioBruto(hrs, hr);
		liquido = salarioLiquido(bruto);
		
		System.out.printf("O salário líquido a receber é: %.2f", liquido);
		

	}

}
