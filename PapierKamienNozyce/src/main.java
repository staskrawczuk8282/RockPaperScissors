public class main {

    public static void main(String[] args) {
        PseudoGracz Pseudo = new PseudoGracz();
        GraczChainAI Stas = new GraczChainAI();


        Arena arena = new Arena(Stas,Pseudo);
        arena.fight(10000);
    }
}
