package Factory;

public class Factory {

    Toy create(String name) {
        if (name == "teddy")
            return new TeddyBear();

        return new Gameboy();
    }

    GiftPaper getPaper() {
        return new GiftPaper();
    }
}
