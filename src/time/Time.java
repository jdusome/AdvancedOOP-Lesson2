/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Joshy
 */
public class Time {

    //Instance Variables
    private int hours, minutes, seconds;
    
    /**
     * This is our empty constructor, will initialize the time class to midnight
     */
    public Time() {
        //initialize the time to midnight
        setTime(0, 0, 0);
    }
    
    public Time (int hours, int minutes, int seconds){
        //set the current time
        setTime(hours, minutes, seconds);
    }
    
    /**
     * This method will validate and set the instance variables
     * @param hours
     * @param minutes
     * @param seconds 
     */
    public void setTime(int hours, int minutes, int seconds){
        
        if (hours < 0 || hours >= 24) throw new IllegalArgumentException("Hours must be in the range 0-23");
        if (minutes < 0 || minutes >= 60) throw new IllegalArgumentException("Minutes must be in the range 0-59");
        if (seconds < 0 || seconds >= 60) throw new IllegalArgumentException("Seconds must be in the range 0-59");
        
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    /**
     * This method returns the time object in military format (24hr)
     * @return 
     */
    public String toMilitaryTime(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    
    /**
     * This method will return the time in standard format
     * @return 
     */
    public String toStandardTime(){
        return String.format("%d:%02d:%02d %s", ((hours == 0) || (hours == 12) ? 12 : hours % 12), minutes, seconds, (hours >= 12) ? "PM" : "AM");
    }
}
