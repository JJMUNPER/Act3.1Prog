public class Main {

    final static Integer numA = 16;
    final static Integer numB = 20;

    final static String OP = "suma";




    public static void main(String[] args) {

        CalculadoraBasica basica = new CalculadoraBasica();


        if(OP=="suma"){
            Integer resultadoSuma = basica.suma(numA,numB);
            System.out.println ("La suma de " + numA + " + " + numB + " = " +resultadoSuma);
        }
        else if(OP=="resta"){
            Integer resultadoResta = basica.resta(numA,numB);
            System.out.println("La resta de " + numA + " - " + numB + " = " + resultadoResta);
        }
        else if(OP=="multiplica"){
            Integer resultadoMultiplica = basica.multiplicacion(numA,numB);
            System.out.println("La multiplicacion de " + numA + " * " + numB + " = " +resultadoMultiplica);
        }
        else if(OP=="division"){
            Integer resultadoDivision = basica.division(numA,numB);
            System.out.println("La division de " + numA + " / " + numB + " = " +resultadoDivision);
        }
    }
}
