/**
 * @authors Gustavo Soares, Marcos Costa
 */

package entities;

import java.awt.Graphics;
import java.util.Random;

public abstract class Forma {
	
	/**
	 * @authors Gustavo Soares, Marcos Costa
	 */

	private Arena arena;

	protected int tA, tL;
	private Random r = new Random();
	protected int x, y, velocidade;
	protected int diametro = 20;
	protected boolean cima = false, direita = false;
	protected Cores cor = new Cores();

	/**
	 * @author Gustavo Soares, Marcos Costa
	 */

	public Forma() {
	}
	
	public Forma(int arenaAltura, int arenaLargura, Arena arena, int x, int y) {
		this.arena = arena;
		this.x = x;
		this.y = y;
		cor = new Cores(r.nextInt(cor.getSizeCores()));
		tA = arenaAltura;
		tL = arenaLargura;
		velocidade = r.nextInt(5)+1;
		cima = r.nextBoolean();
		direita = r.nextBoolean();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public int gerarNumeroAleatorio(int limite) {
		return r.nextInt(limite);
	}
	
	/**
	 * @author Marcos Costa
	 */
	public Forma morph(Forma forma, Forma[] formas) {
		int x_aux = forma.getX();
		int y_aux = forma.getY();
		
		forma = formas[r.nextInt(formas.length)];
		
		if (forma instanceof Circulo) {
			forma = new Circulo(tA, tL, arena, 25, x_aux - velocidade, y_aux - velocidade);
			forma.setDiametro(diametro + 2);
			System.out.println("circulo");
		}
		else if (forma instanceof Quadrado){
			forma = new Quadrado(tA, tL, arena, 40, x_aux, y_aux);
			System.out.println("quadrado");
		}
		else {
			forma = new Retangulo(tA, tL, arena, 50, 40, x_aux, y_aux);
			System.out.println("retangulo");
		}
		
		return forma;
	}

	/**
	 * @author Gustavo Soares
	 */
	public void mover() {
		if (direita) {
			x += velocidade;
		}
		else {
			x -= velocidade;
		}
		
		if (cima) {
			y -= velocidade;
		}
		else {
			y += velocidade;
		}
		
		if (x < 30) {   // depois de v�rios testes, o melhor valor para a condi��o foi 30
			direita = true;
			setVelocidade(velocidade += gerarNumeroAleatorio(2));
		}
		
		if (x > (tL - diametro)) {
			direita = false;
		}
		
		if (y < 30) {
			cima = false;
			setVelocidade(velocidade -= gerarNumeroAleatorio(2));
		}
		
		if (y > (tA - diametro)) {
			cima = true;
			
		}
		
		// condi��es para mudar de forma
		if (y <= 50 || x <= 50) {
			arena.setForma(moph(this, arena.getForma()));
			cor = new Cores(gerarNumeroAleatorio(cor.getSizeCores()));
			setVelocidade(velocidade -= gerarNumeroAleatorio(2));
		}
		
		if (y > (tA - diametro) || x > (tL - diametro)) {
			arena.setForma(morph(this, arena.getFormas()));
			cor = new Cores(gerarNumeroAleatorio(cor.getSizeCores()));
		}
	}

	@Override
	public String toString() {
		return "x: " + x + ", y: " + y + ", velocidade: " + velocidade;
	}
}
