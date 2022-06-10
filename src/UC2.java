import java.util.Scanner;

import java.util.Scanner;
public class UC2 extends UC1{

    void add_details()
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first name");
        first_name = scn.next();
        System.out.println("Enter last name");
        last_name = scn.next();
        System.out.println("Enter address");
        address = scn.next();
        System.out.println("Enter city");
        city = scn.next();
        System.out.println("Enter state");
        state = scn.next();
        System.out.println("Enter email");
        email = scn.next();
        System.out.println("Enter contact number ");
        contact_no = scn.next();
        System.out.println("Enter zip");
        zip = scn.nextInt();

    }
}
