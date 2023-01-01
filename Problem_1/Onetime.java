public class Onetime extends Appointment
{
    public Onetime(int day, int month, int year, String description){
        super(day, month, year, description);                                   //Calls the Superclass Appointment
    }

    public String toString(){
        return "Onetime appt: " + super.toString();                             //Adds Onetime appt: tag to Appointment class's
    }                                                                           //toString() method

}