import java.util.Scanner;

public class TemperatureConverter {

	static String ftoC(Float f){//
		return String.valueOf((f-32)*5/9)+"C";
	}
	static String ctoF(Float c){
		return String.valueOf(5/9*c+32)+"F";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp;
		char unite;
		char response;
		Scanner sc = new Scanner(System.in);
		System.out.println("  ==  Temperature Converter  ==");

		do{
			do{
				System.out.println("Entrer Your Temperature (like 37F or 214C)");
				String read  = sc.nextLine();
				unite = read.substring(read.length()-1).toUpperCase().charAt(0);
				temp =  Float.parseFloat(read.substring(0,read.length()-1));
			}while(unite != 'F' && unite != 'C');
			
			String result  = (unite == 'F') ? ftoC(temp):ctoF(temp);
			System.out.println("Temperature "+temp+unite+" Converter to "+ result+"");
			
			 do{
				 System.out.println("do You Want to do Anothor Operation ?(Y/N)");
				 response = sc.nextLine().toUpperCase().charAt(0);
			       
			 }while(response != 'Y' && response != 'N');
			     
		}while(response == 'Y');
	}

}
