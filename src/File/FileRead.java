package File;

import Base.Dragon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.Scanner;

public class FileRead {
    private final String FILENAME;

    public FileRead(String filename) { //при создании объекта будет передаваться имя файла
        this.FILENAME = filename;
    }
    public String readFile() {
        StringBuilder sb = new StringBuilder(); //строчка, которая может изменяться. Не надо создавать много перменных. Оптимизация
        String line = null;
        try (Scanner sc = new Scanner(new File(FILENAME), StandardCharsets.UTF_8);) { //Почему в () . Создание объекта класса сканер, который читает файл
            while (sc.hasNextLine()) { // проверяет, является ли следующая порция данных строкой
                line = sc.nextLine(); //считывает и переводит на следующую строчку
                sb.append(line); //добавляет строчку к последовательности

            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("WORKKKK"); //проверка работы метода
        return sb.toString();
    }


}
