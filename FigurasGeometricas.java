public class FigurasGeometricas {

    float ladoCuadrado;
    float baseTriangulo;
    float alturaTriangulo;
    float radioCirculo;
    int opcionFigurasGeometricas;

    public FigurasGeometricas(float ladoCuadrado, float baseTriangulo, float alturaTriangulo, float radioCirculo,
            int opcionFigurasGeometricas) {
        this.ladoCuadrado = ladoCuadrado;
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
        this.radioCirculo = radioCirculo;
        this.opcionFigurasGeometricas = opcionFigurasGeometricas;
    }
    public void calcularArea(){
        
        switch (opcionFigurasGeometricas) {
            case 1:
                float areaCuadrado = ladoCuadrado*ladoCuadrado;
                System.out.println("El área del cuadrado es: " +areaCuadrado);
                break;
            case 2:
                float areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
                System.out.println("El área del triangulo es: " +areaTriangulo);
                break;
            case 3:
                double areaCirculo = (Math.PI)*radioCirculo*radioCirculo;
                System.out.println("El área del circulo es: " +areaCirculo);
                break;
        
            default:
                System.out.println("Opción no valida");
                break;
        }
    }

    
}