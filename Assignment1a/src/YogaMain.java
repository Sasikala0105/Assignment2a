import java.util.Scanner;

public class YogaMain {

	public static void main(String[] args) {
	
		Participant p = new Participant("Shashy ","Gauthaman ","789-G Jalan sungai dua, penang.");
		System.out.println("Participant name : "+p.toString());
		System.out.println("Participant address : "+ p.getaddress());
		
		StressRelief s = new StressRelief();
		s.benefits();
		System.out.println("-Stress Rellief-");
		System.out.println("The poses and benefits of yoga for Stress Relief : ");
		System.out.println("\t");
		s.setposes("Sukhasana(Easy Pose)");
		System.out.println("First pose : " + s.getposes());
		System.out.println("It will help you calm down and eliminate anxiety. It will also reduce mental and physical exhaustion. ");
		System.out.println("\t");
		s.setposes("Balasana(Child's pose)");
		System.out.println("Second pose : " + s.getposes());
		System.out.println("Balasana is beneficial for your lymphatic system and nervous system. It will calm your mind and release stress. It stretches your thighs, hips and ankles. ");
		System.out.println("\t");
		s.setposes("Paschimottanasana (Seated forward bend)");
		System.out.println("Third pose : " + s.getposes());
		System.out.println("Paschimottanasana will stretch your spine, hamstring and lower back. Apart from relieving stress, this pose will ease the symptoms of PMS, improves digestion, stimulated liver, reduce fatigue and relieves symptoms of menopause.");
		System.out.println("\t");
		s.setposes("Ananda Balasana (Happy baby pose)");
		System.out.println("Fourth pose : " + s.getposes());
		System.out.println("Ananda Balasana will help calm you and get rid of fatigue and stress. It will gently stretch your spine and groin.");
		System.out.println("\t");
		s.setposes("Uttanasana (Standing forward bend)");
		System.out.println("Fifth pose : " + s.getposes());
		System.out.println("Uttanasana will relieve mild depression and stress. It will calm your brain and stimulate your kidneys and liver.");
		
		System.out.println("\t");
		
		Obesity obs = new Obesity();
		System.out.println("-Obesity-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate your BMI first!");
		System.out.print("Input weight in kilogram: ");
     double weight = sc.nextDouble();
     System.out.print("\nInput height in meters: ");
     double height = sc.nextDouble();
     double BMI = weight / (height * height);
     System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
     System.out.println("\t");
		obs.posing();
		obs.health();
		
		System.out.println("\t");
		System.out.println("-Blood Pressure-");
		posing reducepressure = new posing ();
		reducepressure.poses();
		reducepressure.benefits();
		Bloodpressure bps = new Bloodpressure();
		bps.health();
		
		System.out.println("\t");
		Insomnia i = new Insomnia();
		System.out.println("-Insomnia-");
		System.out.println("The poses and benefits of yoga for Insomnia : ");
		i.setposes("Padangusthasana(Big Toe Pose)");
		System.out.println("First pose : " + i.getposes());
		System.out.println("This pose stimulates the liver and kidneys in the back body, activating the parasympathetic nervous system, which is responsible for releasing tension and putting the body to sleep.");
		i.setbenefits("Agnistambhasana(Fire Log Pose");
		System.out.println("Second pose : " + i.getposes());
		System.out.println("As you actively focus on releasing tension in your hips, your body will respond by releasing tension in other muscle groups, preparing you for a relaxing night’s sleep.");
		
		System.out.println("\t");
		System.out.println("-Back Pain-");
		poses backpain = new poses ();
		backpain.poses();
		backpain.benefits();
		
		
		
	
	}

}
