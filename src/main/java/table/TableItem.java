package table;

public class TableItem {
	
	// this is just for test
	private int id;
	private String value;
	private static int counter=1;
	
	public TableItem(String value) {
		super();
		this.id=counter++;
		this.value=value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
