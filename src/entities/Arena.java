/**
 * @author Victor Emanuel
 *
 */

package entities;

public class Arena {
	protected int largura, altura;
	
	private Forma forma;
	private Forma[] formas = new Forma[]{new Quadrado(), new Retangulo(), new Circulo()};
	
	public Arena(int largura, int altura) {
		if (largura <= 100 || altura <= 100) {
			System.out.println("Dimensoes invalidas. Insira dimensoes maiores");
			return;
		}
		this.largura = largura;
		this.altura = altura;
		forma = new Circulo(getAltura(), getLargura(), this, 25, getLargura()/2, getAltura()/2);
	}

	public Forma[] getFormas() {
		return formas;
	}
	
	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Forma getForma() {
		return forma;
	}
	
	public void setForma(Forma forma) {
		this.forma = forma;
	}
}
