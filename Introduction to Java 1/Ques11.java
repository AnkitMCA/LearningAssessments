/*

Ques.11 Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks.

*/

class Bank{
    int getDetails()
    {
        return 0;
    }
}

class SBI extends Bank{
    int getDetails()
    {
        return 3;
    }
}

class ICICI extends Bank{
    int getDetails()
    {
        return 4;
    }
}
class BOI extends Bank{
    int getDetails()
    {
        return 5;
    }
}

class Ques11{
    public static void main(String[] args){
        Bank bank=new Bank();
        SBI sbi=new SBI();
        BOI boi=new BOI();
        ICICI icici=new ICICI();
        System.out.println("Bank ROI : "+bank.getDetails());
        System.out.println("SBI ROI : "+sbi.getDetails());
        System.out.println("BOI ROI : "+boi.getDetails());
        System.out.println("ICICI ROI : "+icici.getDetails());
    }
}