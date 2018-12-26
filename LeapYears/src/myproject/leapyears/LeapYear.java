package myproject.leapyears;

public class LeapYear {
	
	
	/**
	 * member variable year
	 */
	private int year;

	
	/**
	 * Getter method for member variable year 
	 * @return
	 */
	public int getYear() {
		return year;
	}

	
	/**
	 * Setter method for member variable year
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
	/**
	 * Method to check if the given year is leap year or not
	 * @return boolean true or false
	 */
	public boolean isLeapYear() {
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
			return true;
		}else{
			return false;
		}
		
	}
	
}
