public class Coso{
    int tamanio;
    String nombre;
    String color;
    String forma;

    Coso() {
        this.tamanio=0;
        this.nombre="Computador";
        this.color="Negro";
    }
    Coso(int tamanio, String nombre, String color, String forma){
         this.tamanio=tamanio;
         this.nombre=nombre;
         this.color=color;
         this.forma=forma;
    }
    public void funcionalidad(String funcion){
      System.out.println("el coso esta funcionando con la siguiente funcion:"+funcion);
    }
    public void golpear(){
         System.out.println("Te han golpeado con el coso");
    }
    public void setTamanio(int tamanio){
         this.tamanio=tamanio;
    }
    public void setNombre(String nombre){
         this.nombre=nombre;
    }
    public int getTamanio(){
         return tamanio;
    }
    public String getNombre(){
         return nombre;
    }
}
