//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        atmOperationsInterface op=new atmOperationsImplementation();
        System.out.println("Welcome to console based ATM");
        int atmnumber=4321;
        int pin=123;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the ATM number: ");
        int atmNumber=sc.nextInt();
        System.out.print("Please enter the Pin: ");
        int Pin=sc.nextInt();
        if(atmNumber==atmnumber && pin==Pin){
            while(true){
                System.out.println("Type 1 : To View Available Balance\nType 2: To withdraw amount\nType 3: To deposit the amount\nType 4: To get a mini statement\nType 5: To Exit the application");
                System.out.print("Enter you choice: ");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter the amount to be withdrawn: ");
                        double withdraw=sc.nextDouble();
                        op.withdrawAmount(withdraw);
                        break;
                    case 3:
                        System.out.print("Enter the amount to be deposited: ");
                        double depositAmount=sc.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.getMiniStatement();
                        break;
                    case 5:
                        System.out.println("Thank you!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please choose the listed choices");
                }
            }
        }else{
            System.out.println("Incorrect ATM number or Pin");
            System.exit(0);
        }
    }
}