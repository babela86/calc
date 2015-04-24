package controladores;

public class Operacion {

	private int id;
	private double operando1;
	private double operando2;
	private double resultado;

	public Operacion(int id, double operando1, double operando2, double resultado) {
		this.id = id;
		this.operando1 = operando1;
		this.operando2 = operando2;
		this.resultado = resultado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
}


