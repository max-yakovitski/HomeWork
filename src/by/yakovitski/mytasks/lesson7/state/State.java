package by.yakovitski.mytasks.lesson7.state;

import java.util.ArrayList;
import java.util.List;

public class State {

    private String stateName;
    private List<Area> stateAreas;
    private int areaQuantity;
    private double stateSquare;

    public State(String stateName) {
        this.stateName = stateName;
        stateAreas = new ArrayList<>();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<Area> getStateAreas() {
        return stateAreas;
    }

    public void setStateAreas(List<Area> stateAreas) {
        this.stateAreas = stateAreas;
    }

    public int getAreaQuantity() {
        return areaQuantity;
    }

    public void setAreaQuantity(int areaQuantity) {
        this.areaQuantity = areaQuantity;
    }

    public double getStateSquare() {
        return stateSquare;
    }

    public void setStateSquare(double stateSquare) {
        this.stateSquare = stateSquare;
    }

    public void addArea (Area area) {
        stateAreas.add(area);
        this.stateSquare += area.getSquare();
        areaQuantity++;
    }

    public void deleteArea (Area area) {
        stateAreas.remove(area);
        this.stateSquare -= area.getSquare();
        areaQuantity--;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", stateAreas=" + stateAreas +
                ", areaQuantity=" + areaQuantity +
                ", stateSquare=" + stateSquare +
                '}';
    }

    public void printInfo () {
        System.out.println("Государство " + getStateName() + ", колличество областей: " + getAreaQuantity() +
        ", площадь: " + getStateSquare());

        for (Area area: stateAreas) {
            if (area.isCapital()) {
                System.out.println("Столица - " + area.getCity());
            }
            System.out.print("Обл.центр - " + area.getCity() + ", ");
        }
    }
}