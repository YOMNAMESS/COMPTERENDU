package CompteRendu;

  public class Gestion {
	    private Map<Integer, Compte<?>> comptes = new HashMap<>();

	    public void ajouterCompte(Compte<?> compte) {
	        comptes.put(compte.numeroCompte, compte);
	    }

	    public Compte<?> rechercherCompte(int numeroCompte) {
	        return comptes.get(numeroCompte);
	    }

	    public void supprimerCompte(int numeroCompte) {
	        comptes.remove(numeroCompte);
	    }

	    public void afficherComptesTriesParSoldeDecroissant() {
	        List<Compte<?>> listeComptes = new ArrayList<>(comptes.values());
	        Collections.sort(listeComptes, new Comparator<Compte<?>>() {
	            @Override
	            public int compare(Compte<?> c1, Compte<?> c2) {
	                return Double.compare(c2.solde, c1.solde);
	            }
	        });
	        for (Compte<?> compte : listeComptes) {
	            compte.afficherSolde();
	        }
	    }
	}
	

}
