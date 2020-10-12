public class TotalOddEvenNumbers {
    public static void main(String[] args) {
     int num = 12345678;
     int even = 0,odd = 0;
     while (num > 0){
         if (num % 2 == 0){
             even++;
         } else odd++;
         num = num/10;
     }
        System.out.println("Even are : "+even);
        System.out.println("odd are : "+odd);
    }
}

