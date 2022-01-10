package capg.assignment_1.model;


public class Model {
	
private String Rollnumber;
private String name;
private int mark1;
private int mark2;
private int mark3;
private int total;
private String grade;

public Model() {}

public Model(String rollnumber, String name, int mark1, int mark2, int mark3) {
	super();
	this.Rollnumber = rollnumber;
	this.name = name;
	this.mark1 = mark1;
	this.mark2 = mark2;
	this.mark3 = mark3;
	this.total = this.mark1+this.mark2+this.mark3;
	if(this.total>=275)
		this.grade="A";
	else if(this.total>=250)
		this.grade="B";
	else if(this.total>=225)
		this.grade="C";
	else if(this.total>=200)
		this.grade="D";
	else
		this.grade="F";
}
public String getRollnumber() {
	return Rollnumber;
}
public void setRollnumber(String rollnumber) {
	this.Rollnumber = rollnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMark1() {
	return mark1;
}
public void setMark1(int Mark1) {
	this.mark1 = Mark1;
}
public int getMark2() {
	return mark2;
}
public void setMark2(int Mark2) {
	this.mark2 = Mark2;
}
public int getMark3() {
	return mark3;
}
public void setMark3(int Mark3) {
	this.mark3 = Mark3;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) { this.total = this.mark1+this.mark2+this.mark3; }

public String getGrade() {
	return grade;
}

  public void setGrade(String grade) { 
	  int sum=this.mark1+this.mark2+this.mark3;
	  if(sum>=275) this.grade="A"; else
  if(sum>=250) this.grade="B"; else if(sum>=225) this.grade="C";
  else if(sum>=200) this.grade="D"; else this.grade="F"; }
  
@Override
public String toString() {
	return "Model [Rollnumber=" + Rollnumber + ", Name=" + name + ", Mark1=" + mark1 + ", Mark2=" + mark2 + ", Mark3="
			+ mark3 + ", Total=" + total + ", grade=" + grade + "]";
}

}
