import java.util.*;

public class AffectationHashMap {
    Map<Employe, Departement> affectationHashMap=new HashMap<Employe, Departement>();
    public void ajouterEmployeDepartement(Employe e,Departement d) {
        affectationHashMap.put(e,d);
    }
    public void afficherEmployeEtDepartement() {
        for (Map.Entry<Employe, Departement> entry : affectationHashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public void supprimerEmploye(Employe e) {
        if (e==null) {
            return;
        }
        if (affectationHashMap.containsKey(e)) {
            affectationHashMap.remove(e);
        }
    }
    public void supprimerEmployeEtDepartement(Employe e,Departement d) {
        if (e==null || d==null) {
            return;
        }
        Departement departement=affectationHashMap.get(e);
        if (departement==null && departement.equals(d)) {
            affectationHashMap.remove(e);
            System.out.println("affectation supprimée");
        }else  {
                System.out.println("l'employe "+e+" n'a pas le departement "+departement);
        }
    }
    public void afficherEmployes(){
        Set<Employe> employes=affectationHashMap.keySet();
        if( affectationHashMap.isEmpty()){
            System.out.println("affectation is empty");
            return;
        }
        for(Employe e:employes){
            System.out.println(e);
        }
    }
    public void afficherDepartements(){
        if(affectationHashMap.isEmpty()){
            System.out.println("affectation is empty");
            return;
        }
        Set<Departement> departements=new HashSet<Departement>(affectationHashMap.values());
        for(Departement d:departements){
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e){
        return affectationHashMap.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        return affectationHashMap.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        return new TreeMap<>(affectationHashMap);
    }

}
