import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> departements=new HashSet<Departement>();
    Iterator<Departement> it= departements.iterator();
    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        Iterator<Departement> it = departements.iterator();

        while (it.hasNext()) {
            Departement d = it.next();
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;        // found → stop here
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        Iterator<Departement> it = departements.iterator();

        while (it.hasNext()) {
            if (departement.equals(it.next())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementParId() {
        //convert to treeset bc treesets are sorted automatically
        Set<Departement> sortedSet = new TreeSet<>(departements);
        // Print the sorted result
        for (Departement d : sortedSet) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementParNomEtNombreEmployes() {
        List<Departement> sortedList= new ArrayList<>(departements);
        Collections.sort(sortedList,DepartementNameAndNbrEmployeComparator.byNameThenNbr());
        // Print result
        for (Departement d : sortedList) {
            System.out.println(d);
        }
    }
}
