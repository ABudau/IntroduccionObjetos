package Boletin8_1;

public class Triangulo {
//	Ejercicio 1:  Implementa una clase Triangulo, la cual tendrá como atributos: 
//		double base
//		double altura
//		y como métodos:
//		public Triangulo()
//		public void setBase(double base)
//		public void setAltura(double altura)
//		public double getBase()
//		public double getAltura()
	
		private double base;
		private double altura;
		
		public Triangulo() {
			// TODO Auto-generated constructor stub
		}

		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			if (base>0) {
				this.base = base;
			}
			
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			if (altura>0) {
				this.altura = altura;
			}
			
		} 
}
