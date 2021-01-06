import java.util.Scanner;

public class StressRelief extends Obesity{
	
	
		
		private String benefits;
		private String poses;
		
			
			
		public void benefits() {
			System.out.println("Do you have stress problems?");
	    	Scanner in = new Scanner(System.in);
	    	String benefits = in.next();  
	    	System.out.println("Then, you will know how to calm your body and mind");
	    	
		 }

	    public String getposes() {
	    	return poses;   	
	    }
	    	
	 
	    public void setposes(String poses) {
	    	this.poses = poses;
	    }
	    public String getbenefits() {
	    	return benefits;
	    }
	    public void setbenefits (String benefits) {
	    	this.benefits = benefits;
	    }
	    	
	    void health() {
	    System.out.println("You'll be healthy and fine.");
	    super.health();
			
	
			
		

	

		
		
	}

}

