package test201812;

public class Polymorphic {  
	   public static void main(String [] args)
		{
		   Animal an=new Cat();
		   an.cry();
		   an=new Dog();
		   an.cry();
		}
	private Integer id;
	
	private String name ;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
	