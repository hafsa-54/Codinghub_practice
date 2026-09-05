import java.util.Scanner;
public class firstprogram{
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter number");
        // int number=sc.nextInt();
        // if(number%2==0){
        //     System.out.println("number is Even number");
        // }
        // else if(number%2==1){
        //     System.out.println("number is Odd number");
        // }
        //   System.out.println("enter principle");
        // int P=sc.nextInt();
        //   System.out.println("enter time");
        // int T=sc.nextInt();
        //    System.out.println("enter rate");
        // int R=sc.nextInt();
        // int result=P*R*T;
        // System.out.println("Simple Interest : "+result);
        //       System.out.println("enter number");
        // int num=sc.nextInt();
        //    System.out.println("enter number");
        // int num2=sc.nextInt();
        //    System.out.println("enter Operator");
      
        //     char op = sc.next().charAt(0);
        //     if(op=='+'){
        //         System.out.println(num+num2);
        //     } else if(op=='-'){
        //         System.out.println(num-num2);
        //     }
        //     else if(op=='*'){
        //         System.out.println(num*num2);
        //     }else if(op=='/'){
        //         System.out.println(num/
        //             num2);
            // }
            // ------------------- fibonnaci number -----------------
        //     int ft=0;
        //     int lt=1;
        //     int n=10;
           
        //     for(int i=0;i<n;i++){
        //           System.out.println(ft);
        //           int res=ft+lt;
                
        // ft=lt;
        //     lt=res;
        //     }
        //--------- palindrome ----------------------
        // System.out.println("enter name to check wheteher name is palindrome or not");
        // String name=sc.nextLine();
        // // String name="racecar";
        // String forward = ""; 
        // String reverse = ""; 
        // for(int i=name.length()-1;i>=0;i--){
        //     char a=name.charAt(i);
        //    reverse=reverse+a;
        // }System.out.println("reverse order:"+reverse);

        //     for(int i=0;i<=name.length()-1;i++){
        //     char a=name.charAt(i);
        //     forward=forward+a;
        // }  System.out.println("forward order"+forward); 
        //        if(reverse.equals(forward)){
        //         System.out.println("String is palindrome");
        //        }  else{
        //         System.out.println("string is not palindrome");
        //        }
        // ----------------Armstrong Number-----------------
        int n=153;
      System.out.println(n);
      int sum=0;
        while(n>0){
            int a=n%10;
            int ar=a*a*a;
            sum+=ar;
            System.out.println("sum: "+sum);
            n=n/10;
        }System.out.println(n);
        System.out.println(sum);
}}