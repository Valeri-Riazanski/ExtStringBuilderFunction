package com.val.riazanski;

public class Application {
    public static void main(String[] args) {
        ExtendStringBuilder stringBuilder = new ExtendStringBuilder(new StringBuilder("salkdfasldkfasldkfasldas;dlkfj/asdfkljas;dlfjkfj"));
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(3, 7);
        System.out.println(stringBuilder.toString());
        stringBuilder.unDo();
        System.out.println(ConsoleColors.CYAN + stringBuilder.toString() + ConsoleColors.RESET);
        stringBuilder.append("_фыдлваоыфвдла");
        System.out.println(stringBuilder.toString());
        stringBuilder.unDo();
        System.out.println(ConsoleColors.PURPLE + stringBuilder.toString() + ConsoleColors.RESET);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
        stringBuilder.unDo();
        System.out.println(ConsoleColors.BLUE + stringBuilder.toString() + ConsoleColors.RESET);
        stringBuilder.insert( 5,"_ДШОдзщшЗЩШЗЩШ_");
        System.out.println(stringBuilder.toString());
        stringBuilder.unDo();
        System.out.println(ConsoleColors.YELLOW + stringBuilder.toString() + ConsoleColors.RESET);
        stringBuilder.replace(5, 8, "_ЕКВЧКЕЧ_");
        System.out.println(stringBuilder.toString());
        stringBuilder.unDo();
        System.out.println(ConsoleColors.RED + stringBuilder.toString() + ConsoleColors.RESET);
    }
}
