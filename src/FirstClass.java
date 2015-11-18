public class FirstClass {

    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente(50);
        ContoCorrente conto2 = new ContoCorrente();
        
        conto2.deposito(30);
        System.out.println("Il saldo sul conto2 e': "+conto2.getSaldo());
        
        System.out.println("Bonifico effettuato? "+ conto1.bonifico(conto2, 20));
        System.out.println("Il saldo sul conto2 e': "+conto2.getSaldo());
    }
}
