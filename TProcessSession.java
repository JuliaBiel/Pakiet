package Pakiet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TProcessSession extends TProces{
	TProcessSession(){
		super();
		this.procesGrade = 0.0;
	}
	public void addElement(TActivitySession arg){
		getActivityList().add(arg);
		procesGrade();
	  }
	public void readData(TScanner obj) throws IOException{
		obj.fillArray(this.getActivityList());
	}
	private void procesGrade(){
		double sum = 0.0;
		int count = 0;
		for (TActivity temp : getActivityList()){
		      sum+=((TActivitySession)temp).getActivityGrade();
		      count++;
		}
		procesGrade = sum/count;
	}
	public void upGrade(){
		for (TActivity temp : getActivityList()){
			((TActivitySession)temp).upGradeActivity();
		}
		procesGrade();
	}
	public void upGradeClass(String Class){
		for (TActivity temp : getActivityList()){
			if (temp.getActivityName()==Class)
				((TActivitySession)temp).upGradeActivity();
		}
		procesGrade();
	}
	public void showState(){
	    super.showState();
	    System.out.println(" Mean process grade is  " + this.procesGrade);
	}  	
	private double procesGrade;
}
