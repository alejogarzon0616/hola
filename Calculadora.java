public class Calculadora extends Coso{
      private int val1;
      private int val2;
      Calculadora(){
             val1=0;
             val2=0;
      }
      Calculadora(int val1, int val2){
               super(5,"juan","rojo","circulo");
               this.val1=val1;
               this.val2=val2;
      }
      public int sumar(){
             return 10;
      }
      public int sumar(int a, int b){
             return a+b;
      }
      public void dividir(){
             System.out.println("ya dividi");
      }
      public void restar(int a, int b){
             int resultado = a-b;
             System.out.println(resultado);
	}
      public void setVal1(int val1){
             this.val1=val1;
      }

      public void setVal2(int val2){
             this.val2=val2;
      }
      public int getval1(){
             return val1;
      } 
      public int getval2(){
             return val2;
      } 

}