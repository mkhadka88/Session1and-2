    class GrandFather {
    	String fname;
    	String lname;
    	int wealth;
    	
    	
    	GrandFather(){
    		System.out.println("Grandfather class has been constructed.");
    		fname = "John";
    		lname = "Watson";
    		wealth = 100000;
    		
    	}
    	
    	void showDetails() {
    		System.out.println(fname + " "+ lname + " has " + wealth);
    	}
    	
    }
    
    class Father extends GrandFather{
    	String fname;
    	int wealth;
    	String vehicle;
   
    	Father(){
    		System.out.println("Father class has been created.");
    	fname = "Jonny";
    		wealth = 70000;
    		vehicle = "Honda";
    	}
    	
    	void showDetails() {
    		System.out.println(fname +" "+ lname +" has "+ wealth + " and a "+ vehicle);
    	
 
    	
    	
    	
    	
    	
    	}	
    	
    }
	public class WhatIsInheritance{
		public static void main(String args[]) {
			//GrandFather gf = new GrandFather();
			//gf.showDetails();
			
			Father f = new Father();
		//f.wealth = f.wealth-50000;
		f.showDetails();
			
		}
	
	
	
	}


