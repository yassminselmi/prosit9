public interface IGestion <T>{
    public void ajouterEmploye(T employee);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);
    public void supprimerEmploye(T t);
    public void trierEmployeParId(); //comparable
    public void trierEmployeParNomDepartementEtGrade(); //comparator
}
