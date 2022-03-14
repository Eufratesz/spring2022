

package statements;

public class Investment {

    private double cost = 0.3;            //kezelési költség a kivett összeg 0.3%-a
    private int fund;               //tőke
    private int interestRate;       //kamatláb   yield = hozam
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    /*
    Hozam = tőke* kamat/ 100 * napok száma, és az egész számláló osztva 365-tel. Egyszerűsítés után:
     */

    public double getYield(int days){
        return fund * interestRate * days / (100.0 *365);
    }

    public double close(int days){
        double amount = (getFund() + getYield(days)) * (1 - cost/100);
        double payout = active ? amount : 0;
        active = false;
        return payout;

    }

}




