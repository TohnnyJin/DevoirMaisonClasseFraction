class Fraction {

    // Création de la classe Fraction
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    // La méthode get_Numerateur()
    public int get_Numerateur() {
        return this.numerateur;
    }

    // La méthode get_Denominateur()
    public int get_Denominateur() {
        return this.denominateur;
    }

    // La méthode get_PGCD()
    public int get_PGCD() {
        int a = this.numerateur;
        int b = this.denominateur;
        while (b != 0) {
            if (a < b) {
                remplacer = a;
                a = b;
                b = remplacer;
            }
            a = a - b;
        }
        return a;
    }

    // La méthode Affichage()
    public String Affichage() {
        return ("La fraction est " + this.numerateur + "/" + this.denominateur + "." +
                "\nLe numérateur est " + this.numerateur + ", le dénominateur est " + this.denominateur
                + " et le PGCD est " + this.get_PGCD() + ".");
    }


    //La méthode Simplification()
    public void Simplification() {
        int a = this.get_PGCD();
        this.numerateur = this.numerateur / a;
        this.denominateur = this.denominateur / a;
        System.out.println("La simplification de notre fraction est "+this.numerateur+"/"+this.denominateur);
    }


    // La méthode Multiplication()
    public Fraction Multiplication(Fraction frac){
        this.numerateur = this.numerateur * frac.numerateur;
        this.denominateur = this.denominateur * frac.denominateur;
        return this;
    }


    // La méthode Addition()
    public Fraction Addition(Fraction frac){
        int a = this.denominateur;
        int b = frac.denominateur;
        frac.numerateur = frac.numerateur * a;
        this.numerateur = this.numerateur * b;
        this.denominateur = this.denominateur * b;
        this.numerateur = this.numerateur + frac.numerateur;
        return this;
    }


    //La méthode Division()
    public Fraction Division(Fraction frac){
        this.numerateur = this.numerateur * frac.denominateur;
        this.denominateur = this.denominateur * frac.numerateur;
        return this;
    }


    //La méthode set_Numerateur()
    public void set_Numerateur(int numerateur){
        this.numerateur = numerateur;
    }


    //La méthode set_Denominateur()
    public void set_Denominateur(int denominateur){
        this.denominateur = denominateur;
    }

    public static void main(String args[]) {
        Fraction Frac1 = new Fraction(2, 7);
        Fraction Frac2 = new Fraction(5, 13);
        Fraction Frac3 = new Fraction(7, 14);
        Fraction Frac4 = new Fraction(1, 2);
        Fraction Frac5 = new Fraction(6, 1);
        System.out.println("\nLes fractions  : ");

        //Utilisation des méthodes Affichage
        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());
        System.out.println("Fraction N3 : " + Frac3.Affichage());
        
        //Utilsation de la méthode Addition et Simplification
        Frac3.Addition(Frac1);
        System.out.println("Fraction N3 + N1: " + Frac3.Affichage());
        Frac3.Simplification();
        System.out.println("Simplification de N3" + Frac3.Affichage());

        //Utilisation de la méthode Division et Multiplication
        Frac5.Division(Frac4);
        System.out.println("Fraction N5/N4 " + Frac5.Affichage());
        Frac5.Multiplication(Frac4);
        System.out.println("Fraction N5*N4 " + Frac5.Affichage());

        //Utilisation des méthodes get
        Frac5.set_Numerateur(25);
        Frac5.set_Denominateur(5);
        System.out.println("Numerateur de N5 :" + Frac5.get_Numerateur());
        System.out.println("Denominateur de N5 :" + Frac5.get_Denominateur());
        System.out.println("PGCD de N5 :" + Frac5.get_PGCD());
    }

    int numerateur;
    int denominateur;
    int remplacer = 0;
}