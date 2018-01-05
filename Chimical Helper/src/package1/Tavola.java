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

    //symbol, name, root, second root, oxidation number, atomic mass, electronegativity, metal(y/n), diatomic, group
    private static final Elemento hydrogen = new Elemento("H", H, "Hydrogen", 1.008, 2.2, false, true, "1 (IA)");
    private static final Elemento helium = new Elemento("He", null, "Helium", 4.003, 0, false, false, "18 (VIIIA)");
    private static final Elemento lithium = new Elemento("Li", Li, "Lithium", 6.491, 1, true, false, "1 (IA)");
    private static final Elemento beryllium = new Elemento("Be", Be, "Beryllium", 9.012, 1.5, true, false, "2 (IIA)");
    private static final Elemento boron = new Elemento("B", B, "Boron", "bor", 10.81, 2, false, false, "3 (IIIA)");
    private static final Elemento carbon = new Elemento("C", C, "Carbon", "carbon", 12.011, 2.5, false, false, "4 (IVA)");
    private static final Elemento nitrogen = new Elemento("N", N, "Nitrogen", "nitr", 14.007, 3, false, true, "5 (VA)");
    private static final Elemento oxygen = new Elemento("O", O, "Oxygen", 15.9994, 3.44, false, true, "6 (VIA)");
    private static final Elemento fluorine = new Elemento("F", F, "Fluorine", 18.998, 4, false, true, "7 (VIIA)");
    private static final Elemento neon = new Elemento("Ne", null, "Neon", 20.179, 0, false, false, "8 (VIIIA)");
    private static final Elemento sodium = new Elemento("Na", Na, "Sodium", 22.9898, 0.9, true, false, "1 (IA)");
    private static final Elemento magnesium = new Elemento("Mg", Mg, "Magnesium", 24.305, 1.2, true, false, "2 (IIA)");
    private static final Elemento aluminum = new Elemento("Al", Al, "Aluminum", "allumin", 26.982, 1.5, true, false, "3 (IIIA)");
    private static final Elemento silicon = new Elemento("Si", Si, "Silicon", "silic", 28.086, 1.8, false, false, "4 (IVA)");
    private static final Elemento phosphorus = new Elemento("P", P, "Phosphorus", "fosf", 30.974, 1.8, false, false, "5 (VA)");
    private static final Elemento sulfur = new Elemento("S", S, "Sulfur", "solf", 32.06, 2.5, false, false, "6 (VIA)");
    private static final Elemento chlorine = new Elemento("Cl", Cl, "Chlorine", "clor", 35.453, 3, false, true, "7 (VIIA)");
    private static final Elemento argon = new Elemento("Ar", null, "Argon", 39.948, 0, false, false, "8 (VIIIA)");
    private static final Elemento potassium = new Elemento("K", K, "Potassium", 39.102, 0.8, true, false, "1 (IA)");
    private static final Elemento calcium = new Elemento("Ca", Ca, "Calcium", 40.08, 1.1, true, false, "2 (IIA)");
    private static final Elemento scandium = new Elemento("Sc", Sc, "Scandium", 44.956, 1.3, true, false, "3 (IIIB)");
    private static final Elemento titanium = new Elemento("Ti", Ti, "Titanium", "titan", 47.9, 1.5, true, false, "4 (IVB)");
    private static final Elemento vanadium = new Elemento("V", V, "Vanadium", "vanad", 50.941, 1.6, true, false, "5 (VB)");
    private static final Elemento chromium = new Elemento("Cr", Cr, "Chromium", "crom", 51.996, 1.6, true, false, "6 (VIB)");
    private static final Elemento manganese = new Elemento("Mn", Mn, "Manganese", "mangan", 54.938, 1.5, true, false, "7 (VIIB)");
    private static final Elemento iron = new Elemento("Fe", Fe, "Iron", "Ferr", 55.847, 1.8, true, false, "8 (VIII)");
    private static final Elemento cobalt = new Elemento("Co", Co, "Cobalt", "cobalt", 58.933, 1.8, true, false, "8 (VIIIB)");
    private static final Elemento nickel = new Elemento("Ni", Ni, "Nickel", "nichel", 58.71, 1.8, true, false, "8 (VIIIB)");
    private static final Elemento copper = new Elemento("Cu", Cu, "Copper", "rame", 63.546, 1.9, true, false, "1 (IB)");
    private static final Elemento zinc = new Elemento("Zn", Zn, "Zinc", 65.37, 1.6, true, false, "2 (IIB)");
    private static final Elemento gallium = new Elemento("Ga", Ga, "Gallium", 69.72, 1.6, true, false, "3 (IIIA)");
    private static final Elemento germanium = new Elemento("Ge", Ge, "Germanium", 72.59, 1.8, true, false, "4 (IVA)");
    private static final Elemento arsenic = new Elemento("As", As, "Arsenic", "arsen", 74.922, 2, false, false, "5 (VA)");
    private static final Elemento selenium = new Elemento("Se", Se, "Selenium", "selen", 78.96, 2.4, false, false, "6 (VIA)");
    private static final Elemento bromine = new Elemento("Br", Br, "Bromine", "brom", 79.904, 2.8, false, true, "7 (VIIA)");
    private static final Elemento kripton = new Elemento("Kr", null, "Kripton", 83.8, 0, false, false, "8 (VIIIA)");
    private static final Elemento rubidium = new Elemento("Rb", Rb, "Rubidium", 85.468, 0.8, true, false, "1 (IA)");
    private static final Elemento strontium = new Elemento("Sr", Sr, "Strontium", 87.62, 1, true, false, "2 (IIA)");
    private static final Elemento yttrium = new Elemento("Y", Y, "Yttrium", 88.906, 1.2, true, false, "3 (IIIB)");
    private static final Elemento zirconium = new Elemento("Zr", Zr, "Zirconium", 91.22, 1.4, true, false, "4 (IVB)");
    private static final Elemento niobium = new Elemento("Nb", Nb, "Niobium", "niob", 92.906, 1.6, true, false, "5 (VB)");
    private static final Elemento molibdenum = new Elemento("Mo", Mo, "Molibdenum", "molbden", 95.94, 1.8, true, false, "6 (VIB)");
    private static final Elemento technetium = new Elemento("Tc", Tc, "Technetium", 98.906, 1.9, true, false, "7 (VIIB)");
    private static final Elemento ruthenium = new Elemento("Ru", Ru, "Ruthenium", "ruten", 101.07, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento rhodium = new Elemento("Rh", Rh, "Rhodium", "rod", 102.906, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento palladium = new Elemento("Pd", Pd, "Palladium", "pallad", 106.4, 2.2, true, false, "8 (VIII)");
    private static final Elemento silver = new Elemento("Ag", Ag, "Silver", 107.868, 1.9, true, false, "1 (IB)");
    private static final Elemento cadmium = new Elemento("Cd", Cd, "Cadmium", 112.4, 1.7, true, false, "2 (IIB)");
    private static final Elemento indium = new Elemento("In", In, "Indium", 114.82, 1.7, true, false, "3 (IIIA)");
    private static final Elemento tin = new Elemento("Sn", Sn, "Tin", "stagn", 118.69, 1.8, true, false, "4 (IVA)");
    private static final Elemento antimony = new Elemento("Sb", Sb, "Antimony", "antimon", 121.75, 1.9, true, false, "5 (VA)");
    private static final Elemento tellurium = new Elemento("Te", Te, "Tellurium", "tellur", 127.6, 2.1, false, false, "6 (VIA)");
    private static final Elemento iodine = new Elemento("I", I, "Iodine", "iod", 127.6, 2.1, false, true, "7 (VIIA)");
    private static final Elemento xenon = new Elemento("Xe", null, "Xenon", 131.3, 0, false, false, "8 (VIIIA)");
    private static final Elemento cesium = new Elemento("Cs", Cs, "Cesium", 132.906, 0.7, true, false, "1 (IA)");
    private static final Elemento barium = new Elemento("Ba", Ba, "Barium", 137.34, 0.9, true, false, "2 (IIA)");
    private static final Elemento lanthanum = new Elemento("La", La, "Lanthanum", 138.906, 1.1, true, false, "3 (IIIB)");
    private static final Elemento cerium = new Elemento("Ce", Ce, "Cerium", "Cer", 140.12, 1.1, true, false, "3 (IIIB)");
    private static final Elemento praseodymium = new Elemento("Pr", Pr, "Praseodymium", "praseodim", 140.908, 1.1, true, false, "3 (IIIB)");
    private static final Elemento neodymium = new Elemento("Nd", Nd, "Neodymium", 144.24, 1.2, true, false, "3 (IIIB)");
    private static final Elemento promethium = new Elemento("Pm", Pm, "Promethium", 147, 0, true, false, "3 (IIIB)");
    private static final Elemento samarium = new Elemento("Sm", Sm, "Samarium", "samar", 150.4, 1.2, true, false, "3 (IIIB)");
    private static final Elemento europium = new Elemento("Eu", Eu, "Europium", "europ", 151.96, 0, true, false, "3 (IIIIB)");
    private static final Elemento gadolinium = new Elemento("Gd", Gd, "Gadolinium", 157.25, 1.1, true, false, "3 (IIIB)");
    private static final Elemento terbium = new Elemento("Tb", Tb, "Terbium", "terb", 158.92, 1.2, true, false, "3 (IIIB)");
    private static final Elemento dysprosium = new Elemento("Dy", Dy, "Dysprosium", 162.5, 0, true, false, "3 (IIIB)");
    private static final Elemento holmium = new Elemento("Ho", Ho, "Holmium", 164.93, 1.2, true, false, "3 (IIIB)");
    private static final Elemento erbium = new Elemento("Er", Er, "Erbium", 167.26, 1.2, true, false, "3 (IIIB)");
    private static final Elemento thulium = new Elemento("Tm", Tm, "Thulium", "tul", 168.93, 1.2, true, false, "3 (IIIB)");
    private static final Elemento ytterbium = new Elemento("Yb", Yb, "Ytterbium", "itterb", 173.04, 1.1, true, false, "3 (IIIB)");
    private static final Elemento lutetium = new Elemento("Lu", Lu, "Luteztium", 174.97, 1.2, true, false, "3 (IIIB)");
    private static final Elemento hafnium = new Elemento("Hf", Hf, "Hafnium", 178.49, 1.3, true, false, "4 (IVB)");
    private static final Elemento tantalum = new Elemento("Ta", Ta, "Tantalum", 180.948, 1.5, true, false, "5 (VB)");
    private static final Elemento tungsten = new Elemento("W", W, "Tungsten", "tungsten", 183.85, 1.7, true, false, "6 (VIB)");
    private static final Elemento rhenium = new Elemento("Re", Re, "Rhenium", "ren", 186.2, 1.9, true, false, "7 (VIIB)");
    private static final Elemento osmium = new Elemento("Os", Os, "Osmium", "osm", 190.2, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento iridium = new Elemento("Ir", Ir, "Iridium", "irid", 192.22, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento platinum = new Elemento("Pt", Pt, "Platinum", "platin", 195.09, 2.2, true, false, "8 (VIIIB)");
    private static final Elemento gold = new Elemento("Au", Au, "Gold", "aur", 196.966, 2.4, true, false, "1 (IB)");
    private static final Elemento mercury = new Elemento("Hg", Hg, "Mercury", "mercur", 200.59, 1.9, true, false, "2 (IIB)");
    private static final Elemento thallium = new Elemento("Tl", Tl, "Thallium", "tall", 204.37, 1.8, true, false, "3 (IIIA)");
    private static final Elemento lead = new Elemento("Pb", Pb, "Lead", "piomb", 207.2, 1.8, true, false, "4 (IVA)");
    private static final Elemento bismuth = new Elemento("Ni", Bi, "Bismuth", "bismut", 208.981, 1.9, true, false, "5 (VA)");
    private static final Elemento polonium = new Elemento("Po", Po, "Polonium", "polon", 210, 2, true, false, "6 (VIA)");
    private static final Elemento astatine = new Elemento("At", At, "Astatine", "astat", 210, 2.2, false, false, "7 (VIIA)");
    private static final Elemento radon = new Elemento("Rn", null, "Radon", 222, 0, false, false, "8 (VIIIA)");
    private static final Elemento francium = new Elemento("Fr", Fr, "Francium", 223, 0.7, true, false, "1 (IA)");
    private static final Elemento radium = new Elemento("Ra", Ra, "Radium", 226.025, 0.9, true, false, "2 (IIA)");
    private static final Elemento actinium = new Elemento("Ac", Ac, "Actinium", 227, 0, true, false, "3 (IIIB)");
    private static final Elemento thorium = new Elemento("Th", Th, "Thorium", 232.04, 0.0, true, false, "3 (IIIB)");
    private static final Elemento protactinium = new Elemento("Pa", Pa, "Protactinium", "protoattin", 231.036, 0, true, false, "3 (IIIB)");
    private static final Elemento uranium = new Elemento("U", U, "Uranium", "uran", 239.029, 0, true, false, "3 (IIIB)");
    private static final Elemento neptunium = new Elemento("Np", Np, "Neptunium", "nettun", 237.048, 0, true, false, "3 (IIIB)");
    private static final Elemento plutonium = new Elemento("Pu", Pu, "Plutonium", "pluton", 244, 0, true, false, "3 (IIIB)");
    private static final Elemento americium = new Elemento("Am", Am, "Americium", "amer", 243, 0, true, false, "3 (IIIB)");
    private static final Elemento curium = new Elemento("Cm", Cm, "Curium", "cur", 247, 0, true, false, "3 (IIIB)");
    private static final Elemento berkelium = new Elemento("Bk", Bk, "Berkelium", "berkel", 247, 0, true, false, "3 (IIIB)");
    private static final Elemento californium = new Elemento("Cf", Cf, "Californium", "californ", 251, 0, true, false, "3 (IIIB)");
    private static final Elemento einsteinium = new Elemento("Es", Es, "Einsteinium", 254, 0, true, false, "3 (IIIB)");
    private static final Elemento fermium = new Elemento("Fm", Fm, "Fermium", 257, 0, true, false, "3 (IIIB)");
    private static final Elemento mendelevium = new Elemento("Md", Md, "Mendelevium", 258, 0, true, false, "3 (IIIB)");
    private static final Elemento nobelium = new Elemento("No", No, "Nobelium", "nobl", 255, 0, true, false, "3 (IIIB)");
    private static final Elemento lawrencium = new Elemento("Lr", Lr, "Lawrencium", 256, 0, true, false, "3 (IIIB)");

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
