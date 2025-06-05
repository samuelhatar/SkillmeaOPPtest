import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random nahCislo = new RodinnyDom();
        nahCislo.nextInt();

        RodinnyDom dumNovaku = new RodinnyDom();
        /*dumNovaku.pocetPoschodi = 4;
        dumNovaku.rozloha = 457f;
        dumNovaku.materal = "mramor";*/
        float cenaPrvehoDomu = dumNovaku.vypocetCennyDomu(cenaZaMeter 300, "Novaka");

        RodinnyDom dumZajicu = new RodinnyDom();
        /*dumZajicu.rozloha = 457f;
        dumZajicu.pocetPoschodi = 3;*/
        //dumZajicu.vypocetCennyDomu();
        //dumNovaku.vypocetCennyDomu(cenaZaMeter 250);

        //RodinnyDom dumSimu = new RodinnyDom();

        //String niakyText = "naco";


    }
}