import java.util.Scanner;
public class manavKasa {

	public static void main(String[] args) {
		double pricePear=2.14;
		double priceApple=3.67;
		double priceTomato=1.11;
		double priceBanana=0.95;
		double priceEggplant=5;
		Scanner kb=new Scanner(System.in);
		System.out.println("How many kilograms of pears: ");
		double p=kb.nextDouble();
		System.out.println("How many kilograms of apple: ");
		double a=kb.nextDouble();
		System.out.println("How many kilograms of tomato: ");
		double t=kb.nextDouble();
		System.out.println("How many kilograms of bananas: ");
		double b=kb.nextDouble();
		System.out.println("How many kilograms of eggplants: ");
		double e=kb.nextDouble();
		double total=(pricePear*p)+(priceApple*a)+(priceTomato*t)+(priceBanana*b)+(priceEggplant*e);
		System.out.println("Total price is "+total+"$");
		
		
		
		
		

	}

}
