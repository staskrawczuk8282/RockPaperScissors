import java.util.concurrent.ThreadLocalRandom;
public class PseudoGracz extends AdvancedGamer {
    @Override
    public int fake() {
        int fake = 1;
        return fake;
    }

    @Override
    public int play(int fake) {
        return ThreadLocalRandom.current().nextInt(1, 3 + 1);
    }

    @Override
    public String name() {
        return "pseudoGracz";
    }

    @Override
    public void score(boolean wynik, int enemyMove) {

    }

    @Override
    public void Wyswietl() {

    }
}
