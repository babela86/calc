package managecalculator;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.event.ActionEvent;

import net.objecthunter.exp4j.*;

import java.io.Serializable;

@Named
@SessionScoped
public class Calculator implements Serializable {
	private static final long serialVersionUID = 1L;
	private String expression;
	private boolean clean;
	
	public Calculator() {
		expression = "0";
		clean = true;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String ex) {
		expression = ex;
	}

	public void addToExpression(boolean c, String add) {
		if (clean || c) expression=add;
		else expression+=add;
	}

	public String myResult() {
		
		double r = 0;
		double e1 = Integer.parseInt(expression.charAt(0)+"");
		char op = expression.charAt(1);
		double e2 = Integer.parseInt(expression.charAt(2)+"");
		
		switch (op) {
		case '+':
			r = e1 + e2;
			break;
		case '-':
			r = e1 - e2;
			break;
		case '*':
			r = e1 * e2;
			break;
		case '/':
			r = e1 / e2;
		}
		
		if (r % 1 == 0) {
			String s=r+"";
			return s.substring(0, s.length()-2);
		}
		
		return r+"";
	}
	
	public String result() {
		
		Expression e = new ExpressionBuilder(expression).build();
		double r = e.evaluate();
		
		if (r % 1 == 0) {
			String s=r+"";
			return s.substring(0, s.length()-2);
		}
		
		return r+"";
		
	}

	public void key(ActionEvent event) {
		String add ="";
		
		boolean c = false, r = false;
		
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
		case "result": add = result(); r = true; c = true; break;
		case "reset": add = "0"; c = true; 
		}
		
		addToExpression(c,add);
		if (r || expression.equals("0")) clean = true;
		else clean = false;
				
	}
	
}
