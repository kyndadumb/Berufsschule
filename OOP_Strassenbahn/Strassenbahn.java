package OOP_Strassenbahn;

public class Strassenbahn {
        
    private int linie;
    private boolean modus;
    private int maxPassagiere;
    private int passagiere;

    // Standardkonstruktor
    public Strassenbahn()
    {
        linie = 0;
        modus = false;
        maxPassagiere = 0;
        passagiere = 0;
    }

    // Parameterkonstruktor
    public Strassenbahn(int linie, int maxPassagiere)
    {
        this.linie = linie;
        this.maxPassagiere = maxPassagiere;        
        passagiere = 0;
        modus = false;
    }

    public void anzeigen()
    {
        //System.out.println()"this.linie);
        System.out.println(String.format("Die Straßenbahn fährt auf der Linie %d", this.linie));
    }

    public int getPassagiere()
    {
        return this.passagiere;
    }

    public void fahren()
    {
        if (this.modus)
        {
            System.out.println("Die Straßenbahn kann nicht nochmal losfahren, wenn sie bereits fährt.");
        }

        else 
        {
            this.modus = true;
            System.out.println("Die Straßenbahn fährt los.");
        }
        
    }

    public void halten()
    {
        if (!this.modus)
        {
            System.out.println("Die Straßenbahn kann nicht nochmal halten, da sie bereits hält.");
        }

        else 
        {
            this.modus = false;
            System.out.println("Die Straßenbahn hält.");
        }
    }

    public void einsteigen(int einsteigende)
    {
        if (!this.modus && passagiere + einsteigende <= maxPassagiere)
        {
            this.passagiere += einsteigende;
            System.out.println(String.format("Es steigen %d Passagiere zu | Gesamtzahl %d", einsteigende, passagiere));
        }
        
        else if (!this.modus)
        {
            
            int verbleibende = (this.passagiere + einsteigende) - maxPassagiere;
            this.passagiere = this.maxPassagiere;
            System.out.println(String.format("Die Strassenbahn ist voll, es bleiben %d Passagiere zurück", verbleibende));
        }

        else 
        {
            System.out.println("Es kann niemand einsteigen, während die Bahn fährt");
        }
    }

    public void aussteigen(int aussteigende)
    {
        if (!this.modus && this.passagiere >= aussteigende)
        {
            this.passagiere -= aussteigende;
            System.out.println(String.format("Es steigen %d1 Passagiere zu | Gesamtzahl %d2", aussteigende, passagiere));
        }
        
        else if(!this.modus)
        {
            this.passagiere = 0;
            System.out.println("Es können nicht mehr Passagiere aussteigen, als aktuell in der Bahn sind");
        }

        else 
        {
            System.out.println("Es kann niemand aussteigen, während die Bahn fährt");
        }

    }
}
