public class ArrayFueraRango {

    //Método que trata una posible exception de fuera de rango y la propaga.
    public static double accederPorIndice(double arr[], int i)throws Exception{
        if ((i>=0)  && (i < arr.length))
            return arr[i];
        else
            throw new Exception("El indice "+ i + " está fuera del rango");

    }

    public static void main(String[] args) {
        double array [] = new double [10];

        


        //No hay excepcion. Inicializamos a 1.
        for (int i=0; i< 10; i++){
            array[i] = 1;
        }



        //Trataremos la excepcion dentro del for.
        for (int i=0; i<= 20; i++){
           try{ 
                array[i] = array[i] * 10;
           }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Fuera de rango con ArrayIndexOutOfBoundsException dentro del for");
                
            }        
        }

        //Trataremos la excepción fuera del for.
        try{ 
            for (int i=0; i<= 20; i++){
                array[i] = array[i] * 10;
            }
        } catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Array Fuera de rango con ArrayIndexOutOfBoundsException fuera del for");
        }
       



        //Trararemos de tratar la excepcion Exception
        try{ 
            for (int i=0; i<= 20; i++){
                array[i] = accederPorIndice(array, i) * 10;
            }
        } catch (Exception e){
             System.out.println("Array Fuera de rango con nuestra Exception");
        }
        

    }
    
}
