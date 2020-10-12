public class ArrayMerge {
    public static void solution(int[] arr1,int[] arr2,int[] arr3, int a1,int a2){
        int i=0,j=0,k=0;
        while (i < a1 && j<a2){
            if (arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }

        while (i < a1) {
            arr3[k++] = arr1[i++];
        }

        while (j < a2) {
            arr3[k++] = arr2[j++];
        }
    }
    static int removeDuplicates(int arr3[], int a1){

        if(a1 == 0 || a1 ==1 ){
            return a1;
        }

        int j = 0 ;
        for(int i = 0; i < a1-1; i++ ) {
            if (arr3[i] != arr3[i + 1]) {
                arr3[j++] = arr3[i];
            }
        }
        arr3[j++] = arr3 [a1-1];
        return j;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6,6,9,11};
        int a1 = arr1.length;

        int[] arr2 = {2,4,5,6,8,10};
        int a2 = arr2.length;

        int[] arr3 = new int[a1+a2];
        int merge = arr3.length;

        solution(arr1,arr2,arr3,a1,a2);
        merge = removeDuplicates(arr3, merge);

        System.out.println("Printing element after removing duplicates");
        for (int i = 0; i<merge; i++){
            System.out.print (arr3[i]+" ");
        }
    }
}
