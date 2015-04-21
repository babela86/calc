package checkboxes2;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CheckBoxItems2 implements Serializable {

	private static final long serialVersionUID = 3780504477071569120L;
	private Integer[] values;
	private List<CheckBoxItem2> lista;
	
	public CheckBoxItems2() {
		values = new Integer[7];
		for (int i=0;i<7;i++) values[i] =i+1;
		lista = new ArrayList<>();
		lista.add(new CheckBoxItem2("Sabor1"));
		lista.add(new CheckBoxItem2("Sabor2"));
		lista.add(new CheckBoxItem2("Sabor3"));
		lista.add(new CheckBoxItem2("Sabor4"));
		lista.add(new CheckBoxItem2("Sabor5"));
		lista.add(new CheckBoxItem2("Sabor6"));
		lista.add(new CheckBoxItem2("Sabor7"));
	}

	public Integer[] getValues() {
		return values;
	}

	public void setValues(Integer[] val) {
		values = val;
	}

	public List<CheckBoxItem2> getLista() {
		return lista;
	}

}
