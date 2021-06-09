package Cards.Normal;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CrockDealer extends NormalCard {

    public CrockDealer() {
        super("CrockDealer");
        animalPicture = new Picture(550, 85, "CROCDEALER.jpg");
        animalPicture.draw();
        keyboardInit();

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public void actionOne() {
        super.actionOne();
        Picture question = new Picture();
        question.draw();
        keyboardInit();
        if (isYes) {
            executeActionYes();
        } else {
            executeActionNo();
        }
        question.delete();
    }

    @Override
    public void actionTwo() {
        super.actionTwo();
        Picture question = new Picture();
        question.draw();
        keyboardInit();
        if (isYes) {
            executeActionYes();
        } else {
            executeActionNo();
        }
        question.delete();

    }

    @Override
    public void actionThree() {
        super.actionThree();
        Picture question = new Picture();
        question.draw();
        keyboardInit();
        if (isYes) {
            executeActionYes();
        } else {
            executeActionNo();
        }
        question.delete();
    }

    @Override
    public void actionFour() {
        super.actionFour();
        Picture question = new Picture();
        question.draw();
        keyboardInit();
        if (isYes) {
            executeActionYes();
        } else {
            executeActionNo();
        }
        question.delete();
    }

    @Override
    public void executeActionYes() {
        super.executeActionYes();
    }

    @Override
    public void executeActionNo() {
        super.executeActionNo();
    }

    @Override
    public void cardSelected() {
        super.cardSelected();
        animalString = new Picture();
        actionRandomizer();
        keyboardInit();
    }

    @Override
    public void actionRandomizer() {
        int randomize = (int) ((Math.random() * 4) + 1);

        switch (randomize) {
            case 1:
                actionOne();
                break;
            case 2:
                actionTwo();
                break;
            case 3:
                actionThree();
                break;
            case 4:
                actionFour();
                break;
            default:
                System.out.println("Something unexpected happened!");
        }

    }
}


