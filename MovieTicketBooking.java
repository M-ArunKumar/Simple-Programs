import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Movies {
    String m_Name;
    String m_Time;
    int m_Cost;
    int count = 1;
    int totalSeats = 100;
    int[][] seats = new int[10][10];
    Scanner sc = new Scanner(System.in);

    public Movies(String m_Name, String m_Time, int m_Cost) {
        this.m_Name = m_Name;
        this.m_Time = m_Time;
        this.m_Cost = m_Cost;
        int s = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                seats[i][j] = s;
                s++;
            }
        }
    }

    public int[] book() {
        System.out.println("\nEnter no of seats to book: ");
        int b = sc.nextInt();
        viewSeats();
        int[] bookSeats = new int[b];
        for (int i = 0; i < b; i++) {
            if (!(b <= seats.length)) {
                System.out.println("\nSeats " + b + " is not Available. Please enter seats within (0 - 100)!!!\n");
                break;
            }
            System.out.println("\nEnter the Seat no for " + (i + 1) + " person");
            int seatNo = sc.nextInt();
            if (seatNo == 0) {
                System.out.println("\nThis Seat is already booked !!!");
                break;
            } else {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (seats[j][k] == seatNo) {
                            seats[j][k] = 0;
                            bookSeats[i] = seatNo;
                            totalSeats -= count;
                            count++;
                        }
                    }
                }
                System.out.println("Seat no " + seatNo + " is booked");
            }
        }
        return bookSeats;
    }

    public void viewSeats() {
        System.out.println("----------------------------------------------------");
        System.out.println("-----------------------SCREEN-----------------------");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" | " + seats[i][j]);
            }
            System.out.println("\n---------------------------------------------------");
        }
        System.out.println("\n\t-----( 0 means seats are booked )-----");
    }

    public void showMovies() {
        System.out.println("------------------------------");
        System.out.println("Movie Name: " + m_Name);
        System.out.println("Movie Time: " + m_Time);
        System.out.println("Movie Cost: " + m_Cost + " rs");
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("------------------------------\n");
    }
}

class Ticket {
    String t_Name;
    int t_Price;
    String t_Time;
    int id;
    int[] seating;

    public Ticket(String t_Name, int t_Price, String t_Time, int id, int[] seating) {
        this.t_Name = t_Name;
        this.t_Price = t_Price;
        this.t_Time = t_Time;
        this.id = id;
        this.seating = seating;
    }

    public void viewTicket() {
        System.out.println("\t\t\t\t\t\t\t      YOUR TICKET             ");

        System.out.println("\t\t\t\t\t\t\t------------------------------");
        System.out.println("\t\t\t\t\t\t\t   Ticket Id: " + id);
        System.out.println("\t\t\t\t\t\t\t   Movie Name: " + t_Name);
        System.out.println("\t\t\t\t\t\t\t   Ticket Cost: " + t_Price + " rs");
        System.out.println("\t\t\t\t\t\t\t   Movie Time: " + t_Time);
        System.out.println("\t\t\t\t\t\t\t   Seats: " + Arrays.toString(seating));
        System.out.println("\t\t\t\t\t\t\t------------------------------\n");
    }
}

public class MovieTicketBooking {
    static Scanner sc = new Scanner(System.in);

    ArrayList<Movies> movies = new ArrayList<>();
    ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        MovieTicketBooking m = new MovieTicketBooking();
        m.mainMenu();
    }

    public void movieList() {
        if (movies.size() >= 3) {
            return;
        }
        Movies m1 = new Movies("Tenet", "10 am", 120);
        movies.add(m1);
        Movies m2 = new Movies("Master", "2 pm", 150);
        movies.add(m2);
        Movies m3 = new Movies("Gravity", "6 pm", 120);
        movies.add(m3);
    }

    public void mainMenu() {
        System.out.println("\t\t\t\t\t\t\t      MOVIE TICKET BOOKING    ");

        System.out.println("\t\t\t\t\t\t\t------------------------------");
        System.out.println("\t\t\t\t\t\t\t|  1.Show Movies             |");
        System.out.println("\t\t\t\t\t\t\t|  2.Book Ticket             |");
        System.out.println("\t\t\t\t\t\t\t|  3.Cancel Ticket           |");
        System.out.println("\t\t\t\t\t\t\t|  4.View Ticket             |");
        System.out.println("\t\t\t\t\t\t\t|  5.Exit                    |");
        System.out.println("\t\t\t\t\t\t\t------------------------------");

        System.out.println("\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\t---MOVIES---");
                movieList();
                for (Movies m : movies) {
                    m.showMovies();
                }
                mainMenu();
                break;
            case 2:
                sc.nextLine();
                System.out.println("\nEnter the Movie Name: ");
                String name = sc.next();
                String movieName, movieTime = "";
                int movieCost = 0;
                int loc = 0;
                for (Movies m : movies) {
                    if ((m.m_Name).equalsIgnoreCase(name)) {
                        movieName = m.m_Name;
                        movieTime = m.m_Time;
                        movieCost = m.m_Cost;
                        int[] seating = m.book();
                        int id = tickets.size();
                        movies.set(loc, m);
                        tickets.add(new Ticket(movieName, movieCost * (m.count - 1), movieTime, id, seating));
                        if (!Arrays.toString(seating).contains("0")) {
                            System.out.println("Your ticket id is: " + id);
                            System.out.println("Your seats are: " + Arrays.toString(seating));
                        }
                    }
                }
                loc++;
                mainMenu();
                break;
            case 3:
                System.out.println("\nEnter the Ticked id: ");
                int tId = sc.nextInt();
                Ticket ticket = tickets.get(tId);
                for (Movies m : movies) {
                    if ((m.m_Name).equalsIgnoreCase(ticket.t_Name)) {
                        for (int sn : ticket.seating) {
                            int count = 1;
                            int seatsAdded = 1;
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    if (count == sn) {
                                        m.seats[i][j] = count;
                                        m.totalSeats += seatsAdded;
                                        seatsAdded++;
                                    }
                                    count++;
                                }
                            }
                        }
                    }
                }
                tickets.remove(tId);
                System.out.println("\nYour Ticket is cancelled succesfully!");
                mainMenu();
                break;
            case 4:
                System.out.println("\nEnter the Ticket id: ");
                int tNo = sc.nextInt();
                Ticket t = tickets.get(tNo);
                t.viewTicket();
                mainMenu();
                break;
            case 5:
                break;
            default:
                System.out.println("\n\tInvalid Option");
                break;
        }
    }
}
