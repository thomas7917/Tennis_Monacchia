/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author B045_04
 */
class Giocatore implements Runnable {

    private String nome;

    private static int puntiGiocatore1 = 0;

    private static int puntiGiocatore2 = 0;

    private static boolean partitaTerminata = false;

    private static int massimoPassaggi = 10;  // Numero massimo di passaggi

    private static int passaggiEffettuati = 0;



    // Costruttore che riceve il nome del giocatore

    public Giocatore(String nome) {

        this.nome = nome;

    }



    @Override

    public void run() {

        // Ciclo che continua fino alla fine della partita o al numero massimo di passaggi

        while (!partitaTerminata && passaggiEffettuati < massimoPassaggi) {

            giocaTurno();

            Thread.yield();  // Cede il controllo all'altro thread

            try {

                Thread.sleep(500);  // Simula il tempo di passaggio tra i giocatori (500ms)

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

        

        // Annuncio del vincitore una volta terminata la partita

        if (partitaTerminata) {

            System.out.println("La partita è terminata!");

        }

    }



    // Metodo che simula il turno di gioco

    private void giocaTurno() {

        if (!partitaTerminata) {

            passaggiEffettuati++;

            System.out.println(nome + " ha effettuato il passaggio numero " + passaggiEffettuati);



            // Logica per aumentare il punteggio del giocatore

            if (nome.equals("Giocatore 1")) {

                puntiGiocatore1++;

                System.out.println(nome + " ha fatto punto! (" + puntiGiocatore1 + ")");

                if (puntiGiocatore1 >= 5) {

                    partitaTerminata = true;

                    System.out.println(nome + " ha vinto la partita!");

                }

            } else {

                puntiGiocatore2++;

                System.out.println(nome + " ha fatto punto! (" + puntiGiocatore2 + ")");

                if (puntiGiocatore2 >= 5) {

                    partitaTerminata = true;

                    System.out.println(nome + " ha vinto la partita!");

                }

            }

        }

    }

}