package ejerciciosingles;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	public Time() {
		
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return zeroToTheleft(hour) + ":" + zeroToTheleft(minute)  + ":" + zeroToTheleft(second);
	}
	
	   //Modifyin the current one
	   public Time previousSecond() {
	       substractASecond(this);
	       return this;

	   }
	
	   private String zeroToTheleft(int num) {
		   String result = "";
		   
		   result=String.valueOf(num);
		   
		   if (num<10) {
			   result = "0" + result;
		   }
		return result;
	   }
	   
	   
	//Returning a new object
	public Time previousSecondNew () {
		Time time = new Time(this.hour,this.minute, this.second);
		
		return time;
	}
	
	private void substractASecond (Time time) {
		
		if (time.getSecond()==0) {
			
			time.setSecond(59);
			
			if (time.getMinute()==0) {
				time.setMinute(59);	
			}if (time.getHour()==0) {
				time.setHour(23);
			}else  {
				time.setHour(time.getHour()-1);
				
			}
		}
			else {
				time.setMinute(time.getMinute()-1);
			} 
	}
			else {
				time.setSecond(time.getSecond()-1);

			}
	}
			
		}
		
		
	
	

	

