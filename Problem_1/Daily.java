public class Daily                                                              //I chose not to extend Appointment here because
{                                                                               //a daily appointment is merely a description
    private String description;                                                 //and would not require date info

    public Daily(String description){                                           //Constructs a new Daily object with just a
        this.description = description;                                         //description since it happens everyday. This
    }                                                                           //uncomplicated adding Monthly and Onetime
    //appointments.
    public String toString(){
        return "Daily: " + description + "\n";                                  //Adds Daily: tag before description
    }
}