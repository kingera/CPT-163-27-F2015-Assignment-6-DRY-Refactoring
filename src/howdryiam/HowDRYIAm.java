package howdryiam;

import java.util.Scanner;

public class HowDRYIAm {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	// Dimensions Prep
	double width;
	double depth;
	double height;
	Dimensions dim1;
	Dimensions dim2;
	
	// address Prep
	String name;
	String street;
	String state;
	String city;
	int zip;
	Address address1;
	Address address2;
		
	
	LabelPrinter label1;
	LabelPrinter label2;
	
	// Preparing First Box
	
	Address[] address = new Address[2];
        Dimensions[] dim = new Dimensions[2];
        LabelPrinter[] label = new LabelPrinter[2];
        for (int i = 0; i < 2;i++){
            println("Constructing Address "+ (i+1));
            println("Attn:");
            name = keyboard.next();
            println("Street:");
            street = keyboard.next();
            println("City:");
            city = keyboard.next();
            println("State:");
            state = keyboard.next();
            println("ZipCode:");
            zip = keyboard.nextInt();
            
            address[i] = new Address(city, street, city, state, zip);
            
            println("Constructing Box "+ (i+1));
            println("Height:");
            height = keyboard.nextDouble();
            println("Width:");
            width = keyboard.nextDouble();
            println("Depth:");
            depth = keyboard.nextDouble();
	
            dim[i] = new Dimensions(width, height, depth);
	
            label[i] = new LabelPrinter(address[i], dim[i]);
        }
	
	//Printing Labels
	label[0].printLabel();
	label[1].printLabel();
  }
  
  
  public static void println(String message){
	System.out.println(message);
  }
}
