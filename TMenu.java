package Pakiet;
import java.util.Scanner;

public class TMenu {
	TMenu(){
		this.opcjaMenu="";
	}
	public String getOpcjaMenu(int opcja){
		   Scanner scan = new Scanner(System.in);
			if(opcja>0)
			{
			System.out.println("Podaj co chcesz zrobic 1/2:");
			System.out.println("1. Show state");
			System.out.println("2. Show Max Grade");
			this.opcjaMenu=scan.nextLine();
			this.opcjaMenu=this.opcjaMenu.toUpperCase();
			if(this.opcjaMenu.contentEquals("1") || this.opcjaMenu.equals("2"))
			{
				System.out.println("Wybrana opcja: "+this.opcjaMenu);
				return this.opcjaMenu;
			}
			else
				{
					System.out.println("Nieporawna opcja.Pozosta³o prób: "+(opcja-1));
					return "" + getOpcjaMenu(opcja-1);
				}
			}
			else
			{
				System.out.println("Niepoprawna opcja. Program ulegnie zamknieciu.");
				System.exit(0);
				return "";
			}
	} 
	private String opcjaMenu;
}
