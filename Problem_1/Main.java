import java.io.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        AppointmentMaker a = new AppointmentMaker();                            //Creates new AppointmentMaker object
        a.menuPrint();                                                          //Prints menu to begin
    }
}