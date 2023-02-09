public class Fuhrpark {
    public static void main(String[] args) {
    
    Auto meinAuto = new Auto();
    
    meinAuto.kaufen();
    
    for (int i = 0; i <= 5; i++)
    {
        
        meinAuto.beschleunigen(100);

        // Ausgabe nur, wenn der Tank nicht leer ist
        if (!(meinAuto.getTankfüllung() == 0))
        {
            System.out.println(String.format("aktuelle Geschwindigkeit: %1.2f | aktueller Bremsweg: %2.2f", 
            meinAuto.getGeschwindigkeit(), meinAuto.getBremsweg()));
        }
        
    }

    System.out.println(String.format("Der aktuelle Bremsweg: %1.2f Meter.", meinAuto.getBremsweg()));
    
    }
}
