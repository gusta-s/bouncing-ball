/**
 * @author Rebeca Carvalho
 *
 */

package entities;

import java.awt.Graphics;

public class Circulo extends Forma {

	private int diametro;
	
	public Circulo() {
		super();
	}
	public Circulo(int arenaAltura, int arenaLargura, Arena arena, int diametro, int x, int y) {
		super(arenaAltura, arenaLargura, arena, x, y);
		this.diametro = diametro;
	}
	
	public int getDiametro() {
		return diametro;
	}

	@Override
	public double area() {
		return (double)diametro;
	}
	
	@Override
	public void desenhar(Graphics g) {
		g.setColor(cor.getCor());
		g.fillOval(x, y, diametro, diametro);	
	}

}
