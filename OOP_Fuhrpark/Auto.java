import javax.swing.JOptionPane;

public class Auto {

    // Parameter
    private String art;
    private double v;
    private double vMax;
    private double tank;

    // Standardkonstruktor
    public Auto()
    {
        art= "keine Angabe";
        v = 0.0;
        vMax = 0.0;
        tank = 0.0;
    }

    // Methode "kaufen"
    public void kaufen(){
        art = JOptionPane.showInputDialog("Geben Sie die gewünschte Art ein: ", art);
        String eingabe_vMax = JOptionPane.showInputDialog("Geben Sie die maximale Geschwindigkeit ein: ");
        vMax = Double.parseDouble(eingabe_vMax);
    }

    // Methode "tanken"
    public void tanken()
    {
        // 50 Liter tanken
        tank += 50;
    }

    // Methode "ausgabe"
    public void ausgabe()
    {
        System.out.println(String.format("Der %s fährt aktuell %2.2f km/h und hat noch %3.2f Liter im Tank", art, v, tank));

    }

    // Methode "beschleunigen" 
    public void beschleunigen(int geschwindigkeit)
    {
        // if - tankfüllung mehr als -5
        if (getTankfüllung() >= 5)
        {
            // Beschleunigung nur bis zur max. Geschwindigkeit
            v = (v + geschwindigkeit) <= vMax ? v += geschwindigkeit : vMax;
            tank -= 5;
        }

        else 
        {
            System.out.println("DER TANK IST LEER.");
        }
        
    }

    // Methode "bremsen"
    public void bremsen(int geschwindigkeit)
    {
        // Rückgabe = v: -50 wenn über 50 sonst null
        v = v >= geschwindigkeit ? v -= geschwindigkeit : 0;   
    }

    public double getBremsweg(){
        
        // Formel Bremsweg: (v/10)^2
        return v / 10.0 * v / 10.0;
    }

    public double getGeschwindigkeit()
    {
       return this.v;
    }

    public double getTankfüllung()
    {
        return this.tank;
    }
    
}
