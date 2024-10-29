/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author B045_04
 */
public class PartitaTennis {



    public static void main(String[] args) {

        // Creazione dei due giocatori

        Giocatore giocatore1 = new Giocatore("Giocatore 1");

        Giocatore giocatore2 = new Giocatore("Giocatore 2");



        // Creazione dei thread

        Thread t1 = new Thread(giocatore1);

        Thread t2 = new Thread(giocatore2);



        // Avvio dei thread

        t1.start();

        t2.start();

    }

}



