class ExcepcionIntervaloChorrada extends Exception {
    public ExcepcionIntervaloChorrada(String mesage) {
        super(mesage);
    }

    public String toString() {
        return "Se ha producido una excepcion " +
            this.getClass().getName() + "\n" +
            "Con el mensaje: " + this.getMessage() + "\n";
    }
}


public class CapturaExcepciones {

    static void compruebaRango(int num, int den)throws ExcepcionIntervaloChorrada{
        if((num>100)||(den<=5)){
            throw new ExcepcionIntervaloChorrada("Números fuera de rango");
        }
    }



    public static void main(String[] args) {

        String str1="120";
        String str2="3";
        String respuesta;
        int num, den, res;

           
        try{
            num=Integer.parseInt(str1);
            den=Integer.parseInt(str2);
            res=num/den;
            compruebaRango(num, den);
            respuesta=String.valueOf(res);

        }catch(NumberFormatException e){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException e){
            respuesta="División entre cero";
        }catch(ExcepcionIntervaloChorrada e){
            respuesta=e.getMessage();
        }
        System.out.println(respuesta);

        
    }
    
}
