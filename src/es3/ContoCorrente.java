package es3;

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
        if (nMovimenti < maxMovimento) saldo = saldo - x;
        else saldo = saldo - x - 0.5;
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
