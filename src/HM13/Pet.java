package HM13;

public abstract class Pet {
	protected String name;
	//private Food Food;
	public String toString(){
		return this.name;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Pet(String name) {
		//super();
		this.name = name;
	}
	public void eat(Food food){
		
	}
	
}
