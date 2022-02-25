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

    // La méthode get_PGCD
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


    //La méthode Simplification
    public void Simplification() {
        int a = this.get_PGCD();
        this.numerateur = this.numerateur / a;
        this.denominateur = this.denominateur / a;
        System.out.println("La simplification de notre fraction est "+this.numerateur+"/"+this.denominateur);
    }


    // La méthode Multiplication
    public Fraction Multiplication(Fraction frac){
        this.numerateur = this.numerateur * frac.numerateur;
        this.denominateur = this.denominateur * frac.denominateur;
        return this;
    }


    // La méthode Addition
    public Fraction Addition(Fraction frac){
        frac.numerateur = frac.numerateur * this.denominateur;
        this.numerateur = this.numerateur * frac.denominateur;
        this.denominateur = this.denominateur * frac.denominateur;
        this.numerateur = this.numerateur + frac.numerateur;
        return this;
    }


    //La méthode Division
    public Fraction Division(Fraction frac){
        this.numerateur = this.numerateur * frac.denominateur;
        this.denominateur = this.denominateur * frac.numerateur;
        return this;
    }


    //La méthode set_Numerateur
    public void set_Numerateur(int numerateur){
        this.numerateur = numerateur;
    }


    //La méthode set_Denominateur
    public void set_Denominateur(int denominateur){
        this.denominateur = denominateur;
    }

    public static void main(String args[]) {
        Fraction Frac1 = new Fraction(2, 7);
        Fraction Frac2 = new Fraction(5, 13);
        System.out.println("\nLes fractions  : ");

        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());
         

    }

    int numerateur;
    int denominateur;
    int remplacer = 0;
}