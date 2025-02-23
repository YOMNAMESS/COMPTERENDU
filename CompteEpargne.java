package CompteRendu;

	 public class CompteEpargne<T> extends Compte<T> {
	    private double tauxInteret;

	    public CompteEpargne(int numeroCompte, double solde, T devise, double tauxInteret) {
	        super(numeroCompte, solde, devise);
	        this.tauxInteret = tauxInteret;
	    }

	    public void calculerInteret() {
	        solde += solde * tauxInteret / 100;
	    }

	    public void afficherSolde() {
	        System.out.println("Compte Épargne - Solde: " + solde + " " + devise);
	    }
	}

