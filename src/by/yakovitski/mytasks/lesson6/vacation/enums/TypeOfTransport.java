package by.yakovitski.mytasks.lesson6.vacation.enums;

public enum TypeOfTransport {
    PLANE("самолет"),
    CAR ("машина"),
    TRAIN ("поезд"),
    LINER("круизный лайнер"),
    BUS("автобус");

    private String TypeOfTransport;

    TypeOfTransport(String typeOfTransport) {
        TypeOfTransport = typeOfTransport;
    }

    public String getTypeOfTransport() {
        return TypeOfTransport;
    }
}
