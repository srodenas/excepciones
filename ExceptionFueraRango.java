//Creamos nuestra propia excepcion que herederá de Exception.
//Sobreescribimos el toString.

class ExceptionFueraRangoArray extends Exception{

    public ExceptionFueraRangoArray() {
        super();
    }

    public ExceptionFueraRangoArray(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Se ha producido una excepcion " +
            this.getClass().getName() + "\n" +
            "Con el mensaje: " + this.getMessage() + "\n";
    }

    
    
}//fin clase



public class ExceptionFueraRango {


     //Método que trata una posible exception de fuera de rango y la propaga.
     public static double accederPorIndice(double arr[], int i)throws ExceptionFueraRangoArray{
        if ((i>=0)  && (i < arr.length))
            return arr[i];
        else
            throw new ExceptionFueraRangoArray("El indice "+ i + " está fuera del rango");

    }

    public static void main(String[] args) {
        double array [] = new double [10];


        //No hay excepcion. Inicializamos a 1.
        for (int i=0; i< 10; i++){
            array[i] = 1;
        }

        try{ 
            for (int i=0; i<= 20; i++){
                array[i] = accederPorIndice(array, i) * 10;
            }
        } catch (ExceptionFueraRangoArray e){
             System.out.println(e);
        }

        
    }
    
}
