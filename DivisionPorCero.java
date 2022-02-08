/*
Ejemplo de excepciones.
*/


class DivisionPorCero{


    //no hay excepciones  PROBAMOS ESTA EN PRIMER LUGAR
    public static int divisionEnterolSinExcepciones (int dividendo, int divisor ){
        int res;
        if (divisor != 0)
            res = dividendo / divisor;
        else{
            System.out.println("Error, divisor por cero");
            res = 0;  // problema. Por qué tenemos que devolver algo si se ha producido un error.
        }
        return res;
    }



    //propaga la excepcion de tipo Exception. Exception es una excepción padre.
    //ROBAMOS ESTA EN SEGUNDO LUGAR
    public static int divisionEnteroConExcepciones (int dividendo, int divisor)throws Exception{
        int res;
        if (divisor != 0)
            res = dividendo / divisor;
        else
            throw new Exception("Se ha producidor una excepción de divisón por cero");

        return res;

    }



    //No propaga excepcion. Comprueba tipo de excepcion ArithmeticExcepcion 
    public static void divisionEnteroConExcepcionesSinThrows(int dividendo, int divisor){
        int res=0;

        try{
            res = dividendo / divisor;

        }catch(ArithmeticException e){
            System.out.println ("Error, division por cero. Mensaje mío");
            System.out.println(e.getMessage());  //mensaje del método getMessage()
            res = 0;

        }finally{
            System.out.println("La división es "+ res);
            System.out.println("Fin del método");
        }
        
       
    }



    public static void main(String[] args) {

        int a = 21;
        int b =  0;
        //System.out.println(divisionEnteroSinExcepciones(2, 0));   //a probar primero
        //divisionEnterolConExcepcionesSinThrows(a,b);
       
       
        //Se prueba en tercer lugar.
        try{
            System.out.println("La división es "+ divisionEnteroConExcepciones(a, b));
        }catch (Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("Ejecuto esto, tanto si hay excepcion, como si no");

        }
        
    }

    

   
}