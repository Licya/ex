package ch.puleio.junittest1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Licya
 * Created		:	20th June 2014
 * Last update	:	20th June 2014
 * Test the method division
 */
public class DivisionTest 
{

	@Test
	public void testDivision() 
	{
		Division myDiv = new Division();
		double a;
		double b;
		
		a = 1;
		b = 0.005;
		assertEquals(a/b, myDiv.division(a, b), 0.0000000000001);
		
		a = 1;
		b = 0.0;
		assertEquals(a/b, myDiv.division(a, b), 0.00);
	}

}
