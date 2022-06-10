public class Welcome {
    public static void main(String[] args)
    {
        System.out.println("Welcome to address book System");
        //creating object for UC1
        UC1 rohit = new UC1("Rohit","raj","samadhiya colony","gwalior","MP","xyz@gmail.com",474001,"9516654766");
        rohit.show_details();
        //creating object for UC2 ,adding info from console,displaying the details
        UC2 mohit = new UC2();
        mohit.add_details();
        mohit.show_details();
    }
}
