public class RodinnyDom {

    private int pocetPoschodi;

    private String materal;

    private float rozloha;

    private int pocetOkien;

    public void zmenaRozlohy(float novaRozloha);

    RodinnyDom(int pocPos, String mat, float roz) {
        this.pocetPoschodi = pocetPoschodi;
        this.materal = material;
        this.rozloha = rozloha;
        //System.out.println("Teraz sa vola konstruktor");
    }


    public float vypocetCennyDomu(int cenaZaMeter, String menoRodini){
        Float cena = rozloha * cenaZaMeter * pocetPoschodi;
        System.out.println(menoRodiny+ " " + cena);
        return cena;

    }

}
