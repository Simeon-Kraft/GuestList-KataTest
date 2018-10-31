package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuestListTest {

	@Test
	public void testGetCount1() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Simeon", 26, true);
		//act
		int actual = guestList.getCount();
		
		//assert 
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount2() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Jake", -1, false);
		
		//act
		int actual = guestList.getCount();
		
		//assert 
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount7() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Jake", -1, false);
		guestList.add("Simeon", 26, true);
		//act
		int actual = guestList.getCount();
		
		//assert 
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount3() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Simeon", 26, false);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert 
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount4() {
		//arrange
		GuestList guestList = new GuestList();
		//guestList.add("Simeon", 26, false);
		
		//act
		int actual = guestList.getSum();
		
		//assert 
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount5() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Simeon", 0, false);
		guestList.add("August", -1, false);
		
		//act
		int actual = guestList.getSum();
		
		//assert 
		int expected = -1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount6() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Simeon", 26, true);
		guestList.add("August", 1, true);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert 
		int expected = 2;
		assertEquals(expected, actual);
	}
	

}
