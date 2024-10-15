package assiques1;
import java.util.Scanner;
public class assi6Q7 {
        public static void main(Strings[]args) {
        	{
        		public class AirplaneSeating {
        		    private boolean[][] seats;
        		    public AirplaneSeating(int rows, int cols) {
        		        seats = new boolean[rows][cols];
        		    }
        		    public void bookSeat(int row, int col) {
        		        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
        		            if (!seats[row][col]) {
        		                seats[row][col] = true;
        		                System.out.println("Seat booked successfully.");
        		            } else {
        		                System.out.println("Seat already occupied.");
        		            }
        		        } else {
        		            System.out.println("Invalid seat position.");
        		        }
        		    }

        		    public void cancelBooking(int row, int col) {
        		        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
        		            if (seats[row][col]) {
        		                seats[row][col] = false;
        		                System.out.println("Booking cancelled.");
        		            } else {
        		                System.out.println("Seat is already available.");
        		            }
        		        } else {
        		            System.out.println("Invalid seat position.");
        		        }
        		    }

        		    public void checkSeatAvailability(int row, int col) {
        		        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
        		            if (!seats[row][col]) {
        		                System.out.println("Seat is available.");
        		            } else {
        		                System.out.println("Seat is occupied.");
        		            }
        		        } else {
        		            System.out.println("Invalid seat position.");
        		        }
        		    }

        		    public void displaySeatingChart() {
        		        System.out.println("Seating chart:");
        		        for (int i = 0; i < seats.length; i++) {
        		            for (int j = 0; j < seats[i].length; j++) {
        		                System.out.print(seats[i][j] ? "X " : "O ");
        		            }
        		            System.out.println();
        		        }
        		    }

        		    public static void main(String[] args) {
        		        Scanner scanner = new Scanner(System.in);
        		        System.out.println("Enter number of rows and columns:");
        		        int rows = scanner.nextInt();
        		        int cols = scanner.nextInt();

        		        AirplaneSeating airplaneSeating = new AirplaneSeating(rows, cols);

        		        airplaneSeating.bookSeat(1, 2);
        		        airplaneSeating.cancelBooking(1, 2);
        		        airplaneSeating.checkSeatAvailability(1, 2);
        		        airplaneSeating.displaySeatingChart();
        		    }
        	

