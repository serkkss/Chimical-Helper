/**
 * Authors: Salvatore Antonio Addimando, Sergiu Florea
 *
 * Language: Java
 *
 * Program scope: This program can be helpful for students who cannot understand very well chemistry
 *
 * Development years: 2017/2018
 *
 * @Copyrights All rights reserved.
 */

/**
 * Java Main Class: Creatore
 *
 * Developed by: Salvatore Antonio Addimando
 */
package package1;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Date;

class Creatore extends Nomenclatura{

    private static String simbolo1 = "";
    private static String simbolo2 = "";
    private static String simbolo3 = "";
    private static String simbolo4 = "";
    private static int quantita1 = 0;
    private static int quantita2 = 0;
    private static int quantita3 = 0;
    private static int quantita4 = 0;
    private static int quantitaI = 0;
    private static int Qelementi = 0;

    private static void main(String[]args){
        HashMap<String, Elemento> collegamento = new HashMap<>(103);
        collegamento.put(Tavola.idrogeno.getN(), Tavola.idrogeno);
        collegamento.put(Tavola.elio.getN(), Tavola.elio);
        collegamento.put(Tavola.litio.getN(), Tavola.litio);
        collegamento.put(Tavola.berillio.getN(), Tavola.berillio);
        collegamento.put(Tavola.boro.getN(), Tavola.boro);
        collegamento.put(Tavola.carbonio.getN(), Tavola.carbonio);
        collegamento.put(Tavola.azoto.getN(), Tavola.azoto);
        collegamento.put(Tavola.ossigeno.getN(), Tavola.ossigeno);
        collegamento.put(Tavola.fluoro.getN(), Tavola.fluoro);
        collegamento.put(Tavola.neon.getN(), Tavola.neon);
        collegamento.put(Tavola.sodio.getN(), Tavola.sodio);
        collegamento.put(Tavola.magnesio.getN(), Tavola.magnesio);
        collegamento.put(Tavola.alluminio.getN(), Tavola.alluminio);
        collegamento.put(Tavola.silicio.getN(), Tavola.silicio);
        collegamento.put(Tavola.fosforo.getN(), Tavola.fosforo);
        collegamento.put(Tavola.zolfo.getN(), Tavola.zolfo);
        collegamento.put(Tavola.cloro.getN(), Tavola.cloro);
        collegamento.put(Tavola.argon.getN(), Tavola.argon);
        collegamento.put(Tavola.potassio.getN(), Tavola.potassio);
        collegamento.put(Tavola.calcio.getN(), Tavola.calcio);
        collegamento.put(Tavola.scandio.getN(), Tavola.scandio);
        collegamento.put(Tavola.titanio.getN(), Tavola.titanio);
        collegamento.put(Tavola.vanadio.getN(), Tavola.vanadio);
        collegamento.put(Tavola.cromo.getN(), Tavola.cromo);
        collegamento.put(Tavola.manganese.getN(), Tavola.manganese);
        collegamento.put(Tavola.ferro.getN(), Tavola.ferro);
        collegamento.put(Tavola.cobalto.getN(), Tavola.cobalto);
        collegamento.put(Tavola.nichel.getN(), Tavola.nichel);
        collegamento.put(Tavola.rame.getN(), Tavola.rame);
        collegamento.put(Tavola.zinco.getN(), Tavola.zinco);
        collegamento.put(Tavola.gallio.getN(), Tavola.gallio);
        collegamento.put(Tavola.germanio.getN(), Tavola.germanio);
        collegamento.put(Tavola.arsenico.getN(), Tavola.arsenico);
        collegamento.put(Tavola.selenio.getN(), Tavola.selenio);
        collegamento.put(Tavola.bromo.getN(), Tavola.bromo);
        collegamento.put(Tavola.kripton.getN(), Tavola.kripton);
        collegamento.put(Tavola.rubidio.getN(), Tavola.rubidio);
        collegamento.put(Tavola.stronzio.getN(), Tavola.stronzio);
        collegamento.put(Tavola.ittrio.getN(), Tavola.ittrio);
        collegamento.put(Tavola.zirconio.getN(), Tavola.zirconio);
        collegamento.put(Tavola.niobio.getN(), Tavola.niobio);
        collegamento.put(Tavola.molibdeno.getN(), Tavola.molibdeno);
        collegamento.put(Tavola.tecnezio.getN(), Tavola.tecnezio);
        collegamento.put(Tavola.rutenio.getN(), Tavola.rutenio);
        collegamento.put(Tavola.rodio.getN(), Tavola.rodio);
        collegamento.put(Tavola.palladio.getN(), Tavola.palladio);
        collegamento.put(Tavola.argento.getN(), Tavola.argento);
        collegamento.put(Tavola.cadmio.getN(), Tavola.cadmio);
        collegamento.put(Tavola.indio.getN(), Tavola.indio);
        collegamento.put(Tavola.stagno.getN(), Tavola.stagno);
        collegamento.put(Tavola.antimonio.getN(), Tavola.antimonio);
        collegamento.put(Tavola.tellurio.getN(), Tavola.tellurio);
        collegamento.put(Tavola.iodio.getN(), Tavola.iodio);
        collegamento.put(Tavola.xeno.getN(), Tavola.xeno);
        collegamento.put(Tavola.cesio.getN(), Tavola.cesio);
        collegamento.put(Tavola.bario.getN(), Tavola.bario);
        collegamento.put(Tavola.lantanio.getN(), Tavola.lantanio);
        collegamento.put(Tavola.cerio.getN(), Tavola.cerio);
        collegamento.put(Tavola.praseodimio.getN(), Tavola.praseodimio);
        collegamento.put(Tavola.neodimio.getN(), Tavola.neodimio);
        collegamento.put(Tavola.promezio.getN(), Tavola.promezio);
        collegamento.put(Tavola.samario.getN(), Tavola.samario);
        collegamento.put(Tavola.europio.getN(), Tavola.europio);
        collegamento.put(Tavola.gadolinio.getN(), Tavola.gadolinio);
        collegamento.put(Tavola.terbio.getN(), Tavola.terbio);
        collegamento.put(Tavola.disprosio.getN(), Tavola.disprosio);
        collegamento.put(Tavola.olmio.getN(), Tavola.olmio);
        collegamento.put(Tavola.erbio.getN(), Tavola.erbio);
        collegamento.put(Tavola.tulio.getN(), Tavola.tulio);
        collegamento.put(Tavola.itterbio.getN(), Tavola.itterbio);
        collegamento.put(Tavola.lutezio.getN(), Tavola.lutezio);
        collegamento.put(Tavola.afnio.getN(), Tavola.afnio);
        collegamento.put(Tavola.tantalio.getN(), Tavola.tantalio);
        collegamento.put(Tavola.tungsteno.getN(), Tavola.tungsteno);
        collegamento.put(Tavola.renio.getN(), Tavola.renio);
        collegamento.put(Tavola.osmio.getN(), Tavola.osmio);
        collegamento.put(Tavola.iridio.getN(), Tavola.iridio);
        collegamento.put(Tavola.platino.getN(), Tavola.platino);
        collegamento.put(Tavola.oro.getN(), Tavola.oro);
        collegamento.put(Tavola.mercurio.getN(), Tavola.mercurio);
        collegamento.put(Tavola.tallio.getN(), Tavola.tallio);
        collegamento.put(Tavola.piombo.getN(), Tavola.piombo);
        collegamento.put(Tavola.bismuto.getN(), Tavola.bismuto);
        collegamento.put(Tavola.polonio.getN(), Tavola.polonio);
        collegamento.put(Tavola.astato.getN(), Tavola.astato);
        collegamento.put(Tavola.radon.getN(), Tavola.radon);
        collegamento.put(Tavola.francio.getN(), Tavola.francio);
        collegamento.put(Tavola.radio.getN(), Tavola.radio);
        collegamento.put(Tavola.attinio.getN(), Tavola.attinio);
        collegamento.put(Tavola.torio.getN(), Tavola.torio);
        collegamento.put(Tavola.protoattinio.getN(), Tavola.protoattinio);
        collegamento.put(Tavola.uranio.getN(), Tavola.uranio);
        collegamento.put(Tavola.nettunio.getN(), Tavola.nettunio);
        collegamento.put(Tavola.plutonio.getN(), Tavola.plutonio);
        collegamento.put(Tavola.americio.getN(), Tavola.americio);
        collegamento.put(Tavola.curio.getN(), Tavola.curio);
        collegamento.put(Tavola.berchelio.getN(), Tavola.berchelio);
        collegamento.put(Tavola.californio.getN(), Tavola.californio);
        collegamento.put(Tavola.einsteinio.getN(), Tavola.einsteinio);
        collegamento.put(Tavola.fermio.getN(), Tavola.fermio);
        collegamento.put(Tavola.mendelevio.getN(), Tavola.mendelevio);
        collegamento.put(Tavola.nobelio.getN(), Tavola.nobelio);
        collegamento.put(Tavola.laurenzio.getN(), Tavola.laurenzio);


        Scanner scan = new Scanner(System.in);
        int year = 2017;
        int month = 11;
        int day = 3;
        Calendar scadenza = Calendar.getInstance();
        scadenza.set(year, month, day);
        int codiceAccesso;

        while(true){
            Date GiornoCorrente = GregorianCalendar.getInstance().getTime();

            if(GiornoCorrente.compareTo(scadenza.getTime()) < 0){
                String FormulaComposto;
                String NomeComposto = "";
                int scelta = 0;
                System.out.println("Premere 1 per ottenere la nomenclatura tradizionale di un composto (Si prega di specificare anche le quantita' pari ad 1)\nPremere 2 per uscire dal programma\nFai una scelta: ");
                scelta = scan.nextInt();

                switch(scelta){
                    case 1:
                        System.out.println("Inserire la formula del composto: ");
                        FormulaComposto = scan.next();
                        boolean pass = false;

                        if(Character.isUpperCase(FormulaComposto.charAt(0))){
                            pass = true;
                        }

                        for(int i = 0; i < FormulaComposto.length(); i++){
                            if(Character.isUpperCase(FormulaComposto.charAt(i)) && !(FormulaComposto.charAt(i) == '(') && !(FormulaComposto.charAt(i) == ')')){
                                Qelementi++;
                            }
                        }

                        if(!(Qelementi >= 2 && Qelementi <= 4)){
                            System.err.println(Nomenclatura.message1);
                        }else if(pass){
                            if(Qelementi == 2){
                                //COMPOSTI BINARI
                                rielabora2(FormulaComposto);

                                if(collegamento.containsKey(simbolo1) && collegamento.containsKey(simbolo2)){
                                    NomeComposto = getNomeComposto2(collegamento.get(simbolo1), collegamento.get(simbolo2), quantita1, quantita2);
                                }else{
                                    System.err.println(Nomenclatura.message3);
                                }

                            }else if(Qelementi == 3){
                                //COMPOSTI TERNARI
                                rielabora3(FormulaComposto);

                                if(collegamento.containsKey(simbolo1) && collegamento.containsKey(simbolo2) && collegamento.containsKey(simbolo3)){
                                    NomeComposto = getNomeComposto3(collegamento.get(simbolo1), collegamento.get(simbolo2), collegamento.get(simbolo3), quantita1, quantita2, quantita3, quantitaI);
                                }else{
                                    System.err.println(Nomenclatura.message3);
                                }
                            }else if(Qelementi == 4){
                                //COMPOSTI QUATERNARI
                                rielabora4(FormulaComposto);
                                //IMPLEMENTARE
                            }else{
                                System.err.println(Nomenclatura.message3);
                            }
                        }else{
                            System.err.println(Nomenclatura.message3);
                        }
                        break;
                    case 2:
                        System.out.println("\nGrazie per aver utilizzato il software prodotto da Salvatore Addimando e Sergiu Florea\n\n@Copyright: Tutti i diritti riservati.");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Fare una delle scelte proposte\n");
                }

                System.out.println("\n" + NomeComposto + "\n");
                simbolo1 = "";
                simbolo2 = "";
                simbolo3 = "";
                simbolo4 = "";
                quantita1 = 0;
                quantita2 = 0;
                quantita3 = 0;
                quantita4 = 0;
                quantitaI = 0;
                Qelementi = 0;
            }else{
                System.out.println("Inserire uno dei codici di accesso: ");
                codiceAccesso = scan.nextInt();
                if(codiceAccesso == 31122017){              //MIGLIORARE
                    scadenza.add(Calendar.MONTH, 1);
                }
            }
        }
    }

    /**
     * @param FormulaComposto
     */
    private static void rielabora2(String FormulaComposto) {
        getSimbolo2(FormulaComposto);
        getQuantita2(FormulaComposto);
    }

    /**
     * @param FormulaComposto
     */
    private static void rielabora3(String FormulaComposto) {
        if(!FormulaComposto.contains("(")){
            getSimbolo2(FormulaComposto);
            getQuantita2(FormulaComposto);
        }else{
            getSimbolo3(FormulaComposto);
            getQuantita3(FormulaComposto);
        }
    }

    private static void rielabora4(String FormulaComposto) {
        //Implementare utilizzando le funzioni getSimbolo4 e getQuantita4
    }

    /**
     * @param FormulaComposto
     */
    private static void getSimbolo2(String FormulaComposto) {
        int numeriT = 0;
        for(int i = 1; i < FormulaComposto.length(); i++){
            if(isInt(FormulaComposto.charAt(i))){
                if(simbolo1 == ""){
                    simbolo1 = FormulaComposto.substring(0, i);
                }else if(simbolo2 == ""){
                    simbolo2 = FormulaComposto.substring(numeriT + 1, i);
                }else if(simbolo3 == ""){
                    simbolo3 = FormulaComposto.substring(numeriT + 1, i);
                }else if(simbolo4 == ""){
                    simbolo4 = FormulaComposto.substring(numeriT + 1, i);
                }
                numeriT = i;
            }
        }
    }

    /**
     * @param FormulaComposto
     */
    private static void getSimbolo3(String FormulaComposto) {
        int parentesiT = 0;
        int numeroT = 0;
        for(int i = 1; i < FormulaComposto.length(); i++){
            if(Creatore.isInt(FormulaComposto.charAt(i))){
                if(simbolo1 == ""){
                    simbolo1 = FormulaComposto.substring(0, i);
                }else if(simbolo2 == ""){
                    simbolo2 = FormulaComposto.substring(parentesiT + 1, i);
                }else if(simbolo3 == ""){
                    simbolo3 = FormulaComposto.substring(numeroT + 1, i);
                }else if(simbolo4 == ""){
                    simbolo4 = FormulaComposto.substring(numeroT + 1, i);
                }
                numeroT = i;
            }else if(FormulaComposto.charAt(i) == '('){
                parentesiT = i;
            }
        }

        if(simbolo1.length() > 2){
            System.err.println(Nomenclatura.message3);
        }else if(simbolo2.length() > 2){
            System.err.println(Nomenclatura.message3);
        }else if(simbolo3.length() > 2){
            System.err.println(Nomenclatura.message3);
        }else if(simbolo4.length() > 2){
            System.err.println(Nomenclatura.message3);
        }
    }

    private static void getSimbolo4(String FormulaComposto){
        //IMPLEMENTARE
    }

    /**
     *
     * @param FormulaComposto
     */
    private static void getQuantita2(String FormulaComposto){
        if(simbolo1.length() == 1 && isInt(FormulaComposto.charAt(1))){
            quantita1 = FormulaComposto.charAt(1) - 48;
            if(simbolo2.length() == 1 && isInt(FormulaComposto.charAt(3))){
                quantita2 = FormulaComposto.charAt(3) - 48;
                if(Qelementi >= 3){
                    if(simbolo3.length() == 1 && isInt(FormulaComposto.charAt(5))){
                        quantita3 = FormulaComposto.charAt(5) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(7))){
                                quantita4 = FormulaComposto.charAt(7) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(8))){
                                quantita4 = FormulaComposto.charAt(8) - 48;
                            }
                        }
                    }else if(simbolo3.length() == 2 && isInt(FormulaComposto.charAt(6))){
                        quantita3 = FormulaComposto.charAt(6) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(8))){
                                quantita4 = FormulaComposto.charAt(8) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }
                        }
                    }
                }
            }else if(simbolo2.length() == 2 && isInt(FormulaComposto.charAt(4))){
                quantita2 = FormulaComposto.charAt(4) - 48;
                if(Qelementi >= 3){
                    if(simbolo3.length() == 1 && isInt(FormulaComposto.charAt(6))){
                        quantita3 = FormulaComposto.charAt(6) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(8))){
                                quantita4 = FormulaComposto.charAt(8) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }
                        }
                    }else if(simbolo3.length() == 2 && isInt(FormulaComposto.charAt(7))){
                        quantita3 = FormulaComposto.charAt(7) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(10))){
                                quantita4 = FormulaComposto.charAt(10) - 48;
                            }
                        }
                    }
                }
            }
        }else if(simbolo1.length() == 2 && isInt(FormulaComposto.charAt(2))){
            quantita1 = FormulaComposto.charAt(2) - 48;
            if(simbolo2.length() == 1 && isInt(FormulaComposto.charAt(4))){
                quantita2 = FormulaComposto.charAt(4) - 48;
                if(Qelementi >= 3){
                    if(simbolo3.length() == 1 && isInt(FormulaComposto.charAt(6))){
                        quantita3 = FormulaComposto.charAt(6) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(8))){
                                quantita4 = FormulaComposto.charAt(8) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }
                        }
                    }else if(simbolo3.length() == 2 && isInt(FormulaComposto.charAt(7))){
                        quantita3 = FormulaComposto.charAt(7) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(10))){
                                quantita4 = FormulaComposto.charAt(10) - 48;
                            }
                        }
                    }
                }
            }else if(simbolo2.length() == 2 && isInt(FormulaComposto.charAt(5))){
                quantita2 = FormulaComposto.charAt(5) - 48;
                if(Qelementi >= 3){
                    if(simbolo3.length() == 1 && isInt(FormulaComposto.charAt(7))){
                        quantita3 = FormulaComposto.charAt(7) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(9))){
                                quantita4 = FormulaComposto.charAt(9) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(10))){
                                quantita4 = FormulaComposto.charAt(10) - 48;
                            }
                        }
                    }else if(simbolo3.length() == 2 && isInt(FormulaComposto.charAt(8))){
                        quantita3 = FormulaComposto.charAt(8) - 48;
                        if(Qelementi == 4){
                            if(simbolo4.length() == 1 && isInt(FormulaComposto.charAt(10))){
                                quantita4 = FormulaComposto.charAt(10) - 48;
                            }else if(simbolo4.length() == 2 && isInt(FormulaComposto.charAt(11))){
                                quantita4 = FormulaComposto.charAt(11) - 48;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * @param FormulaComposto
     */
    private static void getQuantita3(String FormulaComposto){
        for(int i = 0; i < FormulaComposto.length(); i++){
            if(isInt(FormulaComposto.charAt(i))){
                quantita1 = FormulaComposto.charAt(i) - 48;
            }
        }

        quantitaI = FormulaComposto.charAt(FormulaComposto.length() - 1) - 48;
    }

    private static void getQuantita4(String FormulaComposto){
        //IMPLEMENTARE
    }

    /**
     *
     * @param FormulaComposto
     * @return true if FormulaComposto is a number
     */
    private static boolean isInt(char FormulaComposto){
        return FormulaComposto == '0' || FormulaComposto == '1' || FormulaComposto == '2' || FormulaComposto == '3' || FormulaComposto == '4' || FormulaComposto == '5' || FormulaComposto == '6' || FormulaComposto == '7' || FormulaComposto == '8' || FormulaComposto == '9';
    }
}