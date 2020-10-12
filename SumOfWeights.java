public class SumOfWeights {
    public static void main(String args[])
    {
        int arr[] = {10,36,54,89,12};
        int temp;

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

        int wrr[] =new int[5];

        for(int i=0;i<5;i++){
            wrr[i]=0;
            double sqr=Math.sqrt(arr[i]);

            if((sqr*sqr)==arr[i]){
                wrr[i]=wrr[i]+5;
            }

            if(arr[i]%4==0 && arr[i]%6==0){
                wrr[i]=wrr[i]+4;
            }

            if(arr[i]%2==0){
                wrr[i]=wrr[i]+3;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("<" +arr[i]+ "," + wrr[i]+ ">");
        }
    }
}
