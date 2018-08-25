package Forma;

import java.util.*;

public class UsaRetangulo {

	
	public static void main(String[] args) {
		
		double altura, largura, altura1, largura1, altura2, largura2;
		double arealocal, perimetrolocal, perimetrorodape, areapiso, totalrod, totalpis;
		double loc=0, loc1=0, rod=0, rod1=0, pis=0, pis1=0;
		int totalr, totalp;
		
		Retangulo local = new Retangulo(0,0);
		Retangulo rodape = new Retangulo(0,0);
		Retangulo piso = new Retangulo(0,0);
		
		Scanner l = new Scanner(System.in);
		
		while(loc<=0 || loc1<=0 || rod<=0 || rod1<=0 || pis<=0 || pis1<=0 ){
			System.out.println("Digite a altura do local");
			loc = l.nextDouble();
			local.setAltura(loc);
			
			System.out.println("Digite a largura do local");
			loc1 = l.nextDouble();
			local.setLargura(loc1);
			
			System.out.println("Digite a altura do rodapé");
			rod = l.nextDouble();
			rodape.setAltura(rod);
			
			System.out.println("Digite a largura do rodapé");
			rod1 = l.nextDouble();
			rodape.setLargura(rod1);
			
			System.out.println("Digite a altura do piso");
			pis = l.nextDouble();
			piso.setAltura(pis);
			
			System.out.println("Digite a largura do piso");
			pis1 = l.nextDouble();
			piso.setLargura(pis1);
		}
		
		altura = local.getAltura();
		largura = local.getLargura();
		altura1 = rodape.getAltura();
		largura1 = rodape.getLargura();
		altura2 = piso.getAltura();
		largura2 = piso.getLargura();
		
		arealocal = local.calculaArea(largura, altura);
		perimetrolocal = local.calculaPerimetro(altura, largura);
		perimetrorodape = rodape.calculaPerimetro(altura1, largura1);
		areapiso = piso.calculaArea(largura2, altura2);
		
		totalrod = perimetrolocal/perimetrorodape;
		totalpis = arealocal/areapiso;
		
		if(perimetrolocal%perimetrorodape == 0){
			totalr = (int)totalrod;
		}
		else{
			totalr = (int)Math.round(totalrod+0.5d);
		}
		
		if(arealocal%areapiso == 0){
			totalp = (int)totalpis;
		}
		else{
			totalp = (int)Math.round(totalpis+0.5d);
		}
		

		System.out.printf("Será necessário %d rodapés e %d pisos para o local\n", totalr, totalp);
		

	}

}
