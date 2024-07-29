package es3;

import exceptions.BancaException;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + "- Saldo: " + getSaldo() + "- N. movimenti: " + getnMovimenti() + "- Max movimenti: " + getMaxMovimento() + "- Massimo prelievo possibile: " + this.maxPrelievo);
    }

    public void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        } else if (x > maxPrelievo) {
            try {
                throw new BancaException("Il prelievo non è disponibile!");

            } catch (BancaException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
