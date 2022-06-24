import java.util.Scanner;
class switch_ex
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=0;
        
        int c;
        while (n!=5) {
            System.out.println("enter the first number");
            int a=s.nextInt();
            System.out.println("enter the second number");
            int b=s.nextInt();
            System.out.println("Select th option");
            System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Quit");
            n=s.nextInt();
            switch (n) {
                case 1:
                    c=a+b;  
                    System.out.println(c); 
                    break;
                case 2:
                    c=a-b; 
                    System.out.println(c);  
                    break;
                case 3:
                    c=a*b;  
                    System.out.println(c); 
                    break;
                case 4:
                    c=a/b;
                    System.out.println(c); 
                    break;
                default:
                    System.out.println("Enter right choice");
                    break;
            }

        }

    }
}