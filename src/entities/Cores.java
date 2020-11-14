/**
 * @author Lucas Digian
 */

package entities;

import java.awt.Color;

public class Cores {
	private Color[] cores = new Color[] {
		Color.white, Color.blue, Color.cyan,
		Color.green, Color.magenta, Color.orange,
		Color.yellow, Color.pink, Color.gray,
		Color.lightGray, Color.red
	};
	private Color cor;
	
	public Cores() {
	}
	
	public Cores(int index) {
		cor = cores[index];
	}

	public Color[] getCores() {
		return cores;
	}
	
	public Color getCor() {
		return cor;
	}

	public int getSizeCores() {
		return cores.length;
	}
}
