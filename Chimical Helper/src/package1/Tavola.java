package package1;

import org.jetbrains.annotations.Contract;

/**
 * Java Resource Pack: Tavola
 *
 * Developed by: Sergiu Florea
 */
class Tavola {
    private static final int H[]={-1, 1};
    private static final int Li[]={1};
    private static final int Be[]={2};
    private static final int B[]={3};
    private static final int C[]={-4, 2, 4};
    private static final int N[]={-3,1,2,3,4,5};
    private static final int O[]={-1, -2};
    private static final int F[]={-1};
    private static final int Na[]={1};
    private static final int Mg[]={2};
    private static final int Al[]={3};
    private static final int Si[]={-4,4};
    private static final int P[]={-3,3,5};
    private static final int S[]={-2,4,6};
    private static final int Cl[]={-1,1,3,5,7};
    private static final int K[]={1};
    private static final int Ca[]={2};
    private static final int Sc[]={3};
    private static final int Ti[]={3,4};
    private static final int V[]={2,3,4,5};
    private static final int Mn[]={2,3,4,6,7};
    private static final int Fe[]={2,3};
    private static final int Co[]={2,3};
    private static final int Ni[]={2,3};
    private static final int Cu[]={1,2};
    private static final int Zn[]={2};
    private static final int Ga[]={3};
    private static final int Ge[]={4};
    private static final int As[]={-3,3,5};
    private static final int Se[]={-2,4,6};
    private static final int Br[]={-1,1,3,5,7};
    private static final int Rb[]={1};
    private static final int Sr[]={2};
    private static final int Y[]={3};
    private static final int Zr[]={4};
    private static final int Nb[]={3,5};
    private static final int Mo[]={2,3,4,5,6};
    private static final int Tc[]={7};
    private static final int Ru[]={2,3,4,6,8};
    private static final int Rh[]={1,2,3,4,5};
    private static final int Pd[]={2,4};
    private static final int Ag[]={1};
    private static final int Cd[]={2};
    private static final int In[]={3};
    private static final int Sn[]={2,4};
    private static final int Sb[]={-3,3,5};
    private static final int Te[]={-2,4,6};
    private static final int I[]={-1,1,5,7};
    private static final int Cs[]={1};
    private static final int Ba[]={2};
    private static final int La[]={3};
    private static final int Ce[]={3,4};
    private static final int Pr[]={3,4};
    private static final int Nd[]={3};
    private static final int Pm[]={3};
    private static final int Sm[]={2,3};
    private static final int Eu[]={2,3};
    private static final int Gd[]={3};
    private static final int Tb[]={3,4};
    private static final int Dy[]={3};
    private static final int Ho[]={3};
    private static final int Er[]={3};
    private static final int Tm[]={2,3};
    private static final int Yb[]={2,3};
    private static final int Lu[]={3};
    private static final int Hf[]={4};
    private static final int Ta[]={5};
    private static final int W[]={2,3,4,5,6};
    private static final int Re[]={-1,2,4,6,7};
    private static final int Os[]={2,3,4,6,8};
    private static final int Ir[]={1,2,3,4,6};
    private static final int Pt[]={2,4};
    private static final int Au[]={1,3};
    private static final int Hg[]={1,2};
    private static final int Tl[]={1,3};
    private static final int Pb[]={2,4};
    private static final int Bi[]={3,5};
    private static final int Po[]={2,4,6};
    private static final int At[]={-1,1,3,5,7};
    private static final int Fr[]={1};
    private static final int Ra[]={2};
    private static final int Ac[]={3};
    private static final int Th[]={4};
    private static final int Pa[]={4,5};
    private static final int U[]={3,4,5,6};
    private static final int Np[]={3,4,5,6};
    private static final int Pu[]={3,4,5,6};
    private static final int Am[]={3,4,5,6};
    private static final int Cm[]={3,4};
    private static final int Bk[]={3,4};
    private static final int Cf[]={3,4};
    private static final int Es[]={3};
    private static final int Fm[]={3};
    private static final int Md[]={3};
    private static final int No[]={2,3};
    private static final int Lr[]={3};
    private static final int Cr[]={6,3,2};

    //simbolo, nome, radice, seconda radice, numeri di ossidazione, massa atomica, elettronegativita', metallo, biatomico, gruppo
    private static final Elemento idrogeno = new Elemento("H", H, "Idrogeno", 1.008, 2.2, false, true, "1 (IA)");
    private static final Elemento elio = new Elemento("He", null, "Elio", 4.003, 0, false, false, "18 (VIIIA)");
    private static final Elemento litio = new Elemento("Li", Li, "Litio", 6.491, 1, true, false, "1 (IA)");
    private static final Elemento berillio = new Elemento("Be", Be, "Berillio", 9.012, 1.5, true, false, "2 (IIA)");
    private static final Elemento boro = new Elemento("B", B, "Boro", "bor", 10.81, 2, false, false, "3 (IIIA)");
    private static final Elemento carbonio = new Elemento("C", C, "Carbonio", "carbon", 12.011, 2.5, false, false, "4 (IVA)");
    private static final Elemento azoto = new Elemento("N", N, "Azoto", "nitr", 14.007, 3, false, true, "5 (VA)");
    private static final Elemento ossigeno = new Elemento("O", O, "Ossigeno", 15.9994, 3.44, false, true, "6 (VIA)");
    private static final Elemento fluoro = new Elemento("F", F, "Fluoro", 18.998, 4, false, true, "7 (VIIA)");
    private static final Elemento neon = new Elemento("Ne", null, "Neon", 20.179, 0, false, false, "8 (VIIIA)");
    private static final Elemento sodio = new Elemento("Na", Na, "Sodio", 22.9898, 0.9, true, false, "1 (IA)");
    private static final Elemento magnesio = new Elemento("Mg", Mg, "Magnesio", 24.305, 1.2, true, false, "2 (IIA)");
    private static final Elemento alluminio = new Elemento("Al", Al, "Alluminio", "allumin", 26.982, 1.5, true, false, "3 (IIIA)");
    private static final Elemento silicio = new Elemento("Si", Si, "Silicio", "silic", 28.086, 1.8, false, false, "4 (IVA)");
    private static final Elemento fosforo = new Elemento("P", P, "Fosforo", "fosf", 30.974, 1.8, false, false, "5 (VA)");
    private static final Elemento zolfo = new Elemento("S", S, "Zolfo", "solf", 32.06, 2.5, false, false, "6 (VIA)");
    private static final Elemento cloro = new Elemento("Cl", Cl, "Cloro", "clor", 35.453, 3, false, true, "7 (VIIA)");
    private static final Elemento argon = new Elemento("Ar", null, "Argon", 39.948, 0, false, false, "8 (VIIIA)");
    private static final Elemento potassio = new Elemento("K", K, "Potassio", 39.102, 0.8, true, false, "1 (IA)");
    private static final Elemento calcio = new Elemento("Ca", Ca, "Calcio", 40.08, 1.1, true, false, "2 (IIA)");
    private static final Elemento scandio = new Elemento("Sc", Sc, "Scandio", 44.956, 1.3, true, false, "3 (IIIB)");
    private static final Elemento titanio = new Elemento("Ti", Ti, "Titanio", "titan", 47.9, 1.5, true, false, "4 (IVB)");
    private static final Elemento vanadio = new Elemento("V", V, "Vanadio", "vanad", 50.941, 1.6, true, false, "5 (VB)");
    private static final Elemento cromo = new Elemento("Cr", Cr, "Cromo", "crom", 51.996, 1.6, true, false, "6 (VIB)");
    private static final Elemento manganese = new Elemento("Mn", Mn, "Manganese", "mangan", 54.938, 1.5, true, false, "7 (VIIB)");
    private static final Elemento ferro = new Elemento("Fe", Fe, "Ferro", "Ferr", 55.847, 1.8, true, false, "8 (VIII)");
    private static final Elemento cobalto = new Elemento("Co", Co, "Cobalto", "cobalt", 58.933, 1.8, true, false, "8 (VIIIB)");
    private static final Elemento nichel = new Elemento("Ni", Ni, "Nichel", "nichel", 58.71, 1.8, true, false, "8 (VIIIB)");
    private static final Elemento rame = new Elemento("Cu", Cu, "Rame", "rame", 63.546, 1.9, true, false, "1 (IB)");
    private static final Elemento zinco = new Elemento("Zn", Zn, "Zinco", 65.37, 1.6, true, false, "2 (IIB)");
    private static final Elemento gallio = new Elemento("Ga", Ga, "Gallio", 69.72, 1.6, true, false, "3 (IIIA)");
    private static final Elemento germanio = new Elemento("Ge", Ge, "Germanio", 72.59, 1.8, true, false, "4 (IVA)");
    private static final Elemento arsenico = new Elemento("As", As, "Arsenico", "arsen", 74.922, 2, false, false, "5 (VA)");
    private static final Elemento selenio = new Elemento("Se", Se, "Selenio", "selen", 78.96, 2.4, false, false, "6 (VIA)");
    private static final Elemento bromo = new Elemento("Br", Br, "Bromo", "brom", 79.904, 2.8, false, true, "7 (VIIA)");
    private static final Elemento kripton = new Elemento("Kr", null, "Kripton", 83.8, 0, false, false, "8 (VIIIA)");
    private static final Elemento rubidio = new Elemento("Rb", Rb, "Rubidio", 85.468, 0.8, true, false, "1 (IA)");
    private static final Elemento stronzio = new Elemento("Sr", Sr, "Stronzio", 87.62, 1, true, false, "2 (IIA)");
    private static final Elemento ittrio = new Elemento("Y", Y, "Ittrio", 88.906, 1.2, true, false, "3 (IIIB)");
    private static final Elemento zirconio = new Elemento("Zr", Zr, "Zirconio", 91.22, 1.4, true, false, "4 (IVB)");
    private static final Elemento niobio = new Elemento("Nb", Nb, "Niobio", "niob", 92.906, 1.6, true, false, "5 (VB)");
    private static final Elemento molibdeno = new Elemento("Mo", Mo, "Molibdeno", "molbden", 95.94, 1.8, true, false, "6 (VIB)");
    private static final Elemento tecnezio = new Elemento("Tc", Tc, "Tecnezio", 98.906, 1.9, true, false, "7 (VIIB)");
    private static final Elemento rutenio = new Elemento("Ru", Ru, "Rutenio", "ruten", 101.07, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento rodio = new Elemento("Rh", Rh, "Rodio", "rod", 102.906, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento palladio = new Elemento("Pd", Pd, "Palladio", "pallad", 106.4, 2.2, true, false, "8 (VIII)");
    private static final Elemento argento = new Elemento("Ag", Ag, "Argento", 107.868, 1.9, true, false, "1 (IB)");
    private static final Elemento cadmio = new Elemento("Cd", Cd, "Cadmio", 112.4, 1.7, true, false, "2 (IIB)");
    private static final Elemento indio = new Elemento("In", In, "Indio", 114.82, 1.7, true, false, "3 (IIIA)");
    private static final Elemento stagno = new Elemento("Sn", Sn, "Stagno", "stagn", 118.69, 1.8, true, false, "4 (IVA)");
    private static final Elemento antimonio = new Elemento("Sb", Sb, "Antimonio", "antimon", 121.75, 1.9, true, false, "5 (VA)");
    private static final Elemento tellurio = new Elemento("Te", Te, "Tellurio", "tellur", 127.6, 2.1, false, false, "6 (VIA)");
    private static final Elemento iodio = new Elemento("I", I, "Iodio", "iod", 127.6, 2.1, false, true, "7 (VIIA)");
    private static final Elemento xeno = new Elemento("Xe", null, "Xeno", 131.3, 0, false, false, "8 (VIIIA)");
    private static final Elemento cesio = new Elemento("Cs", Cs, "Cesio", 132.906, 0.7, true, false, "1 (IA)");
    private static final Elemento bario = new Elemento("Ba", Ba, "Bario", 137.34, 0.9, true, false, "2 (IIA)");
    private static final Elemento lantanio = new Elemento("La", La, "Lantanio", 138.906, 1.1, true, false, "3 (IIIB)");
    private static final Elemento cerio = new Elemento("Ce", Ce, "Cerio", "Cer", 140.12, 1.1, true, false, "3 (IIIB)");
    private static final Elemento praseodimio = new Elemento("Pr", Pr, "Praseodimio", "praseodim", 140.908, 1.1, true, false, "3 (IIIB)");
    private static final Elemento neodimio = new Elemento("Nd", Nd, "Neodimio", 144.24, 1.2, true, false, "3 (IIIB)");
    private static final Elemento promezio = new Elemento("Pm", Pm, "Promezio", 147, 0, true, false, "3 (IIIB)");
    private static final Elemento samario = new Elemento("Sm", Sm, "Samario", "samar", 150.4, 1.2, true, false, "3 (IIIB)");
    private static final Elemento europio = new Elemento("Eu", Eu, "Europio", "europ", 151.96, 0, true, false, "3 (IIIIB)");
    private static final Elemento gadolinio = new Elemento("Gd", Gd, "Gadolinio", 157.25, 1.1, true, false, "3 (IIIB)");
    private static final Elemento terbio = new Elemento("Tb", Tb, "Terbio", "terb", 158.92, 1.2, true, false, "3 (IIIB)");
    private static final Elemento disprosio = new Elemento("Dy", Dy, "Disprosio", 162.5, 0, true, false, "3 (IIIB)");
    private static final Elemento olmio = new Elemento("Ho", Ho, "Olmio", 164.93, 1.2, true, false, "3 (IIIB)");
    private static final Elemento erbio = new Elemento("Er", Er, "Erbio", 167.26, 1.2, true, false, "3 (IIIB)");
    private static final Elemento tulio = new Elemento("Tm", Tm, "Tulio", "tul", 168.93, 1.2, true, false, "3 (IIIB)");
    private static final Elemento itterbio = new Elemento("Yb", Yb, "Itterbio", "itterb", 173.04, 1.1, true, false, "3 (IIIB)");
    private static final Elemento lutezio = new Elemento("Lu", Lu, "Lutezio", 174.97, 1.2, true, false, "3 (IIIB)");
    private static final Elemento afnio = new Elemento("Hf", Hf, "Afnio", 178.49, 1.3, true, false, "4 (IVB)");
    private static final Elemento tantalio = new Elemento("Ta", Ta, "Tantalio", 180.948, 1.5, true, false, "5 (VB)");
    private static final Elemento tungsteno = new Elemento("W", W, "Tungsteno", "tungsten", 183.85, 1.7, true, false, "6 (VIB)");
    private static final Elemento renio = new Elemento("Re", Re, "Renio", "ren", 186.2, 1.9, true, false, "7 (VIIB)");
    private static final Elemento osmio = new Elemento("Os", Os, "Osmio", "osm", 190.2, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento iridio = new Elemento("Ir", Ir, "Iridio", "irid", 192.22, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento platino = new Elemento("Pt", Pt, "Platino", "platin", 195.09, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento oro = new Elemento("Au", Au, "Oro", "aur", 196.966, 2.4, true, false, "1 (IB)");
    private static final Elemento mercurio = new Elemento("Hg", Hg, "Mercurio", "mercur", 200.59, 1.9, true, false, "2 (IIB)");
    private static final Elemento tallio = new Elemento("Tl", Tl, "Tallio", "tall", 204.37, 1.8, true, false, "3 (IIIA)");
    private static final Elemento piombo = new Elemento("Pb", Pb, "Piombo", "piomb", 207.2, 1.8, true, false, "4 (IVA)");
    private static final Elemento bismuto = new Elemento("Ni", Bi, "Bismuto", "bismut", 208.981, 1.9, true, false, "5 (VA)");
    private static final Elemento polonio = new Elemento("Po", Po, "Polonio", "polon", 210, 2, true, false, "6 (VIA)");
    private static final Elemento astato = new Elemento("At", At, "Astato", "astat", 210, 2.2, false, false, "7 (VIIA)");
    private static final Elemento radon = new Elemento("Rn", null, "Radon", 222, 0, false, false, "8 (VIIIA)");
    private static final Elemento francio = new Elemento("Fr", Fr, "Francio", 223, 0.7, true, false, "1 (IA)");
    private static final Elemento radio = new Elemento("Ra", Ra, "Radio", 226.025, 0.9, true, false, "2 (IIA)");
    private static final Elemento attinio = new Elemento("Ac", Ac, "Attinio", 227, 0, true, false, "3 (IIIB)");
    private static final Elemento torio = new Elemento("Th", Th, "Torio", 232.04, 0.0, true, false, "3 (IIIB)");
    private static final Elemento protoattinio = new Elemento("Pa", Pa, "Protoattinio", "protoattin", 231.036, 0, true, false, "3 (IIIB)");
    private static final Elemento uranio = new Elemento("U", U, "Uranio", "uran", 239.029, 0, true, false, "3 (IIIB)");
    private static final Elemento nettunio = new Elemento("Np", Np, "Nettunio", "pluton", 237.048, 0, true, false, "3 (IIIB)");
    private static final Elemento plutonio = new Elemento("Pu", Pu, "Plutonio", "nettun", 244, 0, true, false, "3 (IIIB)");
    private static final Elemento americio = new Elemento("Am", Am, "Americio", "amer", 243, 0, true, false, "3 (IIIB)");
    private static final Elemento curio = new Elemento("Cm", Cm, "Curio", "cur", 247, 0, true, false, "3 (IIIB)");
    private static final Elemento berchelio = new Elemento("Bk", Bk, "Berchelio", "berkel", 247, 0, true, false, "3 (IIIB)");
    private static final Elemento californio = new Elemento("Cf", Cf, "Californio", "californ", 251, 0, true, false, "3 (IIIB)");
    private static final Elemento einsteinio = new Elemento("Es", Es, "Einsteinio", 254, 0, true, false, "3 (IIIB)");
    private static final Elemento fermio = new Elemento("Fm", Fm, "Fermio", 257, 0, true, false, "3 (IIIB)");
    private static final Elemento mendelevio = new Elemento("Md", Md, "Mendelevio", 258, 0, true, false, "3 (IIIB)");
    private static final Elemento nobelio = new Elemento("No", No, "Nobelio", "nobl", 255, 0, true, false, "3 (IIIB)");
    private static final Elemento laurenzio = new Elemento("Lr", Lr, "Laurenzio", 256, 0, true, false, "3 (IIIB)");

    public static int[] getH() {
        return H;
    }

    public static int[] getLi() {
        return Li;
    }

    public static int[] getBe() {
        return Be;
    }

    public static int[] getB() {
        return B;
    }

    public static int[] getC() {
        return C;
    }

    public static int[] getN() {
        return N;
    }

    public static int[] getO() {
        return O;
    }

    public static int[] getF() {
        return F;
    }

    public static int[] getNa() {
        return Na;
    }

    public static int[] getMg() {
        return Mg;
    }

    public static int[] getAl() {
        return Al;
    }

    public static int[] getSi() {
        return Si;
    }

    public static int[] getP() {
        return P;
    }

    public static int[] getS() {
        return S;
    }

    public static int[] getCl() {
        return Cl;
    }

    public static int[] getK() {
        return K;
    }

    public static int[] getCa() {
        return Ca;
    }

    public static int[] getSc() {
        return Sc;
    }

    public static int[] getTi() {
        return Ti;
    }

    public static int[] getV() {
        return V;
    }

    public static int[] getMn() {
        return Mn;
    }

    public static int[] getFe() {
        return Fe;
    }

    public static int[] getCo() {
        return Co;
    }

    public static int[] getNi() {
        return Ni;
    }

    public static int[] getCu() {
        return Cu;
    }

    public static int[] getZn() {
        return Zn;
    }

    public static int[] getGa() {
        return Ga;
    }

    public static int[] getGe() {
        return Ge;
    }

    public static int[] getAs() {
        return As;
    }

    public static int[] getSe() {
        return Se;
    }

    public static int[] getBr() {
        return Br;
    }

    public static int[] getRb() {
        return Rb;
    }

    public static int[] getSr() {
        return Sr;
    }

    public static int[] getY() {
        return Y;
    }

    public static int[] getZr() {
        return Zr;
    }

    public static int[] getNb() {
        return Nb;
    }

    public static int[] getMo() {
        return Mo;
    }

    public static int[] getTc() {
        return Tc;
    }

    public static int[] getRu() {
        return Ru;
    }

    public static int[] getRh() {
        return Rh;
    }

    public static int[] getPd() {
        return Pd;
    }

    public static int[] getAg() {
        return Ag;
    }

    public static int[] getCd() {
        return Cd;
    }

    public static int[] getIn() {
        return In;
    }

    public static int[] getSn() {
        return Sn;
    }

    public static int[] getSb() {
        return Sb;
    }

    public static int[] getTe() {
        return Te;
    }

    public static int[] getI() {
        return I;
    }

    public static int[] getCs() {
        return Cs;
    }

    public static int[] getBa() {
        return Ba;
    }

    public static int[] getLa() {
        return La;
    }

    public static int[] getCe() {
        return Ce;
    }

    public static int[] getPr() {
        return Pr;
    }

    public static int[] getNd() {
        return Nd;
    }

    public static int[] getPm() {
        return Pm;
    }

    public static int[] getSm() {
        return Sm;
    }

    public static int[] getEu() {
        return Eu;
    }

    public static int[] getGd() {
        return Gd;
    }

    public static int[] getTb() {
        return Tb;
    }

    public static int[] getDy() {
        return Dy;
    }

    public static int[] getHo() {
        return Ho;
    }

    public static int[] getEr() {
        return Er;
    }

    public static int[] getTm() {
        return Tm;
    }

    public static int[] getYb() {
        return Yb;
    }

    public static int[] getLu() {
        return Lu;
    }

    public static int[] getHf() {
        return Hf;
    }

    public static int[] getTa() {
        return Ta;
    }

    public static int[] getW() {
        return W;
    }

    public static int[] getRe() {
        return Re;
    }

    public static int[] getOs() {
        return Os;
    }

    public static int[] getIr() {
        return Ir;
    }

    public static int[] getPt() {
        return Pt;
    }

    public static int[] getAu() {
        return Au;
    }

    public static int[] getHg() {
        return Hg;
    }

    public static int[] getTl() {
        return Tl;
    }

    public static int[] getPb() {
        return Pb;
    }

    public static int[] getBi() {
        return Bi;
    }

    public static int[] getPo() {
        return Po;
    }

    public static int[] getAt() {
        return At;
    }

    public static int[] getFr() {
        return Fr;
    }

    public static int[] getRa() {
        return Ra;
    }

    public static int[] getAc() {
        return Ac;
    }

    public static int[] getTh() {
        return Th;
    }

    public static int[] getPa() {
        return Pa;
    }

    public static int[] getU() {
        return U;
    }

    public static int[] getNp() {
        return Np;
    }

    public static int[] getPu() {
        return Pu;
    }

    public static int[] getAm() {
        return Am;
    }

    public static int[] getCm() {
        return Cm;
    }

    public static int[] getBk() {
        return Bk;
    }

    public static int[] getCf() {
        return Cf;
    }

    public static int[] getEs() {
        return Es;
    }

    public static int[] getFm() {
        return Fm;
    }

    public static int[] getMd() {
        return Md;
    }

    public static int[] getNo() {
        return No;
    }

    public static int[] getLr() {
        return Lr;
    }

    public static int[] getCr() {
        return Cr;
    }

    public static Elemento getIdrogeno() {
        return idrogeno;
    }

    public static Elemento getElio() {
        return elio;
    }

    public static Elemento getLitio() {
        return litio;
    }

    public static Elemento getBerillio() {
        return berillio;
    }

    public static Elemento getBoro() {
        return boro;
    }

    public static Elemento getCarbonio() {
        return carbonio;
    }

    public static Elemento getAzoto() {
        return azoto;
    }

    public static Elemento getOssigeno() {
        return ossigeno;
    }

    public static Elemento getFluoro() {
        return fluoro;
    }

    public static Elemento getNeon() {
        return neon;
    }

    public static Elemento getSodio() {
        return sodio;
    }

    public static Elemento getMagnesio() {
        return magnesio;
    }

    public static Elemento getAlluminio() {
        return alluminio;
    }

    public static Elemento getSilicio() {
        return silicio;
    }

    public static Elemento getFosforo() {
        return fosforo;
    }

    @Contract(pure = true)
    public static Elemento getZolfo() {
        return zolfo;
    }

    @Contract(pure = true)
    public static Elemento getCloro() {
        return cloro;
    }

    @Contract(pure = true)
    public static Elemento getArgon() {
        return argon;
    }

    @Contract(pure = true)
    public static Elemento getPotassio() {
        return potassio;
    }

    @Contract(pure = true)
    public static Elemento getCalcio() {
        return calcio;
    }

    @Contract(pure = true)
    public static Elemento getScandio() {
        return scandio;
    }

    @Contract(pure = true)
    public static Elemento getTitanio() {
        return titanio;
    }

    @Contract(pure = true)
    public static Elemento getVanadio() {
        return vanadio;
    }

    @Contract(pure = true)
    public static Elemento getCromo() {
        return cromo;
    }

    @Contract(pure = true)
    public static Elemento getManganese() {
        return manganese;
    }

    @Contract(pure = true)
    public static Elemento getFerro() {
        return ferro;
    }

    @Contract(pure = true)
    public static Elemento getCobalto() {
        return cobalto;
    }

    @Contract(pure = true)
    public static Elemento getNichel() {
        return nichel;
    }

    @Contract(pure = true)
    public static Elemento getRame() {
        return rame;
    }

    @Contract(pure = true)
    public static Elemento getZinco() {
        return zinco;
    }

    @Contract(pure = true)
    public static Elemento getGallio() {
        return gallio;
    }

    public static Elemento getGermanio() {
        return germanio;
    }

    public static Elemento getArsenico() {
        return arsenico;
    }

    public static Elemento getSelenio() {
        return selenio;
    }

    public static Elemento getBromo() {
        return bromo;
    }

    public static Elemento getKripton() {
        return kripton;
    }

    public static Elemento getRubidio() {
        return rubidio;
    }

    public static Elemento getStronzio() {
        return stronzio;
    }

    public static Elemento getIttrio() {
        return ittrio;
    }

    public static Elemento getZirconio() {
        return zirconio;
    }

    public static Elemento getNiobio() {
        return niobio;
    }

    public static Elemento getMolibdeno() {
        return molibdeno;
    }

    public static Elemento getTecnezio() {
        return tecnezio;
    }

    public static Elemento getRutenio() {
        return rutenio;
    }

    public static Elemento getRodio() {
        return rodio;
    }

    public static Elemento getPalladio() {
        return palladio;
    }

    public static Elemento getArgento() {
        return argento;
    }

    public static Elemento getCadmio() {
        return cadmio;
    }

    public static Elemento getIndio() {
        return indio;
    }

    public static Elemento getStagno() {
        return stagno;
    }

    public static Elemento getAntimonio() {
        return antimonio;
    }

    public static Elemento getTellurio() {
        return tellurio;
    }

    public static Elemento getIodio() {
        return iodio;
    }

    public static Elemento getXeno() {
        return xeno;
    }

    public static Elemento getCesio() {
        return cesio;
    }

    public static Elemento getBario() {
        return bario;
    }

    public static Elemento getLantanio() {
        return lantanio;
    }

    public static Elemento getCerio() {
        return cerio;
    }

    public static Elemento getPraseodimio() {
        return praseodimio;
    }

    public static Elemento getNeodimio() {
        return neodimio;
    }

    public static Elemento getPromezio() {
        return promezio;
    }

    public static Elemento getSamario() {
        return samario;
    }

    public static Elemento getEuropio() {
        return europio;
    }

    public static Elemento getGadolinio() {
        return gadolinio;
    }

    public static Elemento getTerbio() {
        return terbio;
    }

    public static Elemento getDisprosio() {
        return disprosio;
    }

    public static Elemento getOlmio() {
        return olmio;
    }

    public static Elemento getErbio() {
        return erbio;
    }

    public static Elemento getTulio() {
        return tulio;
    }

    public static Elemento getItterbio() {
        return itterbio;
    }

    public static Elemento getLutezio() {
        return lutezio;
    }

    public static Elemento getAfnio() {
        return afnio;
    }

    public static Elemento getTantalio() {
        return tantalio;
    }

    public static Elemento getTungsteno() {
        return tungsteno;
    }

    public static Elemento getRenio() {
        return renio;
    }

    public static Elemento getOsmio() {
        return osmio;
    }

    public static Elemento getIridio() {
        return iridio;
    }

    public static Elemento getPlatino() {
        return platino;
    }

    public static Elemento getOro() {
        return oro;
    }

    public static Elemento getMercurio() {
        return mercurio;
    }

    public static Elemento getTallio() {
        return tallio;
    }

    public static Elemento getPiombo() {
        return piombo;
    }

    public static Elemento getBismuto() {
        return bismuto;
    }

    public static Elemento getPolonio() {
        return polonio;
    }

    public static Elemento getAstato() {
        return astato;
    }

    public static Elemento getRadon() {
        return radon;
    }

    public static Elemento getFrancio() {
        return francio;
    }

    @Contract(pure = true)
    public static Elemento getRadio() {
        return radio;
    }

    @Contract(pure = true)
    public static Elemento getAttinio() {
        return attinio;
    }

    @Contract(pure = true)
    public static Elemento getTorio() {
        return torio;
    }

    @Contract(pure = true)
    public static Elemento getProtoattinio() {
        return protoattinio;
    }

    @Contract(pure = true)
    public static Elemento getUranio() {
        return uranio;
    }

    @Contract(pure = true)
    public static Elemento getNettunio() {
        return nettunio;
    }

    @Contract(pure = true)
    public static Elemento getPlutonio() {
        return plutonio;
    }

    @Contract(pure = true)
    public static Elemento getAmericio() {
        return americio;
    }

    @Contract(pure = true)
    public static Elemento getCurio() {
        return curio;
    }

    @Contract(pure = true)
    public static Elemento getBerchelio() {
        return berchelio;
    }

    @Contract(pure = true)
    public static Elemento getCalifornio() {
        return californio;
    }

    @Contract(pure = true)
    public static Elemento getEinsteinio() {
        return einsteinio;
    }

    @Contract(pure = true)
    public static Elemento getFermio() {
        return fermio;
    }

    @Contract(pure = true)
    public static Elemento getMendelevio() {
        return mendelevio;
    }

    @Contract(pure = true)
    public static Elemento getNobelio() {
        return nobelio;
    }

    @Contract(pure = true)
    public static Elemento getLaurenzio() {
        return laurenzio;
    }
}
