package cuenta;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    public String  getNombre(){
        return this.nombre;
    }

    public String getCuenta(){
        return this.cuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getTipoInterés(){
        return this.tipoInterés;
    }

    public void setTipoInterés(double tipoInterés){
        this.tipoInterés=tipoInterés;
    }

    public void setNombre(String nom){
        this.nombre=nom;
    }

    public void setCuenta(String cue){
        this.cuenta=cue;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }


    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public void operativa_cuenta(float quantity){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(quantity);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(quantity);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }    }
}
