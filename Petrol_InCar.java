/**
  A man his driving car from home to office with X petrol.
  There are N number of petrol bunks in the city with only few capacities
  and each petrol is located in different places For one km one liter will consume.
  So he fill up petrol in his petrol tank in each petrol bunks.
  Output the remaining petrol if he has or tell him that he cannot travel
  if he is out of petrol.

    Input:
    Petrol in car: 2 Liters
    Petrol bunks: A B C
    Distance from petrol each petrol bunks: 1, 5, 3
    Capacities of each petrol bunk: 6, 4, 2
    Output:
    Remaining petrol in car is 5 liters
 */

import java.util.Scanner;

public class Petrol_InCar {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Petrol in  car: ");
        int carPetrol = in.nextInt();

        in.nextLine(); // To skip the line after pressing enter

        System.out.println("Petrol bunks: ");
        String petbunks = in.nextLine();
        int petrolbunks = petbunks.length();

        int[] arrayDis = new int[petrolbunks];
        int[] arrayCap = new int[petrolbunks];

        System.out.println("Distance form each petrol bunks: ");

        for(int i=0; i<petrolbunks; i++)
            arrayDis[i] = in.nextInt();

        System.out.println("Capacities of each petrol bunk: ");

        for(int i=0; i<petrolbunks; i++)
            arrayCap[i] = in.nextInt();
       
        int flag = 1;
        for(int i=0; i<petrolbunks; i++)
        {
            if(carPetrol >= arrayDis[i])
            {
                carPetrol = carPetrol - arrayDis[i] + arrayCap[i];
            }
            else
            {
                flag = 0;
                System.out.println("Out of petrol");
                break;
            }
        }
        if(flag == 1)
            System.out.println("Remaining petrol in car is: "+carPetrol+" liters");
    }
}
