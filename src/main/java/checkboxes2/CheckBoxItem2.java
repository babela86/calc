package checkboxes2;

public class CheckBoxItem2 {
	private int id;
	private String value;
	private static int contador=1;
	
	public CheckBoxItem2(String val) {
		super();
		id=contador++;
		value = val;
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String val) {
		value = val;
	}

}
