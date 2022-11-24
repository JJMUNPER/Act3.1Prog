public class Main {

    final static Integer numA = 16;
    final static Integer numB = 20;


    enum Operaciones{
        SUMA,
        RESTA,
        MULTIPLICACION,
        DIVISION
    }

    //static Operaciones op = Operaciones.SUMA;

    public static void main(String[] args) {

        Operaciones op = Operaciones.SUMA;

        Calculo basica = new Calculo();


        switch (op){

            case SUMA:
                Integer resultSuma= basica.suma(numA,numB);
                System.out.println ("La suma de " + numA + " + " + numB + " = " +resultSuma);
                break;

            case RESTA:
                Integer resultResta = basica.resta(numA,numB);
                System.out.println("La resta de " + numA + " - " + numB + " = " +resultResta);
                break;

            case MULTIPLICACION:
                Integer resultMultiplicacion = basica.multiplicacion(numA,numB);
                System.out.println("La multiplicación de " + numA + " * " + numB + " = " + resultMultiplicacion);
                break;

            case DIVISION:
                Integer resultDivision= basica.division(numA,numB);
                System.out.println("La división de " + numA + " / " + numB + " = " + resultDivision);
                break;

        }
    }
}
