import java.util.*;


public class NumerosPrimos {
	
	private static boolean verifica(int n) {
        for (int j = 2; j < n; j++) {
            if (n%j==0)
                return false;   
        }
        return true;
    }

	public static void main(String[] args) {
		
		int intervalo1 = 0, intervalo2 = 0;
		int i, n, n2;

		
		Scanner intervalo = new Scanner(System.in);
		
		while(intervalo1<=0 && intervalo2<=0){
			
			System.out.println("Os dois intervalos devem ser maiores que 0");
			System.out.println("Digite o primeiro intervalo");
			intervalo1 = intervalo.nextInt();
			
			System.out.println("Digite o segundo intervalo");
			intervalo2 = intervalo.nextInt();
		}
		
		//System.out.println(intervalo1);
		//System.out.println(intervalo2);
		
		n = (intervalo2 + 1)-intervalo1;
		int [] numeros = new int[n];
		int [] primos = new int[n];
		
	for(i = 0; i <= n-1; i++){
			numeros[i] = intervalo1;
			intervalo1 = intervalo1+1;
	}
	
	for(i = 0; i<=n-1; i++){
		if(verifica(numeros[i])){
			System.out.print(numeros[i] + " ");
		}
	
	}
	}
}