package Pakiet;

public class TActivitySession extends TActivity{
	TActivitySession(String activityName, double activityGrade, 
			int timeStamp){
	    super(activityName, timeStamp);
		this.activityGrade = activityGrade;
	}
	public void upGradeActivity(){
		if (this.activityGrade<4.5)
			this.activityGrade++;
	}
	public void showState(){
		super.showState();
	    System.out.println("   " + this.activityGrade);
	}	
	public double getActivityGrade(){
		return activityGrade;
	}
	private double activityGrade;
}
