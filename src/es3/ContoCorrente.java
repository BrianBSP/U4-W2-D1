package es3;

import exceptions.BancaException;

public class ContoCorrente {
    private final int maxMovimento = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {

        if (nMovimenti < maxMovimento) {
            saldo = saldo - x;
            if (saldo <= 0) {
                try {
                    throw new BancaException("Il Conto è in rosso amico");
                } catch (BancaException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            saldo = saldo - x - 0.5;
            if (saldo <= 0) {
                try {
                    throw new BancaException("Il Conto è in rosso amico");
                } catch (BancaException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public int getMaxMovimento() {
        return maxMovimento;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }
}
