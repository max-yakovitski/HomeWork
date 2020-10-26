package by.yakovitski.mytasks.lesson7.state;

public class StateTest {
    public static void main(String[] args) {
        State state = new State("Беларусь");
        Area area1 = new Area("Минская обл.", 3_492_000, 40_200.0, new City("Минск"), true);
        Area area2 = new Area("Брестская обл.", 1_347_000, 32_800.0, new City("Брест"), false);
        Area area3 = new Area("Гродненская обл.", 1_025_000, 25_100.0, new City("Гродно"), false);
        Area area4 = new Area("Витебская обл.", 1_133_000, 40_000.0, new City("Витебск"), false);
        Area area5 = new Area("Могилёвская обл.", 1_023_000, 29_100.0, new City("Могилёв"), false);
        Area area6 = new Area("Гомельская обл.", 1_386_000, 40_400.0, new City("Гомель"), false);
        state.addArea(area1);
        state.addArea(area2);
        state.addArea(area3);
        state.addArea(area4);
        state.addArea(area5);
        state.addArea(area6);
        state.printInfo();
    }
}
