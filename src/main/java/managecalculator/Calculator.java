package managecalculator;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.event.ActionEvent;

import java.io.Serializable;

@Named
@SessionScoped
public class Calculator implements Serializable {
	private static final long serialVersionUID = 1L;
	private String expression;
	
	public Calculator() {
		expression="";
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String ex) {
		expression = ex;
	}

	public void addToExpression(String add) {
		expression+=add;
	}

	public void clearExpression() {
		expression="";
	}

	public void key(ActionEvent event) {
		String add ="";
		
		boolean reset=false;
		switch (event.getComponent().getId()) {
		case "number0": add = "0"; break;
		case "number1": add = "1"; break;
		case "number2": add = "2"; break;
		case "number3": add = "3"; break;
		case "number4": add = "4"; break;
		case "number5": add = "5"; break;
		case "number6": add = "6"; break;
		case "number7": add = "7"; break;
		case "number8": add = "8"; break;
		case "number9": add = "9"; break;
		case "plus": add = "+"; break;
		case "minus": add = "-"; break;
		case "times": add = "*"; break;
		case "divide": add = "/"; break;
		case "reset": reset=true;
		}
		
		if (reset) clearExpression();
		else addToExpression(add);
				
	}
	
	public Integer element(Integer i) {
		if (i < expression.length()) //cuidado!!!
			return Integer.parseInt(expression.substring(i,i+1));
		else return 0;
	}
	
	public Integer sumElement(Integer a, Integer b) {
		return a+b;
	}
	
}
