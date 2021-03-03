/******************************************************************************
 I just tried to create small chatbot😁😁
 *******************************************************************************/

package com.nastehaMoha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Howdy Friend! 🙋️");
        Scanner sc = new Scanner(System.in);
        String good = sc.nextLine();

        if(good.equals("Good")){
            System.out.println("I am glad to hear it😍 ");
            System.out.println("Could you tell me your name?");
            String name = sc.nextLine();
            System.out.println(name + " you have beautiful name");

        }
    else{

        System.out.println("What is wrong with you? ");
        String w = sc.nextLine();
        if(w.equals("Nothing")){
            System.out.println("Tell me Something about yourself");
            String info = sc.nextLine();
            System.out.println("Wow that's great 😱");
        }else{
            System.out.println("It was good talking to you😊");
        }

    }

}
}
