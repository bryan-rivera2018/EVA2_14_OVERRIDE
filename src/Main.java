/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OBJETOS
        Animal aAni = new Animal();
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero ("Pararse");
    }
    
}
class Mamifero extends Animal{//Clase hijo o Subclase
    public Mamifero(){
        // LO PRIMERO QUE HACE ES LLAMAR AL CONSTRUCTOR DE LA CLASE ANIMAL (CLASE BASE)
        super();//Llama a clase base
    }
    public Mamifero(String accion){
        super(accion);
        System.out.println(" corre ");
    }
}
class Animal{//Clase base o Clase padre
    public Animal (){
        System.out.println("Respíra");
    }
        public Animal(String accion){
            System.out.println("Respirar y " + accion);
            
        } 
}