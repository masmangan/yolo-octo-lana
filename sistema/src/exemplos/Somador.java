package exemplos;

public class Somador {
	private int p1;
	private int p2;

	public Somador() {
		p1 = 0;
		p2 = 0;
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public int getSoma() {
		return p1 + p2;
	}
}
