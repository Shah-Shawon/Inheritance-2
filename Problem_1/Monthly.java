import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Monthly extends Appointment
{
    public Monthly(int day, int month, int year, String description){
        super(day, month, year, description);                                   //Initializes constructor with Superclass
    }                                                                           //Appointment variables

    public boolean occursOn(ArrayList<String> arr, String day) {                //returns true if the ArrayList has an appointment 
        for(String a : arr){                                                    //on that day. Loop searches every line of ArrayList
            if(a.contains(day)){                                                //and iterates through each String inside the list
                return true;                                                    //return true if date is already booked
            }
        }
        return false;                                                           //return false if that date is open
    }

    public String toString(){                                                   //Adds Monthly: tag and description and day
        return "Monthly: " + description + " on every " + day + " of the month\n";
    }
}