package myproject.leapyears.tests;
import static org.junit.Assert.*;
import myproject.leapyears.LeapYear;

import org.junit.Before;
import org.junit.Test;


public class LeapYearTest {

	LeapYear leapYear;
	boolean actual;
	boolean expected;
	
	/**
	 * set up code to perform tests.
	 */
	@Before
	public void setUP(){
		leapYear = new LeapYear();
	}

	
	@Test
	public void isLeapYear_2000_True() {
		leapYear.setYear(2000);
		
		actual = leapYear.isLeapYear();
		expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_1700_False() {
		leapYear.setYear(1700);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_1800_False() {
		leapYear.setYear(1800);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_1900_False() {
		leapYear.setYear(1900);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_2100_False() {
		leapYear.setYear(2100);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_2008_True() {
		leapYear.setYear(2008);
		
		actual = leapYear.isLeapYear();
		expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_2012_True() {
		leapYear.setYear(2012);
		
		actual = leapYear.isLeapYear();
		expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	public void isLeapYear_2016_True() {
		leapYear.setYear(2016);
		
		actual = leapYear.isLeapYear();
		expected = true;
		
		assertEquals(expected, actual);
	}

	@Test
	public void isLeapYear_2017_False() {
		leapYear.setYear(2017);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_2018_False() {
		leapYear.setYear(2018);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeapYear_2019_False() {
		leapYear.setYear(2019);
		
		actual = leapYear.isLeapYear();
		expected = false;
		
		assertEquals(expected, actual);
	}

}
