import Impuestos.Comodato;
import Impuestos.Own;
import Impuestos.Place;
import Impuestos.Rent;

public class Main {
    public static void main(String[] args) throws Exception {
        Own[] ownVector = new Own[3];
        Comodato[] comodatoVector = new Comodato[3];
        Rent[] rentVector = new Rent[3];

        for (int index = 0; index < 3; index++) {
            Own newOwn = new Own();
            newOwn.loadData();
            ownVector[index] = newOwn;
        }

        for (int index = 0; index < 3; index++) {
            Comodato newComodato = new Comodato();
            newComodato.loadData();
            comodatoVector[index] = newComodato;
        }

        for (int index = 0; index < 3; index++) {
            Rent newRent = new Rent();
            newRent.loadData();
            rentVector[index] = newRent;
        }

        printVector(ownVector);
        printVector(comodatoVector);
        printVector(rentVector);
    }

    static public void printVector(Place[] place){
        for (int i = 0; i < place.length; i++) {
            place[i].showPlace();
        }
    }
}
