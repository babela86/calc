package playjsf;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class playJSF implements Serializable{
	private static final long serialVersionUID = 1L;

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String nextPage(){
		if(this.value==1)
			return "page1";
		else
			return "page2";
	}
	
}
