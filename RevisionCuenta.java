public class RevisionCuenta extends CuentaBanco {
    private double cuotaConsulta;
    
    public RevisionCuenta(double saldo, double cuotaConsulta) {
        super(saldo);
        setCuotaConsulta(cuotaConsulta);
    }
    
    public void setCuotaConsulta(double cuotaConsulta) {
        this.cuotaConsulta = cuotaConsulta;
    }
    public double getCuotaConsulta() {
        return this.cuotaConsulta;
    }
    
    @Override
    public void retirar(double retiro) {
        double cuota = retiro * getCuotaConsulta();
        super.retirar(retiro);
        super.setSaldo(super.getSaldo() - cuota);
    }
}
