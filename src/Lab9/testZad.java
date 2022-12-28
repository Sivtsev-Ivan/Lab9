package Lab9;

import java.util.Scanner;

public class testZad {
    public static void main(String[] args) {
        Auto myAuto1 = new Auto();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фирму: ");
        String nazv = in.next();
        myAuto1.setFirm(nazv);
        System.out.print("Введите максимальную скорость: ");
        int s = in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.print("Введите государственный номер: ");    //
        int gos = in.nextInt();                                 //
        myAuto1.setNumGos(gos);                                 //
        System.out.println("Какой-то автомобиль: " + myAuto1.getFirm() + " " + myAuto1.getMaxSpeed() + " " + myAuto1.getNumGos());
        System.out.println();


    }
}
