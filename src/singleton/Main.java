package singleton;


import prototype.ColorStore;

public class Main {
    public static void main(String[] args){
        ColorStore.getColor("black");
        ColorStore.getColor("blue");
        ColorStore.getColor("black");
        ColorStore.getColor("blue");
    }
}
