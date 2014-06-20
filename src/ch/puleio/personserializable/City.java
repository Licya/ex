package ch.puleio.personserializable;

import java.io.Serializable;

/**
 * 
 * @author Licya
 * Created		: 19th of June 2014
 * Last update	: 19th of June 2014
 * Class		: City
 * Creation of this class to test the serialization
 */
public class City implements Serializable
{

	/**
	 * Add of a default serial verision id in case of updates.
	 */
	private static final long serialVersionUID = 1L;
	private String cityName;
	private int postalNumber;

	/**
	 * Constructor
	 * @param cityName
	 * @param postalNumber
	 */
	public City(String cityName, int postalNumber)
	{
		this.cityName		=	cityName;
		this.postalNumber	=	postalNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPostalNumber() {
		return postalNumber;
	}

	public void setPostalNumber(int postalNumber) {
		this.postalNumber = postalNumber;
	}
	
	/**
	 * toString method
	 */
	public String toString()
	{
		return Integer.toString(postalNumber)+ " " + cityName;
	}
}
