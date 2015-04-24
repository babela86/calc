package table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class TableItems implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<TableItem> mymap;

	public TableItems(){
		this.mymap=new ArrayList<>();
		this.mymap.add(new TableItem("Choice A"));
		this.mymap.add(new TableItem("Choice B"));
		this.mymap.add(new TableItem("Choice C"));
	}
	public List<TableItem> getAllItems(){
		return this.mymap;
	}

	public String getSumary(){
		return "Table os items for sale";
	}

	public String getId(){
		return "Product id";
	}
	public String getName(){
		return "Product name";
	}
	public String getCaption(){
		return "A table for the class";
	}
}
