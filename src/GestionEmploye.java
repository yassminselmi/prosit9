public class GestionEmploye {
    public static void main(String[] args) {
        SocieteArrayList s1 = new SocieteArrayList();

        Employe e1 = new Employe();
        Employe e2 = new Employe();
        Employe e3 = new Employe();
        e1.setNom("Amira");
        e1.setPrenom("selmi");;
        e1.setNomDepart("A");
        e1.setGrade(1);

        e2.setNom("badis");
        e2.setPrenom("labidi");
        e2.setNomDepart("B");
        e2.setGrade(2);
        e3.setNom("chaima");
        e3.setPrenom("ltaif");
        e3.setNomDepart("C");
        e3.setGrade(3);

        s1.ajouterEmploye(e2);
        s1.ajouterEmploye(e3);
        s1.ajouterEmploye(e1);
        System.out.println("**********Apres Ajout**********");
        s1.displayEmploye();
        System.out.println("***********Apres Tri par Id***********");
        s1.trierEmployeParId();
        s1.displayEmploye();
        System.out.println("**********Apres Tri par Nom departement et grade********");
        s1.trierEmployeParNomDepartementEtGrade();
        s1.displayEmploye();
    }
}