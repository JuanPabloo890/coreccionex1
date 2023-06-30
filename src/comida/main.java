package comida;

import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {

        List comida = new ArrayList();
        comida.add( new oriente("Fritada","Sierra","Salado",365,"aliño, sal, pimienta, etc.","Encebollado","carne chancho","aji","plano","tostado, maduro frito, mote"));

        oriente ori = new oriente("Encebollado","Costa","salado-sopa",600,"caldo,sal,cebolla","Encebollado","pescado","aji","Hondo","patacones-chifles-canguil");
        oriente comida2 = new oriente("Guanta","Oriente","Salado",500,"aliño","Encebollado","Guanta","aji","Plano","Arroz");

        try {
            comida2.mostrardatos();
            ori.mostrardatos();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
