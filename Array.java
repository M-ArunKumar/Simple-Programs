public class Array {
    public static int checkarrays(int arr1[],int arr2[],int n){
        for (int i=0;i<n;i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(arr1[i]+" is the extra element in index "+i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = {10,20,30,4,40};
        int arr2[] = {10,20,30,40};
        int n = arr2.length;

        System.out.println(checkarrays(arr1,arr2,n));
    }
}
