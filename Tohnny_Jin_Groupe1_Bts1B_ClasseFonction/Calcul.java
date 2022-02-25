class Fraction {

    //Création de la classe Fraction
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    //La méthode get_Numerateur()
    public int get_Numerateur() {
        return this.numerateur;
    }

    //La méthode get_Denominateur()
    public int get_Denominateur() {
        return this.denominateur;
    }

    //La méthode get_PGCD
    public int get_PGCD() {
        while (this.denominateur != 0) {
            if (this.numerateur < this.denominateur) {
                remplacer = this.numerateur;
                this.numerateur = this.denominateur;
                this.denominateur = remplacer;
            }
            this.numerateur = this.numerateur - this.denominateur;
        }
        remplacer = this.numerateur;
        return remplacer;
    }

    //La méthode Affichage()
    public String Affichage() {
        return ("La fraction est " + this.numerateur + "/" + this.denominateur + "." +
                "\nLe numérateur est " + this.numerateur + ", le dénominateur est " + this.denominateur
                + " et le PGCD est " + this.get_PGCD() + ".");
    }


    public static void main(String args[]) {
        Fraction Frac1 = new Fraction(2, 7);
        Fraction Frac2 = new Fraction(5, 13);
        System.out.println("\nLes fractions  : ");

        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println(Frac1.get_Denominateur());
        /*
        System.out.println("Fraction N2 : " + Frac2.Affichage());
        */

    }

    int numerateur;
    int denominateur;
    int remplacer = 0;
}