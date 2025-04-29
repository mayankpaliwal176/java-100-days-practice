class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.2;
    }
}
public class Overriding{
    public static void main(String args[]){
        Bank[] banks = {new SBI(), new ICICI(), new HDFC()};
        for(Bank bank : banks){
            System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
        }
    }
}