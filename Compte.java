package CompteRendu;

	public class Compte<T> {
	    protected int numeroCompte;
	    protected double solde;
	    protected T devise;

	    public Compte(int numeroCompte, double solde, T devise) {
	        this.numeroCompte = numeroCompte;
	        this.solde = solde;
	        this.devise = devise;
	    }

	    public void deposer(double montant) {
	        solde += montant;
	    }

	    public void retirer(double montant){
	        if (solde >= montant) {
	            solde -= montant;
	        } 
	    }

	    public void afficherSolde() {
	        System.out.println("Compte - Solde: " + solde + " " + devise);
	    }
	    public static <T> void transferer(Compte<T> source, Compte<T> destination, double montant) {
	        source.retirer(montant);
	        destination.deposer(montant);
	    }

	}
