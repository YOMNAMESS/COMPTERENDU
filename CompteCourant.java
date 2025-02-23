package CompteRendu;

	public class CompteCourant<T> extends Compte<T> {
	    private double limite;

	    public CompteCourant(int numeroCompte, double solde, T devise, double limite) {
	        super(numeroCompte, solde, devise);
	        this.limite = limite;
	    }

	   
	    public void retirer(double montant)  {
	        if (solde - montant >= -limite) {
	            solde -= montant;
	        } 
	    }

	    
	    public void afficherSolde() {
	        System.out.println("Compte Courant - Solde: " + solde + " " + devise);
	    }
	}

