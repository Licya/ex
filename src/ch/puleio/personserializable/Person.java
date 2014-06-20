package ch.puleio.personserializable;

import java.io.Serializable;

/**
 * 
 * @author Licya
 * Created		: 19th of June 2014
 * Last update	: 19th of June 2014
 * Class		: Person
 * Creation of this class to test the serialization
 */
public class Person implements Serializable
{

	/**
	 * add of a default serial version ID in case of updates
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private int age;
	private char sex;
	private double weight;
	private City city;
	
	/**
	 * Constructor
	 * @param nom
	 * @param age
	 * @param sex
	 * @param weight
	 * @param city
	 */
	public Person(String nom, int age, char sex, double weight, City city)
	{
		this.nom	=	nom;
		this.age	=	age;
		this.sex	=	sex;
		this.weight	=	weight;
		this.city	=	city;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
