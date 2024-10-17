public class Proyecto2 {
    public static void main(String[] args) {
        CuentaBanco nuevaCuenta;
        
        nuevaCuenta = new CuentaAhorro(3000.0,500.0);
        retiroCuenta(nuevaCuenta, 600.0);
        System.out.println("Saldo de cuenta: " + nuevaCuenta.getSaldo() + "\n");
        
        nuevaCuenta = new CuentaBanco(5000.0);
        retiroCuenta(nuevaCuenta, 2500.0);
        System.out.println("Saldo de cuenta: " + nuevaCuenta.getSaldo() + "\n");
        
        nuevaCuenta = new RevisionCuenta(3000.0, 0.1);
        retiroCuenta(nuevaCuenta, 550.0);
        System.out.println("Saldo de cuenta: " + nuevaCuenta.getSaldo() + "\n");
    }
    static void retiroCuenta(CuentaBanco cuenta, double retiro) {
        if (cuenta instanceof CuentaAhorro) {
            System.out.println("Retiro de ahorro por Cuenta Ahorro.");
            cuenta.retirar(retiro);
        } else if (cuenta instanceof RevisionCuenta){
            System.out.println("Retiro con cuota por Revision Cuenta.");
            cuenta.retirar(retiro);
        } else if(cuenta instanceof CuentaBanco) {
            System.out.println("Retiro normal por Cuenta Banco.");
            cuenta.retirar(retiro);
        } else {
            System.out.println("Retiro no realizado.");
        }
    }
}
