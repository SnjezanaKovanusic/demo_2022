package objekti.enumi;

public enum Dan {
    PONEDELJAK(1), UTORAK(2), SRJEDA(3), CETVRTAK(3), PETAK(4), SUBOTA(5), NEDELJA(6);
    int i;

    Dan(int i) {
        this.i = i;
    }

    public int get() {
        return i;
    }
}


