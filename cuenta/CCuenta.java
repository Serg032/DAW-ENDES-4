package cuenta;

/**
 * Esta clase explica como funciona una cuenta
 * @author Sergio Radigales
 * @version 1.0
 * */

public class CCuenta {

/**
 * Propiedades de la clase CCuenta
 * */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta
     * */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta con parámetros
     * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }

    /**
     * Método para obtener el nombre de la cuenta
     * @return nombre
     */
    public String  getNombre(){
        return this.nombre;
    }
    /**
     * Método para obtener la cuenta
     * @return cuenta
     */
    public String getCuenta(){
        return this.cuenta;
    }
    /**
     * Método para obtener el saldo
     * @return saldo
     */
    public double getSaldo(){
        return this.saldo;
    }
    /**
     * Método para obtener el tipo de interés
     * @return tipoInterés
     */
    public double getTipoInterés(){
        return this.tipoInterés;
    }
    /**
     * Método para setear el tipo de interés
     * @return void
     */
    public void setTipoInterés(double tipoInterés){
        this.tipoInterés=tipoInterés;
    }
    /**
     * Método para setear el nombre
     * @return void
     */
    public void setNombre(String nom){
        this.nombre=nom;
    }
    /**
     * Método para setear la cuenta
     * @return cuenta
     */
    public void setCuenta(String cue){
        this.cuenta=cue;
    }
    /**
     * Método para setear el saldo
     * @return saldo
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }


    public double estado()
    {
        return saldo;
    }
    /**
     * Método para ingresar saldo en la cuenta
     * @return void
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método para retirar saldo en la cuenta
     * @return void
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * Método para representar la operativa de la cuenta
     * @return void
     */
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
