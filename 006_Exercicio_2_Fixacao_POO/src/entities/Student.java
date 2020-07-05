package entities;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double nota(){
		return (n1 + n2 + n3);
	}
	
	public String situation() {
		if (nota() >= 60) {
			return "Pass";
		}
		else {
			return "Failed %nMissing "
					+ (60 - nota());
		}
	}
	
}
