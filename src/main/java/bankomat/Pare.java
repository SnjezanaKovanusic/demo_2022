package bankomat;

public class Pare {
    int stotice;
    int pedesetice;
    int desetke;
    int stanjeUBankomatu;

    public Pare() {
        stanjeUBankomatu= 6000;
        desetke = 100; // 1000
        pedesetice = 60; // 3000
        stotice = 20; // 2000
    }

    public int getStotice() {
        return stotice;
    }

    public void setStotice(int stotice) {
        this.stotice = stotice;
    }

    public int getPedesetice() {
        return pedesetice;
    }

    public void setPedesetice(int pedesetice) {
        this.pedesetice = pedesetice;
    }

    public int getDesetke() {
        return desetke;
    }

    public void setDesetke(int desetke) {
        this.desetke = desetke;
    }

    public int getStanjeUBankomatu() {
        return stanjeUBankomatu;
    }

    public void setStanjeUBankomatu(int stanjeUBankomatu) {
        this.stanjeUBankomatu = stanjeUBankomatu;
    }

    @Override
    public String toString() {
        return "Pare{" +
                "stotice=" + stotice +
                ", pedesetice=" + pedesetice +
                ", desetke=" + desetke +
                ", stanjeUBankomatu=" + stanjeUBankomatu +
                '}';
    }
}
