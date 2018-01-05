/**
 * Java Methods Collection: Nomenclatura
 *
 * Developed by: Salvatore Antonio Addimando
 */

package package1;

/*
import java.util.HashMap;
import java.util.Map;
*/

public class Nomenclatura {

    static String message1 = new String("Exception: NoCompostoException\n\tMessage: Il composto non e' valido");
    static String message2 = new String("Exception: PiuMetalliException\n\tMessage: Sono stati inseriti troppi metalli.");
    static String message3 = new String("Exception: ImmissioneErrataException\n\tMessage: Inserimento Errato");

    /**
     *
     * @param a First element (Type: integer)
     * @param b Second element (Type: integer)
     * @param Na Quantity of the first one (Type: integer)
     * @param Nb Quantity of the second one (Type: integer)
     * @return The nomenclature of a binary compound (Type: String)
     */
    public static String getNomeComposto2(Elemento a, Elemento b, int Na, int Nb) {
        boolean pass = false;
        boolean pass2 = false;

        if(a.isMetallo() && b.isMetallo()){
            System.err.println(message2);
        }else if(!(a.isMetallo() && b.isMetallo())){
            if(a.getN() == "Mn"){
                if(b.getN() == "O" && Nb == 1){
                    return "Ossido manganoso";
                }else if(b.getN() == "O" && Na == 2 && Nb == 3){
                    return "Ossido manganico";
                }else if(b.getN() == "O" && Nb == 2){
                    return "Diossido di Manganese";
                }else if(b.getN() == "O" && Na == 1 && Nb == 3){
                    return "Anidride manganica";
                }else if(b.getN() == "O" && Na == 2 && Nb == 7){
                    return "Anidride permanganica";
                }else{
                    System.err.println(message1);
                }
            }

            if(a.getN() == "Cr"){
                if(b.getN() == "O" && Nb == 1){
                    return "Ossido di Cromo";
                }else if(b.getN() == "O" && Na == 2 && Nb == 3){
                    return "Triossido di dicromo";
                }else if(b.getN() == "O" && Na == 1 && Nb == 3){
                    return "Anidride cromica";
                }else{
                    System.err.println(message1);
                }
            }

            for(int i=0; i < b.getNOssid().length; i++){
                if(b.getNOssid()[i] < 0 && (Na == b.getNOssid()[i] * -1 || Na == b.getNOssid()[i] * -2)){
                    pass = true;
                }else if(b.getNOssid()[i] > 0 && (Na == b.getNOssid()[i] || Na == b.getNOssid()[i] * 2)){
                    pass = true;
                }
            }

            for(int i=0; i < a.getNOssid().length; i++){
                if(a.getNOssid()[i] < 0 && (Nb == a.getNOssid()[i] * -1 || Nb == a.getNOssid()[i] * -2)){
                    pass2 = true;
                }else if(a.getNOssid()[i] > 0 && (Nb == a.getNOssid()[i] || Nb == a.getNOssid()[i] * 2)){
                    pass2 = true;
                }
            }

            if(a.getNOssid() == null){
                pass = pass2 = true;
            }

            for(int i = 0; i < a.getNOssid().length; i++){
                for(int k = 0; k < b.getNOssid().length; k++){
                    if(a.getNOssid()[i] + b.getNOssid()[k] == 0){
                        pass = pass2 = true;
                    }
                }
            }

            if(pass && pass2){
                if(b.getN() == "O" && a.getN() == "S"){
                    if(Nb == 2){
                        return "Anidride solforosa";
                    }else if(Nb == 3){
                        return "Anidride solforica";
                    }else{
                        System.err.println(message1);
                    }
                }else if(b.getN() == "O" && a.getN() == "P"){
                    if(Na == 2 && Nb == 3){
                        return "Anidride fosforosa";
                    }else if(Na == 2 && Nb == 5){
                        return "Anidride fosforica";
                    }else{
                        System.err.println(message1);
                    }
                }else if(b.getN() == "O" && Nb != 2){
                    if(a.isMetallo()){
                        if(a.getNOssid().length == 1){
                            return "Ossido di " + a.getNomeElemento();
                        }else if(Nb > a.getNOssid()[0] || Nb > a.getNOssid()[1]){
                            return "Ossido " + a.getRadice() + "ico";
                        }else{
                            return "Ossido " + a.getRadice() + "oso";
                        }
                    }else{
                        if(a.getNOssid().length == 1){
                            return "Anidride " + a.getRadice() + "ica";
                        }else if(a.getNOssid().length == 2){
                            if(Nb > a.getNOssid()[0] || Nb > a.getNOssid()[1]){
                                return "Anidride " + a.getRadice() + "ica";
                            }else{
                                return "Anidride " + a.getRadice() + "osa";
                            }
                        }else if(a.getNOssid().length >= 3){
                            if(Nb == 1){
                                return "Anidride ipo" + a.getRadice() + "osa";
                            }else if(Nb == 3){
                                return "Anidride " + a.getRadice() + "osa";
                            }else if(Nb == 5){
                                return "Anidride " + a.getRadice() + "ica";
                            }else{
                                return "Anidride per" + a.getRadice() + "ica";
                            }
                        }
                    }
                }else if(b.getN() == "O" && Nb == 2){
                    return "Perossido di " + a.getNomeElemento();
                }else if(b.getN() == "H"){
                    if(Nb == 4){
                        return "Tetraidruro di " + a.getNomeElemento();
                    }else{
                        return "Idruro di " + a.getNomeElemento();
                    }
                }else if(a.getN() == "H" && !b.isMetallo()){
                    return "Acido " + b.getRadice() + "idrico";
                }else if(a.isMetallo() && !b.isMetallo()){
                    if(a.getNOssid().length == 1){
                        return b.getRadice() + "uro di " + a.getNomeElemento();
                    }else if(a.getNOssid().length == 2){
                        if(Nb > a.getNOssid()[0] || Nb > a.getNOssid()[1]){
                            return b.getRadice() + "uro" + a.getRadice() + "ico";
                        }else{
                            return b.getRadice() + "uro" + a.getRadice() + "oso";
                        }
                    }else{
                        System.err.println(message1);
                    }
                }
            }else{
                System.err.println(message1);
            }
        }else{
            System.err.println(message1);
        }
        return null;
    }

	/*
	public static String getFormulaComposto2(String nome_composto){
		 Map<String, String> ossidi = new HashMap<String, String>(100);

		 ossidi.put(Creatore.litio.getNomeElemento(), "Li2O");

		 if(ossidi.containsKey(nome_composto)){
			 return ossidi.get("");
		 }
	}
	*/

    /**
     *
     * @param a First element (Type: integer)
     * @param b Second element (Type: integer)
     * @param c Third element (Type: integer)
     * @param Na Quantity of the first one (Type: integer)
     * @param Nb Quantity of the second one (Type: integer)
     * @param Nc Quantity of the third one (Type: integer)
     * @param NIone If there is an Ion determine its quantity (Type: integer)
     * @return The nomenclature of a ternary compound (Type: String)
     */
    public static String getNomeComposto3(Elemento a, Elemento b, Elemento c, int Na, int Nb, int Nc, int NIone){
        if(Nb != 0 && NIone != 0 || Nc != 0 && NIone != 0){
            System.err.println(message3);
        }else if(a.isMetallo() && b.isMetallo() || b.isMetallo() && c.isMetallo() || a.isMetallo() && c.isMetallo()){
            System.err.println(message2);
        }else if(a.getN() == "Cr" || b.getN() == "Cr"){
            if(a.getN() == "H" && b.getN() == "Cr" && c.getN() == "O"){
                if(Na == 2 && Nb == 1 && Nc == 4){
                    return "Acido Cromico";
                }else if(Na == 2 && Nb == 2 && Nc == 7){
                    return "Acido diCromico";
                }else{
                    System.err.println(message1);
                }
            }else if(a.getN() == "Cr" && b.getN() == "O" && c.getN() == "H" && Na == 1 && NIone == 3){
                return "Idrossido di Cromo (III)";
            }else{
                System.err.println(message1);
            }
        }else if(a.getN() == "Mn" || b.getN() == "Mn"){
            if(a.getN() == "H" && b.getN() == "Mn" && c.getN() == "O"){
                if(Na == 2 && Nb == 1 && Nc == 4){
                    return "Acido Manganico";
                }else if(Na == 1 && Nb == 1 && Nc == 4){
                    return "Acido perManganico";
                }else{
                    System.err.println(message1);
                }
            }else if(a.getN() == "Mn" && b.getN() == "O" && c.getN() == "H"){
                if(Na == 1 && NIone == 2){
                    return "Idrossido Manganoso";
                }else if(Na == 1 && NIone == 3){
                    return "Idrossido Manganico";
                }else{
                    System.err.println(message1);
                }
            }else{
                System.err.println(message1);
            }
        }else if(a.isMetallo() && b.getN() == "H" && c.getN() == "S"){
            if(a.getNOssid().length == 1){
                return "Solfuro acido di " + a.getNomeElemento();
            }else if(a.getNOssid().length == 2){
                if(NIone == a.getNOssid()[a.getNOssid().length - 1]){
                    return "Solfuro acido " + a.getRadice() + "ico";
                }else{
                    return "Solfuro acido " + a.getRadice() + "oso";
                }
            }else{
                System.err.println(message1);
            }
        }else if(a.getN() == "H" && b.getN() == "C" && c.getN() == "N"){
            return "Acido cianidrico";
        }else if(a.isMetallo() && b.getN() == "C" && c.getN() == "N"){
            return "Cianuro di " + a.getNomeElemento();
        }else if(a.isMetallo() && b.getN() == "O" && c.getN() == "H"){
            if(a.getNOssid().length == 1){
                return "Idrossido di " + a.getNomeElemento();
            }else if(a.getNOssid().length == 2){
                if(NIone == a.getNOssid()[a.getNOssid().length - 1]){
                    return "Idrossido " + a.getRadice() + "ico";
                }else{
                    return "Idrossido " + a.getRadice() + "oso";
                }
            }else{
                System.err.println(message1);
            }
        }else if(a.getN() == "H" && !b.isMetallo() && c.getN() == "O"){
            int Nx =-((-2*Nc) + Na)/Nb;

            if(b.getN() == "P"){
                if(Nx == 1){
                    return "Acido ipofosforoso";
                }else if(Nx == 3){
                    return "Acido fosforoso";
                }else if(Nx == 5){
                    return "Acido fosforico";
                }else if(Nx == 7){
                    return "Acido perfosforico";
                }else{
                    System.err.println(message1);
                }
            }else if(b.getN() == "S"){
                if(Na == 2 && Nb == 1 && Nc == 3){
                    return "Acido solforoso";
                }else if(Na == 2 && Nb == 1 &&  Nc == 4){
                    return "Acido solforico";
                }else{
                    System.err.println(message1);
                }
            }else if(b.getNOssid().length == 1){
                return "Acido " + b.getRadice() + "ico";
            }else if(b.getNOssid().length == 2){
                if(Nx > 3){
                    return "Acido " + b.getRadice() + "ico";
                }else{
                    return "Acido " + b.getRadice() + "oso";
                }
            }else if(b.getNOssid().length >= 3){
                if(Nx == 1){                                      //QUI
                    return "Acido ipo" + b.getRadice() + "oso";
                }else if(Nx == 3){
                    return "Acido " + b.getRadice() + "oso";
                }else if(Nx == 5){
                    return "Acido " + b.getRadice() + "ico";
                }else if(Nx == 7){
                    return "Acido per" + b.getRadice() + "ico";
                }else{
                    System.err.println(message1);
                }
            }
        }else if(a.isMetallo() && !b.isMetallo() && c.getN() == "O"){
            int Nx = (2*Nc - 1)/Nb;
            int Ny = (Nb*Nx - 2*Nc) * NIone;
            int positionX = 0;
            int positionY = 0;

            for(int i = 0; i < b.getNOssid().length; i++){
                if(b.getNOssid()[i] >= 0){
                    positionX = i;
                    break;
                }
            }

            for(int i = 0; i < a.getNOssid().length; i++){
                if(a.getNOssid()[i] >= 0){
                    positionY = i;
                    break;
                }
            }

            if(Nx == b.getNOssid()[b.getNOssid().length - 1]){
                if(a.getNOssid().length == 1){
                    return b.getRadice() + "ato di " + a.getNomeElemento();
                }else if(a.getNOssid().length == 2){
                    if(Ny == a.getNOssid()[a.getNOssid().length - 1]){
                        return b.getRadice() + "ato " + a.getRadice() + "ico";
                    }else if(Ny == a.getNOssid()[positionY]){
                        return b.getRadice() + "ato " + a.getRadice() + "oso";
                    }else{
                        System.err.println(message1);
                    }
                }else{
                    System.err.println(message1);
                }
            }else if(Nx == b.getNOssid()[positionX]){
                if(a.getNOssid().length == 1){
                    return b.getRadice() + "ito di " + a.getNomeElemento();
                }else if(a.getNOssid().length == 2){
                    if(Ny == a.getNOssid()[a.getNOssid().length - 1]){
                        return b.getRadice() + "ito " + a.getRadice() + "ico";
                    }else if(Ny == a.getNOssid()[positionY]){
                        return b.getRadice() + "ito " + a.getRadice() + "oso";
                    }else{
                        System.err.println(message1);
                    }
                }else{
                    System.err.println(message1);
                }
            }else{
                System.err.println(message1);
            }
        }else{
            System.err.println(message1);
        }
        return null;
    }

    /**
     *
     * @param a First element (Type: integer)
     * @param b Second element (Type: integer)
     * @param c Third element (Type: integer)
     * @param d Fourth element (Type: integer)
     * @param Na Quantity of the first one (Type: integer)
     * @param Nb Quantity of the second one (Type: integer)
     * @param Nc Quantity of the third one (Type: integer)
     * @param Nd Quantity of the fourth one (Type: integer)
     * @return The nomenclature of a quaternary compound (Type: String)
     */
    public static String getNomeComposto4(Elemento a, Elemento b, Elemento c, Elemento d, int Na, int Nb, int Nc, int Nd){
        if(a.getN() == "Mn" || b.getN() == "Mn" || c.getN() == "Mn" || d.getN() == "Mn" || a.getN() == "Cr" || b.getN() == "Cr" || c.getN() == "Cr" || d.getN() == "Cr"){
            System.err.println(message1);
        }else if(a.isMetallo() && b.getN() == "H" && !c.isMetallo() && d.getN() == "O"){
            int Nx = (2*Nd - Nb - 1)/Nc;
            int Ny = (Nx*Nc + Nb - 2*Nd)/Na;
            int positionX = 0;
            int positionY = 0;
            String []prefiss = {"acido", "biacido", "triacido", "tetracido", "pentacido", "esacido", "eptacido", "ottacido"};

            for(int i = 0; i < c.getNOssid().length; i++){
                if(c.getNOssid()[i] >= 0){
                    positionX = i;
                    break;
                }
            }

            for(int i = 0; i < a.getNOssid().length; i++){
                if(a.getNOssid()[i] >= 0){
                    positionY = i;
                    break;
                }
            }

            if(Nx == c.getNOssid()[c.getNOssid().length - 1]){     //RISOLTO
                if(a.getNOssid().length == 1){
                    return c.getRadice() + "ato " + prefiss[Nb-1] + " di " + a.getNomeElemento();
                }else if(a.getNOssid().length == 2){
                    if(Ny == a.getNOssid()[a.getNOssid().length - 1]){
                        return c.getRadice() + "ato " + prefiss[Nb-1] + " " + a.getRadice() + "ico";
                    }else if(Ny == a.getNOssid()[positionY]){
                        return c.getRadice() + "ato " + prefiss[Nb-1] + " " + a.getRadice() + "oso";
                    }else{
                        System.err.println(message1);
                    }
                }else{
                    System.err.println(message1);
                }
            }else if(Nx == c.getNOssid()[positionX]){
                if(a.getNOssid().length == 1){
                    return c.getRadice() + "ito " + prefiss[Nb-1] + " di " + a.getNomeElemento();
                }else if(a.getNOssid().length == 2){
                    if(Ny == a.getNOssid()[a.getNOssid().length - 1]){
                        return c.getRadice() + "ito " + prefiss[Nb-1] + " " + a.getRadice() + "ico";
                    }else if(Ny == a.getNOssid()[positionY]){
                        return c.getRadice() + "ito " + prefiss[Nb-1] + " " + a.getRadice() + "oso";
                    }else{
                        System.err.println(message1);
                    }
                }else{
                    System.err.println(message1);
                }
            }else{
                System.err.println(message1);
            }
        }else{
            System.err.println(message1);
        }
        return null;
    }
}