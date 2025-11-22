import java.util.TreeMap;

public class GestionDepatement {
    public static void main(String[] args) {
        Departement d1 = new Departement(1,"B",3);
        Departement d2 = new Departement(2,"A",4);
        Departement d3 = new Departement(3,"C",5);
        Employe e1 = new Employe();
        Employe e2 = new Employe();
        Employe e3 = new Employe();
        Employe e4 = new Employe();
        e1.setNom("Amira");
        e1.setPrenom("selmi");;
        e1.setNomDepart("A");
        e1.setGrade(1);

        e2.setNom("badis");
        e2.setPrenom("labidi");
        e2.setNomDepart("A");
        e2.setGrade(2);

        e3.setNom("chaima");
        e3.setPrenom("ltaif");
        e3.setNomDepart("C");
        e3.setGrade(3);

        e4.setNom("amira");
        e4.setPrenom("labidi");
        e4.setNomDepart("A");
        e4.setGrade(4);

        AffectationHashMap a = new AffectationHashMap();
        a.ajouterEmployeDepartement(e1,d1);
        a.ajouterEmployeDepartement(e2,d2);
        a.ajouterEmployeDepartement(e3,d3);
        a.ajouterEmployeDepartement(e1,d2);
        a.ajouterEmployeDepartement(e2,d3);
        a.afficherEmployeEtDepartement();
        a.afficherEmployes();
        System.out.println("Recherche employé inconnu : " + a.rechercherEmploye(e4));
        System.out.println("Recherche département inconnu : " + a.rechercherDepartement(d1));
        a.supprimerEmploye(e1);
        a.afficherEmployeEtDepartement();
        a.afficherEmployes();
        TreeMap<Employe, Departement> affectationsTriees = a.trierMap();
        affectationsTriees.forEach((e, d) -> {
            System.out.println("ID " + e.getId() + " : " + e.getNom() + " " +
                    e.getPrenom() + " → " + d.getNomDepartement());
        });

    }}
