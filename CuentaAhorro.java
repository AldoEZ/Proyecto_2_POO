public class CuentaAhorro extends CuentaBanco {
    private double limiteRetiro;
    
    public CuentaAhorro(double deposito, double limiteRetiro) {
        super(deposito);
        setLimiteRetiro(limiteRetiro);
    }
    
    public void setLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }
    public double getLimiteRetiro() {
        return this.limiteRetiro;
    }
    
    @Override
    public void retirar(double retiro) {
        if(retiro <= getLimiteRetiro())
            super.retirar(retiro);
        else
            System.out.println("No puede retirar " + retiro + " ya que es mas de " + getLimiteRetiro() + ". Retiro no realizado");
    }
}
