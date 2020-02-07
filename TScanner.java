package Pakiet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TScanner  implements Serializable {
	TScanner(String arg) throws IOException {
		ScannerIn = new Scanner(new FileReader(arg));
		ScannerIn.useDelimiter(";");
	}
	
	public void ScannerRead() throws IOException {
		while (ScannerIn.hasNextLine()){
			while (ScannerIn.hasNext())	{
				if (ScannerIn.hasNextDouble()) {
					System.out.print(ScannerIn.nextDouble() + " "); 
				} else {		
					System.out.print(ScannerIn.next() + " "); 
				}
			}
			System.out.println();
		}	
	}
	public void fillArray(ArrayList<TActivity> aList) throws IOException {
		while (ScannerIn.hasNextLine()){
			while (ScannerIn.hasNext())	{
				if (ScannerIn.hasNextDouble()) {
					System.out.print(ScannerIn.nextDouble() + " "); 
				} else {		
					System.out.print(ScannerIn.next() + " "); 
				}
			}
			System.out.println();
		}	
	}
	
	public void ScannerCloseOut() throws IOException{
		ScannerIn.close();
	}
	
	Scanner ScannerIn;
}
