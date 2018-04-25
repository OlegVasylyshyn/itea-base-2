package week4.day2.station;

public class Test {

    public static void main(String[] args) {

        FakeNuclearStation nuclearStation = new FakeNuclearStation();
        checkStation(nuclearStation);

    }

    private static void checkStation(final UkrainianNS nuclearStation) {
        nuclearStation.work();
    }

}

class FakeNuclearStation extends UkrainianNS {
    public void work() {
        System.out.println("BOOM");
    }
}
