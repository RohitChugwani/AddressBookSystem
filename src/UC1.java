public class UC1 {
    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    String email;
    int zip ;
    String contact_no;

    UC1(String first_name,String last_name,String address,String city,String state,String email,int zip,String contact_no)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.email = email;
        this.zip = zip;
        this.contact_no = contact_no;

    }
    void show_details()
    {
        System.out.println("first name :"+first_name);
        System.out.println("last name :"+last_name);
        System.out.println("Address :"+address);
        System.out.println("city :"+city);
        System.out.println("email id "+email);
        System.out.println("Zip  :"+zip);
        System.out.println("Contact number :"+contact_no);
    }


}
