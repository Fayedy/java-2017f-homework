package huluwa;


public class Admin {
	int no;
	String name;
	private String color;
	
	Admin(int no,String name,String color){
		this.no=no;
		this.name=name;
		this.color=color;
		
	}

	void report_position(int i, int j){
        System.out.println(name +  ": " +  i + "->" + j);
}
	
	
	public int get_no() {
		return this.no;
	}
	public void getName() {
		System.out.println(name+":"+name+"");
	}
	public void getColor() {
		System.out.println(name+":"+color+"");
	}
}
