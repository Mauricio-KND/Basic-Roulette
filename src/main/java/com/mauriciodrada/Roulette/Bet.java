package com.mauriciodrada.Roulette;

public class Bet {
    public boolean color; //True=Red, False=Black
    public int betAmount; //0-10000
    public int betNumber; //0-36
    public int betId;

    public Bet () {
        setBetId();
    }

    public boolean getColor () {
        return color;
    }

    public void setColor ( boolean isRed){
        this.color = isRed;
    }

    public int getBetAmount(){
        return betAmount;
    }

    public void setBetAmount ( int betAmount ) {

        if (betAmount < 0 || betAmount > 10000){
            //Exception
        }else {
            this.betAmount = betAmount;
        }
    }

    public int getBetNumber(){
        return betNumber;
    }

    public void setBetNumber(int betNumber){
        if (betNumber < 0 || betNumber > 36){
            // Handle exception
        }else {
            this.betNumber = betNumber;
        }
    }

    private void setBetId(){
        betId = (int) (Math.random() * 100);
    }

    public int getBetId(){
        return betId;
    }
}
