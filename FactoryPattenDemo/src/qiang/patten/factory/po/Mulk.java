package qiang.patten.factory.po;

public abstract class Mulk {
	
	private String name;
	private String color;

	public String getName() {
		return name;
	}
	
	public Mulk(String name){
		this.name=name;
		this.color="white";
	}
	
	

}
