
public class swapping_methods{
    public static void main(String[] args) {
        
        // insertion sort
        int[] arr={2,5,0,1,4,7};
        for(int i=1;i<arr.length-1;i++){
            int key=arr[i];
            int j=i-1;
while(j>=0 &&arr[j]>key){
    arr[j+1]=arr[j];
    j--;
}
arr[j+1]=key;

        }
    
// bubble sort
//    String[] arr={"hafsa","farwa","irha","komal"};
//    for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr.length-i-1;j++){
//         if(arr[j].compareTo(arr[j+1])>0){
//            String temp=arr[j];
            
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;

//         }
//     }}
//  int[] arr={12,45,98,10,11};
//    for(int i=0;i<arr.length;i++){
//     int temp=arr[i];
//     for(int j=i+1;j<arr.length-i-1;j++){
        
//      if(arr[j]>temp){
//         temp=arr[j];
//         arr[j]=temp;
//      }
           
            
            // arr[j]=arr[j+1];
            // arr[j+1]=temp;

    // selecction sort
    // int[] arr={12,45,98,10,11};
    // for(int i=0;i<arr.length-1;i++){
    // int min=i;
    
    // for (int j=i+1;j<arr.length;j++){
    //     if(arr[j]<arr[min]){
    //     min=j;
    // }}
    // int temp=arr[i];
    // arr[i]=arr[min];
    // arr[min]=temp;
    // }


   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
   }
}}

