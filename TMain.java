package Pakiet;

import java.io.IOException;

public class TMain {
    public static void main(String []args) throws IOException{
	   TProces myExams = new TProcessSession();
	   ((TProcessSession)myExams).readData(new TScanner("sesja19.csv"));
//       ((TProcessSession)myExams).addElement(new TActivitySession("Java", 3.0, 2));
//       ((TProcessSession)myExams).addElement(new TActivitySession("Big Data", 4.5, 1));
//       ((TProcessSession)myExams).addElement(new TActivitySession("Business Intelligence", 3.5, 3));
//       ((TProcessSession)myExams).showState();
//       ((TProcessSession)myExams).upGrade();
//       ((TProcessSession)myExams).showState();
//       ((TProcessSession)myExams).upGradeClass("Java");
	   TMenu menu = new TMenu();
	   if ((menu.getOpcjaMenu(2)).equals("1"))
       ((TProcessSession)myExams).showState();
	   else System.out.println("Ooops");
//       TScanner myObject = new TScanner("kawa.csv");
//       TScanner myObject = new TScanner("sesja19.csv");
//       myObject.ScannerRead();
//       myObject.ScannerCloseOut();
    }
}
