public class Circulo {
public float radio;
private float area;
private float diametro;
private float circunferencia;

/*area:pi por radio al cuadrado
diametro: radio por dos
circunferencia pi por diametro  */

    public Circulo(){
        System.out.println("No sirvo para nada");
    }
    public Circulo(float radio,float area,float diametro,float circunferencia){
        this.radio=radio;
        this.diametro=diametro;
        this.circunferencia=circunferencia;
        this.area=area;

    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea(){
        area=(radio *3.1416f);
        return area;
    }
    public  float getDiametro(){
        diametro=radio*2;
        return diametro;
    }

    public float getCircunferencia() {
        circunferencia=3.1416f *diametro;
        return circunferencia;
    }

}
