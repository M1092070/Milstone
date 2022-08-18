package milstonerea2;

public class Person {
 private int id;
 private int age;
 private int purchaseamount;
 private String name;
public Person(int id, int age, int purchaseamount, String name) {
	super();
	this.id = id;
	this.age = age;
	this.purchaseamount = purchaseamount;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getPurchaseamount() {
	return purchaseamount;
}
public void setPurchaseamount(int purchaseamount) {
	this.purchaseamount = purchaseamount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [id=" + id + ", age=" + age + ", purchaseamount=" + purchaseamount + ", name=" + name + "]";
}
 
 


}
 
 


