package pojo;

public class user {
	public user(){}
public user(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
private int age;
private int userId;//主键
}
