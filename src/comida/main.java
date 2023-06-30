import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {

        List comida = new ArrayList();
        comida.add( new oriente("Fritada","Sierra","Salado",365,"aliño, sal, pimienta, etc.","Encebollado","carne chancho","aji","plano","tostado, maduro frito, mote"));

        try {

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
