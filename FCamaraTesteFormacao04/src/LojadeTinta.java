import java.util.*;
import java.math.*;

public class LojadeTinta {

	public static void main(String[] args) {
		int m = 0;
		int qtd;
		double latas;
		double valor = 80.00;
		
		Scanner tamanho = new Scanner(System.in);
		
		while(m<=0){
			System.out.println("Digite o tamanho da área a ser pintada em metros quadrados");
			m = tamanho.nextInt();
		}
		
		if(m<=6){
			System.out.println("Deverá ser comprada 1 lata no valor total de R$ 80,00 reais");
		}
		
		else{
			latas = m/6;
			qtd = (int) Math.round(latas+0.5d);
			valor = valor * qtd;
			
			System.out.printf("Deverão ser compradas %d latas com o valor total de %.2f reais\n", qtd, valor);
		}
		

	}

}
