package com.mauriciodrada.Roulette;

public class Roulette {
    public int rouletteId;
    public String status;
    public Bet bet;

    public Roulette () {
        setRouletteId();
    }

    private void setRouletteId(){
        rouletteId = (int) (Math.random() * 100);
    }

    public int getRouletteId(){
        return rouletteId;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public String getStatus () {
        return status;
    }

    public void setBet ( Bet bet ) {
        this.bet = bet;
    }

    public Bet getBet () {
        return bet;
    }
}
