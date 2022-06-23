public class DosDimensiones{
    protected double base;
    protected double altura;

    //Métodos de acceso para base y altura
    double getBase(){
        return base;
        }
    double getAltura(){
        return altura;
        }
    public void setBase(double b){
        base=b;
        }
    public void setAltura (double h){
        altura=h;
        }
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }
}
