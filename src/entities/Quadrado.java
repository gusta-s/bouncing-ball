/**
 * @author Rebeca Carvalho, Lara Danielly
 *
 */

package entities;

import java.awt.Graphics;

public class Quadrado extends Forma{

	private int lado;
	
	public Quadrado() {
		super();
	}

	/**
	 * @author Lara Danielly
	 */
	public Quadrado(int arenaAltura, int arenaLargura, Arena arena, int lado, int x, int y) {
		super(arenaAltura, arenaLargura, arena, x, y);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	/**
	 * @author Rebeca Carvalho
	 */
	@Override
	public double area() {
		return lado;
	}

	/**
	 * @author Rebeca Carvalho
	 */
	@Override
	public void desenhar(Graphics g) {
		g.setColor(cor.getCor());
		g.fillRect(x, y, lado, lado);
	}

}
