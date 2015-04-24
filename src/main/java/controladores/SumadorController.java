package controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "sumadorController")
@SessionScoped
public class SumadorController implements Serializable{

	private static final long serialVersionUID = 1L;
	private double operador1;
	private double operador2;
	private double resultado;
	
	private List<Operacion> operaciones = new ArrayList<>();
	private int contador = 1;
	
	public SumadorController(double operador1, double operador2,
			double resultado, List<Operacion> operaciones, int contador) {
		super();
		this.operador1 = operador1;
		this.operador2 = operador2;
		this.resultado = resultado;
		this.operaciones = operaciones;
		this.contador = contador;
	}

	public List<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(List<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public double getOperador1() {
		return operador1;
	}

	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}

	public double getOperador2() {
		return operador2;
	}

	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void doSuma() {
		sumar();
	}
	
	private void sumar() {
		resultado = operador1 + operador2;
		operaciones.add(new Operacion(contador, operador1,operador2,resultado));
		contador++;
	}
	public void doEliminar(Operacion operacion){
		operaciones.remove(operacion);
	}
}

