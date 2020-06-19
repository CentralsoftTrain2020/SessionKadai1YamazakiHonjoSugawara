package bean;

public class TasizanBean {
	private int a;
	private int b;
	private int answer;


	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "TasizanBean [a=" + a + ", b=" + b + ", answer=" + answer + "]";
	}
}