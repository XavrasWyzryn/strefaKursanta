package Ex19_app;
//        Klasy Poem, reprezentującą wiersz,
//        składającą się z pól creator (typu Author)
//        oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)

public class Poem {
    Author creator;
    int stropheNumbers; //reprezentującej ilość zwrotek wiersza

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
