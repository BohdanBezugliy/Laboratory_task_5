import java.util.Scanner;

import printer.Printer;

public class Laboratory_task_5 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count printers: ");
		int CountPrinters = Integer.parseInt(sc.nextLine());
		Printer [] arrPrinters = new Printer [CountPrinters];
		String printText;
		int i = 1;
		for(Printer printer: arrPrinters)
		{
			System.out.println("Enter information about printer " + i);
			printer = new Printer();
			System.out.print("Name of printer: ");
			printer.setName(sc.nextLine());
			
			System.out.print("Producer of printer: ");
			printer.setProducer(sc.nextLine());
			
			System.out.print("Speed print(ppm) of printer: ");
			int speedPrint = Integer.parseInt(sc.nextLine()); // Parse the entered string to integer
			printer.setSpeedPrint(speedPrint);
			
			System.out.print("Type of printer: ");
			printer.setType(sc.nextLine());
			
			System.out.print("Color print of printer (true or false): ");
			boolean colorPrint = Boolean.parseBoolean(sc.nextLine());
			printer.setColorPrint(colorPrint);
			
			System.out.print("Format print (A2,A3,A4...) of printer: ");
			printer.setPrintFormat(sc.nextLine());
			
			System.out.print("Connect type: ");
			printer.setTypeConnect(sc.nextLine());
			
			System.out.print("Price of printer: ");
			float price = Float.parseFloat(sc.nextLine());
			printer.setPrice(price);
			
			System.out.println("------------------------------------------------------------------------");
			
			System.out.print("Enter text for print: ");
			printText = sc.nextLine();
			System.out.printf("Printing text on printer %s\n",printer.getName());
			printer.Print(printText);
			if(printer.isColorPrint())
			{
				printer.Print(printText + " (color: yellow)", "yellow");
				printer.Print(printText + " (color: red)", "red");
				printer.Print(printText + " (color: green)", "green");
				printer.Print(printText + " (color: blue)", "blue");
				printer.Print(printText + " (color: magneta)", "magenta");
				printer.Print(printText + " (color: cyan)", "cyan");
			}
			else
			{
				printer.Print(printText + " (color: yellow)", "yellow");
				// For demonstration how do work if printer cannot print color text
			}
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Printer " + i + ":");
			System.out.println("Name of printer: " + printer.getName());
			System.out.println("Producer of printer: " + printer.getProducer());
			System.out.println("Speed print(ppm) of printer: " + printer.getSpeedPrint());
			System.out.println("Type of printer: " + printer.getType());
			System.out.println("Color print of printer (true or false): " + printer.isColorPrint());
			System.out.println("Format print (A2,A3,A4...) of printer: " + printer.getPrintFormat());
			System.out.println("Connect type: " + printer.getTypeConnect());
			System.out.printf("Price of printer: %.2f\n",printer.getPrice());
			System.out.println("------------------------------------------------------------------------\n");
			i++;
		}
		sc.close();
	}

}
