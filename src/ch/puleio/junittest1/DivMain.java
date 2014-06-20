package ch.puleio.junittest1;
/**
 * 
 * @author Licya
 * Created		:	20th June 2014
 * Last update	:	20th June 2014
 * Description	:	Exercice made to test the JUnit tests
 */

/*
 * JUnit Procedure :
 * 1.	Click right on the package
 * 		Build path/configure build path/Library/add Library/JUnit
 * 
 * 2.	Click right on the class
 * 		new/Junit test case
 * 
 * 3.	Choice of the method which will be tested
 * 
 * 4.	Full the test and run it
 */
public class DivMain 
{

	public static void main(String[] args) 
	{
		Division div = new Division();
		System.out.println(div.division(5.2, 3.4));
	}

}
