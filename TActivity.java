package Pakiet;

public class TActivity {
	TActivity(String activityName, int timeStamp){
	    this.activityName = activityName;
		this.timeStamp = timeStamp;
	}
	public void showState(){
	    System.out.print(" - " + this.activityName +
	    		" " + this.timeStamp);
	}
	public String getActivityName(){
		return activityName;
	}
	private String activityName;  
	private int timeStamp;
}
