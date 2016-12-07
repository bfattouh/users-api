package com.prolearn;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 * @author bfattouh
 *
 */
@JsonPropertyOrder({ "street", "suite", "city", "state", "zipcode", "country" })
public class Address {

	@JsonProperty("street")
	private String street;
	@JsonProperty("suite")
	private String suite;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zipcode")
	private String zipcode;
	@JsonProperty("country")
	private String country;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Address() {
	}

	/**
	 *
	 * @param zipcode
	 * @param street
	 * @param suite
	 * @param state
	 * @param country
	 * @param city
	 */
	public Address(String street, String suite, String city, String state, String zipcode, String country) {
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	/**
	 *
	 * @return The street
	 */
	@JsonProperty("street")
	public String getStreet() {
		return street;
	}

	/**
	 *
	 * @param street
	 *            The street
	 */
	@JsonProperty("street")
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 *
	 * @return The suite
	 */
	@JsonProperty("suite")
	public String getSuite() {
		return suite;
	}

	/**
	 *
	 * @param suite
	 *            The suite
	 */
	@JsonProperty("suite")
	public void setSuite(String suite) {
		this.suite = suite;
	}

	/**
	 *
	 * @return The city
	 */
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	/**
	 *
	 * @param city
	 *            The city
	 */
	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 *
	 * @return The zipcode
	 */
	@JsonProperty("zipcode")
	public String getZipcode() {
		return zipcode;
	}

	/**
	 *
	 * @param zipcode
	 *            The zipcode
	 */
	@JsonProperty("zipcode")
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	/**
	 *
	 * @return The state
	 */
	@JsonProperty("state")
	public String getState() {
		return state;
	}

	/**
	 *
	 * @param state
	 *            The state
	 */
	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	/**
	 *
	 * @return The country
	 */
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	/**
	 *
	 * @param country
	 *            The country
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(street).append(suite).append(city).append(zipcode).append(state).append(country)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Address) == false) {
			return false;
		}
		Address rhs = ((Address) other);
		return new EqualsBuilder().append(street, rhs.street).append(suite, rhs.suite).append(city, rhs.city)
				.append(zipcode, rhs.zipcode).append(state, rhs.state).append(country, rhs.country).isEquals();
	}

}
