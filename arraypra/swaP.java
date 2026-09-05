import java.util.Scanner;
public class swaP{
    public static String linearsearch(String[] arr,String target){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                return target;
            }
           
        }return null;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);


String[] arr={"hafsa","amber","umama","ghazia"};
String target=sc.nextLine();
String result=linearsearch(arr,target);
if(result==null){
    System.out.println(" not found");
}
System.out.println("found"+result);
    

    //     int a=10;
    //     int b=9;
    //     int temp=a;
    //   a=b;
    //     b=temp;
    //     System.out.println(a);
    //     System.out.println(b);

    }
}