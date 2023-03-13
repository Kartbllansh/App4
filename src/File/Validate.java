package File;

import Base.*;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Validate {
    int countError;
    RandomLongGenerator randomLongGenerator = new RandomLongGenerator(); // как можно переписать?
    public void startValide(LinkedList<Dragon> dragons) {
        Scanner in = new Scanner(System.in);
        Scanner namescan = new Scanner(System.in);
        Scanner colorscan = new Scanner(System.in); //почему со старым не работает
        Scanner typescan = new Scanner(System.in);
        Scanner sizescan = new Scanner(System.in);
        Scanner eyesscan = new Scanner(System.in);
        Scanner toothscan = new Scanner(System.in);
        Scanner xscan = new Scanner(System.in);
        Scanner agescan = new Scanner(System.in);
        int des = 0;
        Boolean start = true;
        for (int i = 0; i < dragons.size(); i++) {
            Dragon drCheck = dragons.get(i);
            String namecheck = drCheck.getName();//AAA
            Long idcheck = drCheck.getId(); //сделать
            Integer agecheck = drCheck.getAge();//AAA
            Long weightcheck = drCheck.getWeight(); //AAA
            Color colorcheck = drCheck.getColor(); //ФФФ
            DragonType typecheck = drCheck.getType(); //ААА
            DragonHead headcheck = drCheck.getHead();
            Double sizecheck = headcheck.getSize();
            Integer eyescheck = headcheck.getEyesCount();
            Long toothcheck = headcheck.getToothCount();
            Coordinates coordinatescheck = drCheck.getCoordinates();
            Float xcheck = coordinatescheck.getX();
            System.out.println("Validate Object №" + (i+1) + " start...");
            Long fromfile = drCheck.getId();
            Long idnumber = RandomLongGenerator.generId();

        //справить 0 второго
            if(des==1){
                System.out.println("Id остался прежний");
            } else {
                System.out.println("Программа может сгенерировать свой id для драконов. Оставить ваш или сгенерировать новый? Если новый введите 0, если оставить 1");
                des = in.nextInt();
                try {
                    if (des == 0) {
                        drCheck.setId(idnumber);
                        System.out.println("Новый id сгенерился он равен " + idnumber);
                    } else if (des == 1) {

                        System.out.println("Id остался прежний");
                    } else {
                        System.out.println("Вы ввели неверно число. Id оставлен");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                }
            }

            if (namecheck.isEmpty()) {
                countError++;
                System.out.println("The file contains a dragon without a name. You can not do it this way. Введите имя дракона №" + (i + 1));
                Boolean otvet = false;
                while (!otvet) {
                    String newname = namescan.nextLine();
                    if (newname.matches("[-a-zA-Zа-яА-ЯЁё]+")) {
                        drCheck.setName(newname);
                        otvet = true;
                    } else {
                        System.out.println("Неправильный формат");
                    }

                }

            }


                //убрать возможность цифр
                try {
                    if (agecheck < 0) {
                        countError++;
                        System.out.println("The file contains a dragon with age < 0. You can not do it this way. Введите возраст больше 0");
                        Integer newage = agescan.nextInt();
                        drCheck.setAge(newage);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }
                try {
                    if (weightcheck <= 0) {
                        countError++;
                        System.out.println("The file contains a dragon with weight <= 0. You can not do it this way. Введите возраст больше 0");
                        Long newwei = in.nextLong();
                        drCheck.setWeight(newwei);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }

                if (colorcheck == null) {
                    countError++;
                    System.out.println("The file contains a dragon without color or I don't know it. Take paints");
                    System.out.println("Выберите из: YELLOW ORANGE WHITE . Если выберите другой вариант программа закончит работать");


                    String a = colorscan.nextLine().trim();
                    Boolean b = a.equals("WHITE");
                    Boolean c = a.equals("ORANGE");
                    Boolean d = a.equals("YELLOW");
                    if (b | c | d) {
                        Color newcolor = Color.valueOf(a);
                        drCheck.setColor(newcolor);
                    } else {
                        System.out.println("Я предупреждал. Вы ввели неправильно цвет. Возращайтесь когда научитель писать");
                        System.exit(0);
                    }
                }


                if (typecheck == null) {
                    countError++;
                    System.out.println("The file contains a dragon without type. Подумай");
                    System.out.println("Выберите из: WATER UNDERGROUND AIR . Если выберите другой вариант программа закончит работать");
                    String f = typescan.nextLine().trim();
                    Boolean e = f.equals("WATER");
                    Boolean q = f.equals("UNDERGROUND");
                    Boolean o = f.equals("AIR");
                    if (e | q | o) {
                        DragonType newtype = DragonType.valueOf(f);
                        drCheck.setType(newtype);
                    } else {
                        System.out.println("Я предупреждал. Вы ввели неправильное тип. Возращайтесь когда научитель писать");
                        System.exit(0);
                    }

                }

                try {
                    if (sizecheck < 0) {
                        countError++;
                        System.out.println("The file contains a dragon with size < 0. You can not do it this way. Введите размер больше 0");
                        Double sizenew = sizescan.nextDouble();
                        System.out.println(sizenew);
                        headcheck.setSize(sizenew);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }
                try {
                    if (eyescheck < 0) {
                        countError++;
                        System.out.println("The file contains a dragon with eyes count < 0. You can not do it this way. Введите количество глаз больше 0");
                        Integer eyesnew = eyesscan.nextInt();
                        headcheck.setEyesCount(eyesnew);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }
                try {
                    if (toothcheck <= 0) {
                        countError++;
                        System.out.println("The file contains a dragon with tooth count <= 0. You can not do it this way. Введите количество зубов больше 0");
                        Long toothnew = toothscan.nextLong();
                        headcheck.setToothCount(toothnew);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }

                try {
                    if (xcheck < -474 | xcheck == 0) {
                        countError++;
                        System.out.println("The file contains a dragon with coordinate < -474 or = 0. You can not do it this way. Введите координату больше -474 и не 0");
                        Float xnew = xscan.nextFloat();
                        coordinatescheck.setX(xnew);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число, принимаются только они");
                    System.exit(0);
                }
            System.out.println("С "+ drCheck.getName()+" все хорошо. Он в порядке");
            }

        in.close();
        namescan.close();
        colorscan.close();
        typescan.close();
        sizescan.close();
        toothscan.close();
        eyesscan.close();
        xscan.close();
        agescan.close();

        }

    }


