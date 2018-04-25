package week7.generics;

import java.util.ArrayList;
import java.util.List;

public class AngelTest {

    public static void main(String[] args) {

        List<Angel> angels = getAngels();
        heaven(angels);

    }

    private static List getAngels(){
        return new ArrayList<Daemon>(){{add(new Daemon());}};
    }

    private static void heaven(List<Angel> angels){
        // why daemons are in the heaven??
        Angel angel = angels.get(0);
    }

}

class Angel{}

class Daemon {}
