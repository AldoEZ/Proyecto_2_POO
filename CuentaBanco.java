public class CuentaBanco {
    private double saldo;
    public CuentaBanco(double saldo) {
        setSaldo(saldo);
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double deposito) {
        setSaldo(getSaldo() + deposito);
    }
    public void retirar(double retiro) {
        setSaldo(getSaldo() - retiro);
    }
}
