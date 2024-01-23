package Boletin8_1;
//Ejercicio 1:  Implementa una clase Triangulo, la cual tendrá como atributos: 
//double base
//double altura
//y como métodos:
//public Triangulo()
//public void setBase(double base)
//public void setAltura(double altura)
//public double getBase()
//public double getAltura()

public class Triangulo {

		private double base;
		private double altura;
		
		public Triangulo() {
			this.base=1;
			this.altura=1;
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
