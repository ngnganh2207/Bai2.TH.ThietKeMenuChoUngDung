import java.util.Scanner;

public class DesighMenuForApp {
    public static void main(String[] args) {
        //int choice;
        Scanner input= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Draw the  triangle");
        System.out.println("2.Draw the square");
        System.out.println("3.Draw the ractangle");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
        while (true){
        int choice= input.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Draw the triangle");
//                System.out.println("******");
//                System.out.println("*****");
//                System.out.println("****");
//                System.out.println("***");
//                System.out.println("**");
//                System.out.println("*);
               //cách vẽ #:
//                for (int i=0;i<6;i++){
//                    for (int j=6; j>i; j--){
//                        System.out.print("*");
//                    }
//                    System.out.println("");
//                }
                //cách vẽ #:
                String result="";
                for(int i=1;i<=6;i++){
                    for(int j=6; j>=i;j--) {
                        result += "*";
                    }
                    result+="\n";
                }
                System.out.println(result);
                break;
            }
            case 2:{
                System.out.println("Draw the square");
//                System.out.println("******");
//                System.out.println("******");
//                System.out.println("******");
//                System.out.println("******");
//                System.out.println("******");
//                System.out.println("******");
                //cách vẽ #:
                for (int i=0;i<6;i++){
                    for (int j=6; j>0; j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            }
            case 3:{
                System.out.println("Draw the rectangle");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
            }
            case 0:{
                System.exit(0);
            }
            default:{
                System.out.println("No Choice");
            }
        }
        }

    }
}
