package OOP_Strassenbahn;

public class Main {
    public static void main(String[] args) {

        Strassenbahn sb = new Strassenbahn(1, 20);

        sb.anzeigen();
        sb.fahren();
        sb.halten();
        
        sb.einsteigen(20);
        sb.fahren();
        sb.halten();


    
    }   
    
}
