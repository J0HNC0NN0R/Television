package com.tutoring.television;

//The purpose of this class is to model a television 
//Connor Campora 12/5/2022

public class Television {

	boolean powerOn; // The powerOn attribute will hold the value true if the power is on and false if the power is off.
	int channel; // The channel attribute will hold the value of the station that the television is showing.
	int volume; //The volume attribute will hold a number value representing the loudness (0 being no sound).

	String MANUFACTURER; //The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant. ∙
	int SCREEN_SIZE; //The screenSize attribute will hold the size of the television screen.
	
	//This Television constructor takes in a manufacturer and screen size and sets defaults (shown below).
	public Television(String MANUFACTURER, int SCREEN_SIZE) {
		powerOn = false;
		volume = 20;
		channel = 2;
		this.MANUFACTURER = MANUFACTURER;
		this.SCREEN_SIZE = SCREEN_SIZE;
		
	}
	
	//Methods
	int getVolume() {
		return volume;
		
	}
	
	int getChannel() {
		return channel;
		
	}
	
	String getManufacturer() {
		return MANUFACTURER;
	}
	
	int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	//Mutator Methods
	void setChannel(int channel) {
		this.channel = channel;
	}
	
	void power() {
		powerOn = !powerOn;
			
		}
	
	void increaseVolume(int volume) {
		this.volume += volume;
		
	}
	
	
	void decreaseVolume(int volume) {
		this.volume -= volume;
		
	}
	
}