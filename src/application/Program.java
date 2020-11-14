/**
 * @author Lucas Digian
 */

package application;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

import entities.Arena;

public class Program extends JFrame implements Runnable {
	
	private Arena arena = new Arena(900, 600);
	Random r = new Random();
	private Thread thread;
	
	public Program() {
		setBounds(200, 200, arena.getLargura(), arena.getAltura());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g) {		
		g.setColor(Color.black);
		g.fillRect(0, 0, arena.getLargura(), arena.getAltura());
		arena.getForma().desenhar(g);
	}
	
	public void run() {
		while(true) {
			arena.getForma().mover();
			System.out.println(arena.getForma());
			repaint();
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				System.out.println("Erro: " + e);
			}
		}
	}
	
	public static void main(String[] args) {
		new Program();
	}

}
