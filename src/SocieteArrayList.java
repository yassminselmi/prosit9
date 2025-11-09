import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employees=new ArrayList<Employe>();
    @Override
    public void ajouterEmploye(Employe employee) {
        employees.add(employee);
    }
    //findByName
    @Override
    public boolean rechercherEmploye(String nom) {
        boolean retour=false;
        for (Employe employee : employees) {
            if (employee.getNom().equals(nom)) {
                retour = true;
                break;
            }
        }
        return retour;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employees.contains(employe);
    }
    @Override
    public void displayEmploye() {
        for(Employe employee : employees){
            System.out.println(employee.getNom()+employee.getPrenom()+employee.getNomDepart()+employee.getGrade());
        }
    }
    @Override
    public void supprimerEmploye(Employe employe) {
        employees.remove(employe);
    }
    //Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }
    //Comparator
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employees, new EmployeeDepNameAndGradeComparator());
    }

}
