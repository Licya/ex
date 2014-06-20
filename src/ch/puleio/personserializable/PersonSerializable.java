package ch.puleio.personserializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Licya
 * Created		: 19th of June 2014
 * Last update	: 19th of June 2014
 */
public class PersonSerializable 
{

	public static void main(String[] args) 
	{
		serializeObject();
		deserializeObject();
	}

	/**
	 * Method created to serialize an object
	 */
	public static void serializeObject()
	{
		//Creation of the objects we want to serilize
		Person person1 = new Person("Louisiana", 34, 'f', 76.0, new City("Monthey", 1870));
		Person person2 = new Person("Loic", 67, 'm', 56.6, new City("Sierre", 3960));

		try
		{
			FileOutputStream file = new FileOutputStream("C:\\Temp\\tests.ser");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			oos.writeObject(person2);
			oos.writeObject(person1);
			oos.flush();
			oos.close();
		}
		catch(java.io.IOException e)
		{
			e.printStackTrace();
		}	
	}

	/**
	 * Method created to deserialize an object and recover the data
	 */
	public static void deserializeObject()
	{
		try
		{
			FileInputStream file = new FileInputStream("C:\\Temp\\tests.ser");
			ObjectInputStream ois = new ObjectInputStream(file);
			Person person2 = (Person)ois.readObject();
			System.out.println("Deserailized Class:");
			System.out.println("Name : " + person2.getNom());
			System.out.println("Age : " + person2.getAge());
			System.out.println("Sex : " + person2.getSex());
			System.out.println("Weight : " + person2.getWeight());
			System.out.println("City : " + person2.getCity().toString());
			System.out.println();

			Person person1 = (Person)ois.readObject();
			System.out.println("Deserailized Class:");
			System.out.println("Name : " + person1.getNom());
			System.out.println("Age : " + person1.getAge());
			System.out.println("Sex : " + person1.getSex());
			System.out.println("Weight : " + person1.getWeight());
			System.out.println("City : " + person1.getCity().toString());
			System.out.println();
		}
		catch(java.io.IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
