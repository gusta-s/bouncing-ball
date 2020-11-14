/**
 * @author Lara Danielly
 *
 */

package entities;

import java.awt.Graphics;

public class Retangulo extends Forma{

	private int base, altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(int arenaAltura, int arenaLargura, Arena arena, int base, int altura, int x, int y) {
		super(arenaAltura, arenaLargura, arena, x, y);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base;
	}

	@Override
	public void desenhar(Graphics g) {
		g.setColor(cor.getCor());
		g.fillRect(x, y, base, altura);
	}

}
