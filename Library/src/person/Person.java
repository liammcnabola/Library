package person;

public class Person {

	public static int membershipCount = 1;
	public int membershipId;
	public String name;
	public int age;
	public String postCode;

	public Person(int membershipId, String name, int age, String postCode) {
		super();
		this.membershipId = membershipCount++;
		this.name = name;
		this.age = age;
		this.postCode = postCode;
		;
	}

	public void personPrint() {
		System.out.println("Membership ID: " + this.membershipId);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Postal Code: " + this.postCode );
	}

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

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

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Person [membershipId=" + membershipId + ", name=" + name + ", age=" + age + ", postCode=" + postCode
				+ "]";
	}

}