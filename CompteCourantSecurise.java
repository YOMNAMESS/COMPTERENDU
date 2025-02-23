package CompteRendu;


	public class CompteCourantSecurise<T> extends CompteCourant<T> implements Securisable {
	    private String identifDonne;

	    public CompteCourantSecurise(int numeroCompte, double solde, T devise, double limite, String identifDonne) {
	        super(numeroCompte, solde, devise, limite);
	        this.identifDonne = identifDonne;
	    }

	    
	    public boolean verifierIdentite(String identifiant) throws AccesInterditException {
	    	if(identifDonne.equals(identifiant))
	            return identifDonne.equals(identifiant);
	    	else
	            throw new AccesInterditException("Accès non autorisé");
	    }
	    }
