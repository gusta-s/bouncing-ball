/**
 * @authors Gustavo Soares, Marcos Costa
 */

package entities;

import java.util.Random;

public abstract class Forma {
	
	private Random r = new Random();
	protected int x, y, velocidade;
	protected int diametro = 20;
	protected boolean cima = false, direita = false;
	
	public Forma() {
	}
	
	public Forma(int x, int y) {
		this.x = x;
		this.y = y;
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
		
		if (x < 30) {   // depois de vários testes, o melhor valor para a condição foi 30
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
		
		// condições para mudar de forma
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
}
