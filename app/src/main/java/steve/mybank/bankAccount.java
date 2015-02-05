package steve.mybank;

/**
 * Created by Steve on 5/02/2015.
 */
public class bankAccount {
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;
    public void withdraw(double amount){
        mBalance -= amount;
        if (mBalance < 0){
            mBalance -= OVERDRAFT_FEE;
        }

    }

    public void deposit(double amount){
        mBalance += amount;

    }


    public double getBalance(){
        return mBalance;
    }
}

