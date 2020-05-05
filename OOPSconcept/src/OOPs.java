class User{
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
	
	User(){
		name ="NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 0;
		address = "NA";
				
	}
	
	void setDetailsForUser(String name, String phone, String email, char gender, int age, String address) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
		
		
	}
	
	
	void showDetailsForUser() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name + phone + "lives in "+ address);
	}
	
}

public class OOPs{
	public static void main(String args[]) {
	
	int i = 10;
	int[] array = new int[] {10,20,30,40,50};
	
	User user1 = new User();
	User user2 = new User();
	User user3 = user1;
	User user4 = new User();
	
	System.out.println(">> i is: "+i);
	System.out.println(">> array is: "+array);
	System.out.println(">>User1 is: "+user1);
	System.out.println(">>User2 is: "+user2);
    System.out.println(">>User3 is: "+user3);
    /*
    user1.name ="Mahesh";
    user1.phone = "+1 5103759162";
    user3.email = "mahesh.khadka@hotmail.com";
    user1.gender = 'M';
    user1.age =31;
    user1.address = "San Mateo st";
    
    user1.name ="Mahesh Khadka";
    user1.email ="mahesh.khadka@hotmail.com";
    
    user2.name = "Sona";
    user2.phone = "+1 5106124842";
    user2.email = "ssonaa_maj@hotmail.com";
    user2.gender ='F';
    user2.age = 31;
    user2.address = "San Mateo St";
    System.out.println(user1.name + " lives in " +user3.address + "His phone no is" +user1.phone+"." + " His email is "+ user1.email + "He is"+ user1.gender);
    */
    
    user1.setDetailsForUser("Mahesh", "+1 5103759162", "mahesh.khadka@hotmail.com", 'M', 31, "San Mateo ST");
    
    user2.setDetailsForUser("Sona", "+1 5106124842", "ssonaa_maj@hotmail.com", 'F' , 31, "San Mateo St");
    
    
    System.out.println("User1 details:");
    user1.showDetailsForUser();
    
    user2.showDetailsForUser();
    
    user3.showDetailsForUser();
    
    user4.showDetailsForUser();
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
}

