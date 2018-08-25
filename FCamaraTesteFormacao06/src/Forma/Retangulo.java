package Forma;

public class Retangulo {
	private double altura;
	private double largura;
	private double area;
	private double perimetro;
	
	public Retangulo(double altura, double largura) {
		this.largura = 0;
		this.altura = 0;
		this.area = 0;
		this.perimetro = 0;
				
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calculaArea(double largura, double altura){
		area = largura*altura;
		return area;
	}
	
	public double calculaPerimetro(double altura, double largura){
		perimetro = (2*altura) + (2*largura);
		return perimetro;
	}
}
