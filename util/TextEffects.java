package util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

import static consoleOut.DisplayContact.*;

public class TextEffects {
    public static void slowPrint(String output) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printLogo() {
        slowPrint("***************************************************\n" +
                "   ______            __             __       ______\n" +
                "  / ____/___  ____  / /_____ ______/ /______/ / / /\n" +
                " / /   / __ \\/ __ \\/ __/ __ `/ ___/ __/ ___/ / / / \n" +
                "/ /___/ /_/ / / / / /_/ /_/ / /__/ /_(__  )_/_/_/  \n" +
                "\\____/\\____/_/ /_/\\__/\\__,_/\\___/\\__/____(_|_|_)\n\n" +
                "***************************************************");
    }

    public static void printLogo2() {
        slowPrint(ANSI_GREEN
                + "\n" +
                "                                                                                                                                  \n" +
                "    ,o888888o.        ,o888888o.     b.             8 8888888 8888888888   .8.           ,o888888o.8888888 8888888888 d888888o.   \n" +
                "   8888     `88.   . 8888     `88.   888o.          8       8 8888        .888.         8888     `88.    8 8888     .`8888:' `88. \n" +
                ",8 8888       `8. ,8 8888       `8b  Y88888o.       8       8 8888       :88888.     ,8 8888       `8.   8 8888     8.`8888.   Y8 \n" +
                "88 8888           88 8888        `8b .`Y888888o.    8       8 8888      . `88888.    88 8888             8 8888     `8.`8888.     \n" +
                "88 8888           88 8888         88 8o. `Y888888o. 8       8 8888     .8. `88888.   88 8888             8 8888      `8.`8888.    \n" +
                "88 8888           88 8888         88 8`Y8o. `Y88888o8       8 8888    .8`8. `88888.  88 8888             8 8888       `8.`8888.   \n" +
                "88 8888           88 8888        ,8P 8   `Y8o. `Y8888       8 8888   .8' `8. `88888. 88 8888             8 8888        `8.`8888.  \n" +
                "`8 8888       .8' `8 8888       ,8P  8      `Y8o. `Y8       8 8888  .8'   `8. `88888.`8 8888       .8'   8 8888    8b   `8.`8888. \n" +
                "   8888     ,88'   ` 8888     ,88'   8         `Y8o.`       8 8888 .888888888. `88888.  8888     ,88'    8 8888    `8b.  ;8.`8888 \n" +
                "    `8888888P'        `8888888P'     8            `Yo       8 8888.8'       `8. `88888.  `8888888P'      8 8888     `Y8888P ,88P' \n" + ANSI_RESET +
                "\n");
    }

    public static void printBender() {
        slowPrint(
                "                     :~                 \n" +
                        "                     :!                 \n" +
                        "                     ~?.                \n" +
                        "                  ~Y5PP5?:              \n" +
                        "                 ^GGGGGGBJ              \n" +
                        "               :~JPPPPPPPY              \n" +
                        "              !:Y&GP##PGPY                "+ANSI_RED+ " ██████╗  ██████╗  ██████╗ ██████╗ ██████╗ ██╗   ██╗███████╗         \n" + ANSI_RESET +
                        "              ^^!PP5PG5PPY                 "+ANSI_RED+ "██╔════╝ ██╔═══██╗██╔═══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝██╔════╝         \n" + ANSI_RESET +
                        "    ?7           :JPP555PJ         .^:    "+ANSI_RED+ " ██║  ███╗██║   ██║██║   ██║██║  ██║██████╔╝ ╚████╔╝ █████╗           \n" + ANSI_RESET +
                        "  .?J5Y!.         7PP5P5PJ         :!~   "+ANSI_RED+ "  ██║   ██║██║   ██║██║   ██║██║  ██║██╔══██╗  ╚██╔╝  ██╔══╝           \n" + ANSI_RESET +
                        " :~!7Y5P?      ^?5GGGGGGGBGY~      ^!!.   "+ANSI_RED+ "╚██████╔╝╚██████╔╝╚██████╔╝██████╔╝██████╔╝   ██║   ███████╗         \n" + ANSI_RESET +
                        " ::.^.!5~     ~PGGGGGGGGGGPP5^   :!!!7~    "+ANSI_RED+ " ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═════╝    ╚═╝   ╚══════╝         \n" + ANSI_RESET +
                        "      !57   .^J5PPPPPPP5GP555J.  ~J??77.   "+ANSI_RED+ "                                                                     \n" + ANSI_RESET +
                        "      .7YJ7??J!5GGGGGGP5GG5JYY^  .!7?77.  "+ANSI_RED+ "   ███╗   ███╗███████╗ █████╗ ████████╗██████╗  █████╗  ██████╗ ███████╗\n" + ANSI_RESET +
                        "        :^~~:. JGGGGGGP5GGGP~?Y7^7?!~!~     "+ANSI_RED+ " ████╗ ████║██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██╔════╝ ██╔════╝\n" + ANSI_RESET +
                        "               7GGGGG555GGG5  ^??J7:        "+ANSI_RED+ " ██╔████╔██║█████╗  ███████║   ██║   ██████╔╝███████║██║  ███╗███████╗\n" + ANSI_RESET +
                        "               ~GGGGGGP5GGG!            " +ANSI_RED+ "     ██║╚██╔╝██║██╔══╝  ██╔══██║   ██║   ██╔══██╗██╔══██║██║   ██║╚════██║\n" + ANSI_RESET +
                        "               :5PPGGGPPGGP.            " +ANSI_RED+ "     ██║ ╚═╝ ██║███████╗██║  ██║   ██║   ██████╔╝██║  ██║╚██████╔╝███████║\n" + ANSI_RESET +
                        "                7YJ777J5Y7^             " +ANSI_RED+ "     ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚══════╝\n" + ANSI_RESET +
                        "               7YJ:  ^JY~               \n" +
                        "              !5Y^  .J5?                \n" +
                        "             .JY?   :YY~                \n" +
                        "              ?YJ.  .J57                \n" +
                        "              ^YY~   ^YY^               \n" +
                        "              ~Y5Y?!. ^JY~.             \n" +
                        "             7GGGGGG?^Y55PPY^           ");

    }


}


