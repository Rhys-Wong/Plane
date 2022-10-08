import java.util.Scanner;
public class PlaneApp {
    

    public static void main(String[] Args){

        //Planeseat[] seat = new Planeseat[12];
        Plane plane1 = new Plane();
        int choice;
		Scanner sc = new Scanner(System.in);
        
		do {

			System.out.println("Show number of Empty Seats");

			System.out.println("Show list of Empty Seats");

			System.out.println("Show list of seat assignments by seat ID");

			System.out.println("Show list of seat assignments by Customer ID");

			System.out.println("Assign a customer to a seat");

			System.out.println("Remove a seat Assignment");

			System.out.println("Exit");
			choice = sc.nextInt();

			switch (choice) {

				 case 1:

					 plane1.showNumEmptySeats();/* add mulTest() call */
					 break;

				 case 2: /* add divide() call */

					 plane1.showEmptySeats();

					 break;

				 case 3: /* add modulus() call */

					 plane1.showAssignedSeats(true);

					 break;

				 case 4: /* add countDigits() call */

					 plane1.showAssignedSeats(false);

					 break;

				 case 5: /* add position() call */
                    
					 System.out.println("Please enter SeatID ");
                     Scanner sc1 = new Scanner(System.in);
                     int seatidchoice = sc1.nextInt();
                     System.out.println("Please enter CustomerID: ");
                     int custidchoice = sc1.nextInt();
                     plane1.assignSeat(seatidchoice, custidchoice);

					 break;

				 case 6: /* add extractOddDigits() call */

					 System.out.println("Pleas enter SeatID: ");
                     int seatidchoice1 = sc.nextInt();
                     plane1.unAssignSeat(seatidchoice1);

					 break;

				 case 7: System.out.println("Program Terminating...");

			}

		}while (choice<7);

    } 
}
