package Pakiet;
import java.util.ArrayList;
public class TProces {
	  TProces(){
	    activityList = new ArrayList<TActivity>();
	  }
	  public void addElement(TActivity arg){
	    activityList.add(arg);
	  }
	  public void showState(){
	    for (TActivity temp : activityList)
	      temp.showState();
	  }  
	  public ArrayList<TActivity> getActivityList(){
		  return activityList;
	  }
	  private ArrayList<TActivity> activityList;
}
