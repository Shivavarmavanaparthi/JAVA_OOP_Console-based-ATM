import java.util.*;
public class atmOperationsImplementation implements atmOperationsInterface {
   ATM atm=new  ATM();
   Map<Double,String> miniStatement = new HashMap<>();
    @Override
    public void viewBalance() {
     System.out.println("Available balance is: "+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double amountTobeWithdrawn) {
     if(amountTobeWithdrawn<=atm.getBalance()) {
      miniStatement.put(amountTobeWithdrawn ,"is withdrawn");
      System.out.println("Please collect the cash: " + amountTobeWithdrawn);
      atm.setBalance(atm.getBalance() - amountTobeWithdrawn);
      viewBalance();
     }else{
      System.out.println("Insufficient Balance!!!");
     }

    }

    @Override
    public void depositAmount(double amountTobeDeposited) {
     miniStatement.put(amountTobeDeposited,"is deposited");
     System.out.println("Rupees "+amountTobeDeposited+ " deposited Successfully !!");
     atm.setBalance(atm.getBalance()+amountTobeDeposited);
     viewBalance();

    }

    @Override
    public void getMiniStatement() {
      for(Map.Entry<Double,String> m: miniStatement.entrySet()) {
       System.out.println(m.getKey()+" "+m.getValue());
      }
    }
}

