/**
 * Authors: Salvatore Antonio Addimando, Sergiu Florea
 *
 * Language: Java
 *
 * Program scope: This program can be helpful for students who cannot understand very well chemistry
 *
 * Development years: 2017/2018
 *
 * @Copyright Copyright (c) 2018 All rights reserved.
 */

package package1;

import org.jetbrains.annotations.Contract;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Date;

/**
 * Java Main Class: Creatore
 *
 * Developed by: Salvatore Antonio Addimando
 */
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
        collegamento.put(Tavola.getIdrogeno().getN(), Tavola.getIdrogeno());
        collegamento.put(Tavola.getElio().getN(), Tavola.getElio());
        collegamento.put(Tavola.getLitio().getN(), Tavola.getLitio());
        collegamento.put(Tavola.getBerillio().getN(), Tavola.getBerillio());
        collegamento.put(Tavola.getBoro().getN(), Tavola.getBoro());
        collegamento.put(Tavola.getCarbonio().getN(), Tavola.getCarbonio());
        collegamento.put(Tavola.getAzoto().getN(), Tavola.getAzoto());
        collegamento.put(Tavola.getOssigeno().getN(), Tavola.getOssigeno());
        collegamento.put(Tavola.getFluoro().getN(), Tavola.getFluoro());
        collegamento.put(Tavola.getNeon().getN(), Tavola.getNeon());
        collegamento.put(Tavola.getSodio().getN(), Tavola.getSodio());
        collegamento.put(Tavola.getMagnesio().getN(), Tavola.getMagnesio());
        collegamento.put(Tavola.getAlluminio().getN(), Tavola.getAlluminio());
        collegamento.put(Tavola.getSilicio().getN(), Tavola.getSilicio());
        collegamento.put(Tavola.getFosforo().getN(), Tavola.getFosforo());
        collegamento.put(Tavola.getZolfo().getN(), Tavola.getZolfo());
        collegamento.put(Tavola.getCloro().getN(), Tavola.getCloro());
        collegamento.put(Tavola.getArgon().getN(), Tavola.getArgon());
        collegamento.put(Tavola.getPotassio().getN(), Tavola.getPotassio());
        collegamento.put(Tavola.getCalcio().getN(), Tavola.getCalcio());
        collegamento.put(Tavola.getScandio().getN(), Tavola.getScandio());
        collegamento.put(Tavola.getTitanio().getN(), Tavola.getTitanio());
        collegamento.put(Tavola.getVanadio().getN(), Tavola.getVanadio());
        collegamento.put(Tavola.getCromo().getN(), Tavola.getCromo());
        collegamento.put(Tavola.getManganese().getN(), Tavola.getManganese());
        collegamento.put(Tavola.getFerro().getN(), Tavola.getFerro());
        collegamento.put(Tavola.getCobalto().getN(), Tavola.getCobalto());
        collegamento.put(Tavola.getNichel().getN(), Tavola.getNichel());
        collegamento.put(Tavola.getRame().getN(), Tavola.getRame());
        collegamento.put(Tavola.getZinco().getN(), Tavola.getZinco());
        collegamento.put(Tavola.getGallio().getN(), Tavola.getGallio());
        collegamento.put(Tavola.getGermanio().getN(), Tavola.getGermanio());
        collegamento.put(Tavola.getArsenico().getN(), Tavola.getArsenico());
        collegamento.put(Tavola.getSelenio().getN(), Tavola.getSelenio());
        collegamento.put(Tavola.getBromo().getN(), Tavola.getBromo());
        collegamento.put(Tavola.getKripton().getN(), Tavola.getKripton());
        collegamento.put(Tavola.getRubidio().getN(), Tavola.getRubidio());
        collegamento.put(Tavola.getStronzio().getN(), Tavola.getStronzio());
        collegamento.put(Tavola.getIttrio().getN(), Tavola.getIttrio());
        collegamento.put(Tavola.getZirconio().getN(), Tavola.getZirconio());
        collegamento.put(Tavola.getNiobio().getN(), Tavola.getNiobio());
        collegamento.put(Tavola.getMolibdeno().getN(), Tavola.getMolibdeno());
        collegamento.put(Tavola.getTecnezio().getN(), Tavola.getTecnezio());
        collegamento.put(Tavola.getRutenio().getN(), Tavola.getRutenio());
        collegamento.put(Tavola.getRodio().getN(), Tavola.getRodio());
        collegamento.put(Tavola.getPalladio().getN(), Tavola.getPalladio());
        collegamento.put(Tavola.getArgento().getN(), Tavola.getArgento());
        collegamento.put(Tavola.getCadmio().getN(), Tavola.getCadmio());
        collegamento.put(Tavola.getIndio().getN(), Tavola.getIndio());
        collegamento.put(Tavola.getStagno().getN(), Tavola.getStagno());
        collegamento.put(Tavola.getAntimonio().getN(), Tavola.getAntimonio());
        collegamento.put(Tavola.getTellurio().getN(), Tavola.getTellurio());
        collegamento.put(Tavola.getIodio().getN(), Tavola.getIodio());
        collegamento.put(Tavola.getXeno().getN(), Tavola.getXeno());
        collegamento.put(Tavola.getCesio().getN(), Tavola.getCesio());
        collegamento.put(Tavola.getBario().getN(), Tavola.getBario());
        collegamento.put(Tavola.getLantanio().getN(), Tavola.getLantanio());
        collegamento.put(Tavola.getCerio().getN(), Tavola.getCerio());
        collegamento.put(Tavola.getPraseodimio().getN(), Tavola.getPraseodimio());
        collegamento.put(Tavola.getNeodimio().getN(), Tavola.getNeodimio());
        collegamento.put(Tavola.getPromezio().getN(), Tavola.getPromezio());
        collegamento.put(Tavola.getSamario().getN(), Tavola.getSamario());
        collegamento.put(Tavola.getEuropio().getN(), Tavola.getEuropio());
        collegamento.put(Tavola.getGadolinio().getN(), Tavola.getGadolinio());
        collegamento.put(Tavola.getTerbio().getN(), Tavola.getTerbio());
        collegamento.put(Tavola.getDisprosio().getN(), Tavola.getDisprosio());
        collegamento.put(Tavola.getOlmio().getN(), Tavola.getOlmio());
        collegamento.put(Tavola.getErbio().getN(), Tavola.getErbio());
        collegamento.put(Tavola.getTulio().getN(), Tavola.getTulio());
        collegamento.put(Tavola.getItterbio().getN(), Tavola.getItterbio());
        collegamento.put(Tavola.getLutezio().getN(), Tavola.getLutezio());
        collegamento.put(Tavola.getAfnio().getN(), Tavola.getAfnio());
        collegamento.put(Tavola.getTantalio().getN(), Tavola.getTantalio());
        collegamento.put(Tavola.getTungsteno().getN(), Tavola.getTungsteno());
        collegamento.put(Tavola.getRenio().getN(), Tavola.getRenio());
        collegamento.put(Tavola.getOsmio().getN(), Tavola.getOsmio());
        collegamento.put(Tavola.getIridio().getN(), Tavola.getIridio());
        collegamento.put(Tavola.getPlatino().getN(), Tavola.getPlatino());
        collegamento.put(Tavola.getOro().getN(), Tavola.getOro());
        collegamento.put(Tavola.getMercurio().getN(), Tavola.getMercurio());
        collegamento.put(Tavola.getTallio().getN(), Tavola.getTallio());
        collegamento.put(Tavola.getPiombo().getN(), Tavola.getPiombo());
        collegamento.put(Tavola.getBismuto().getN(), Tavola.getBismuto());
        collegamento.put(Tavola.getPolonio().getN(), Tavola.getPolonio());
        collegamento.put(Tavola.getAstato().getN(), Tavola.getAstato());
        collegamento.put(Tavola.getRadon().getN(), Tavola.getRadon());
        collegamento.put(Tavola.getFrancio().getN(), Tavola.getFrancio());
        collegamento.put(Tavola.getRadio().getN(), Tavola.getRadio());
        collegamento.put(Tavola.getAttinio().getN(), Tavola.getAttinio());
        collegamento.put(Tavola.getTorio().getN(), Tavola.getTorio());
        collegamento.put(Tavola.getProtoattinio().getN(), Tavola.getProtoattinio());
        collegamento.put(Tavola.getUranio().getN(), Tavola.getUranio());
        collegamento.put(Tavola.getNettunio().getN(), Tavola.getNettunio());
        collegamento.put(Tavola.getPlutonio().getN(), Tavola.getPlutonio());
        collegamento.put(Tavola.getAmericio().getN(), Tavola.getAmericio());
        collegamento.put(Tavola.getCurio().getN(), Tavola.getCurio());
        collegamento.put(Tavola.getBerchelio().getN(), Tavola.getBerchelio());
        collegamento.put(Tavola.getCalifornio().getN(), Tavola.getCalifornio());
        collegamento.put(Tavola.getEinsteinio().getN(), Tavola.getEinsteinio());
        collegamento.put(Tavola.getFermio().getN(), Tavola.getFermio());
        collegamento.put(Tavola.getMendelevio().getN(), Tavola.getMendelevio());
        collegamento.put(Tavola.getNobelio().getN(), Tavola.getNobelio());
        collegamento.put(Tavola.getLaurenzio().getN(), Tavola.getLaurenzio());


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
                            System.err.println(Nomenclatura.getMessage1());
                        }else if(pass){
                            if(Qelementi == 2){
                                //COMPOSTI BINARI
                                rielabora2(FormulaComposto);

                                if(collegamento.containsKey(simbolo1) && collegamento.containsKey(simbolo2)){
                                    NomeComposto = getNomeComposto2(collegamento.get(simbolo1), collegamento.get(simbolo2), quantita1, quantita2);
                                }else{
                                    System.err.println(Nomenclatura.getMessage3());
                                }

                            }else if(Qelementi == 3){
                                //COMPOSTI TERNARI
                                rielabora3(FormulaComposto);

                                if(collegamento.containsKey(simbolo1) && collegamento.containsKey(simbolo2) && collegamento.containsKey(simbolo3)){
                                    NomeComposto = getNomeComposto3(collegamento.get(simbolo1), collegamento.get(simbolo2), collegamento.get(simbolo3), quantita1, quantita2, quantita3, quantitaI);
                                }else{
                                    System.err.println(Nomenclatura.getMessage3());
                                }
                            }else if(Qelementi == 4){
                                //COMPOSTI QUATERNARI
                                rielabora4(FormulaComposto);
                                //IMPLEMENTARE
                            }else{
                                System.err.println(Nomenclatura.getMessage3());
                            }
                        }else{
                            System.err.println(Nomenclatura.getMessage3());
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
            System.err.println(Nomenclatura.getMessage3());
        }else if(simbolo2.length() > 2){
            System.err.println(Nomenclatura.getMessage3());
        }else if(simbolo3.length() > 2){
            System.err.println(Nomenclatura.getMessage3());
        }else if(simbolo4.length() > 2){
            System.err.println(Nomenclatura.getMessage3());
        }
    }

    private static void getSimbolo4(String FormulaComposto){
        //IMPLEMENTARE
    }

    /**
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
     * @param FormulaComposto
     * @return true if FormulaComposto is a number
     */
    @Contract(pure = true)
    private static boolean isInt(char FormulaComposto){
        return FormulaComposto == '0' || FormulaComposto == '1' || FormulaComposto == '2' || FormulaComposto == '3' || FormulaComposto == '4' || FormulaComposto == '5' || FormulaComposto == '6' || FormulaComposto == '7' || FormulaComposto == '8' || FormulaComposto == '9';
    }
}