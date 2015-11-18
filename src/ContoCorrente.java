public class ContoCorrente {

    private float saldo;

    public ContoCorrente(float saldo) {
        this.saldo = saldo;
    }

    public ContoCorrente(){
        saldo = 0;
    }

    public boolean prelievo(float somma) {
        if(somma < this.saldo){
            saldo -= somma;
            return true;
        }
        else
            return false;
    }

    public void deposito(float somma) {
        this.saldo += somma;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean bonifico(ContoCorrente conto,float somma) {
        if(this.prelievo(somma)){
            conto.deposito(somma);
            return true;
        }
        else
            return false;
    }
}
