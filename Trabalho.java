/*
*
*
*
*
*
*
Se for testar, mude a saida do arquivo, que se encontra na linha 164.
*
*
*
*
*
*
*
*/
package trabalho;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Locale;

public class Trabalho {

    private final static int NP = 10;
    
    public static int ri(int max) {
        return (int) (1 + (Math.random() * max));
    }

    public static double rr(int max) {
        return (1 + (Math.random() * max));
    }

    public static double q1vnu(double[] vnreais) {
        int a, c;
        double b;
        a = vnreais.length;
        b = 0;
        for (c = 0; c < a; c++) {
            b += vnreais[c];
        }
        return b /= a;
    }

    public static boolean q2vf(int a) {
        //se ele retorna true é par, se for false é impar
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double q3cv(double raio) {
        return (4 / 3 * Math.PI * (raio * raio * raio));
    }

    public static double q4qui(int a, int b, double c) {
        return ((b - a) / c);
    }

    public static void q5dumb(double a, double b, FileWriter arquivo) throws IOException {
        PrintWriter g = new PrintWriter(arquivo);
        g.printf("%nA soma é: " + (a + b));
        g.printf("%nA subtração é: " + (a - b));
        if (b == 0) {
            g.printf("%nErro!, divisão por zero");
        } else {
            g.printf("%nA divisão é: " + (a / b));
        }
        g.printf("%nA multiplicação é: " + (a * b));
    }

    public static double q6media(double a, double b) {
        return (a + b) / 2;
    }

    public static double[] q7sala(double[] fs) {
        int a = fs.length;
        double volta[] = new double[2];
        double media = 0;
        for (int c = 0; c < a; c++) {
            media += fs[c];
        }
        volta[0] = media;
        volta[1] = media / a;
        return volta;
    }

    public static double[][] q8com(double[][] vcom) {
        int a = vcom.length;
        for (int c = 0; c < a; c++) {
            vcom[1][c] = (vcom[1][c] * 0.0816);
        }
        return vcom;
    }

    public static double[][] q9leao(double[][] vcom) {
        int a = vcom.length;
        for (int c = 0; c < a; c++) {
            vcom[1][c] = vcom[1][c]-(vcom[1][c] * 0.05);
        }
        return vcom;
    }

    public static void burblesort(double a[][]) {
        int b = a.length;
        for (int c = 0; c < b; c++) {
            for (int q = c + 1; q < b; q++) {
                if (a[1][q] < a[1][c]) {
                    double aux1 = a[0][q];
                    double aux2 = a[1][q];
                    a[0][q] = a[0][c];
                    a[1][q] = a[1][c];
                    a[0][c] = aux1;
                    a[1][c] = aux2;
                }
            }
        }
    }

    public static int[] q10imc(double[][] pe) {
        int cat[] = new int[8];
        int a = pe.length, b = cat.length, c;
        for (c = 0; c < b; c++) {
            cat[c] = 0;
        }
        for (c = 0; c < a; c++) {
            double aux = pe[c][0] / (pe[c][1] * pe[c][1]);

            if (aux < 16) {
                cat[0]++;
            } else if ((aux >= 16) && (aux < 17)) {
                cat[1]++;
            } else if ((aux >= 17) && (aux < 18.5)) {
                cat[2]++;
            } else if ((aux >= 18.5) && (aux < 25)) {
                cat[3]++;
            } else if ((aux >= 25) && (aux < 30)) {
                cat[4]++;
            } else if ((aux >= 30) && (aux < 35)) {
                cat[5]++;
            } else if ((aux >= 35) && (aux < 40)) {
                cat[6]++;
            } else {
                cat[7]++;
            }
        }
        return cat;
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter s = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat t = new DecimalFormat("#.00");
        FileWriter arquivo = new FileWriter("e:\\TrabalhoFuncoesProfGiovan.txt");
        PrintWriter g = new PrintWriter(arquivo);
        //questão 1
        g.printf("%nQuestao 1: %n");
        int a = ri(100);
        double questao1[] = new double[a];
        for (int c = 0; c < a; c++) {
            questao1[c] = Math.ceil(rr(1000));
            g.printf("%nPosicao: " + c + " / numero: " + questao1[c]);
        }
        g.printf("%nA media da primeira é: " + q1vnu(questao1));

        //questão 2
        g.printf("%n%nQuestao 2: %n");
        int choiced = ri(99999999);
        g.printf("%nNúmero escolhido: " + choiced);
        boolean rq2 = q2vf(choiced);
        if (rq2) {
            g.printf("%nE ele é par.");
        } else {
            g.printf("%nE ele é impar.");
        }

        //questão 3
        g.printf("%n%nQuestao 3: %n");

        double raio = Math.ceil(rr(100));

        g.printf("%nO valor do raio é: " + raio + "%n");
        g.printf("O valor do volume é : " + q3cv(raio));

        //questão 4
        g.printf("%n%nQuestao 4: %n");

        int qi = ri(1000);
        int qf;

        do {
            qf = ri(100000);
        } while (qf <= qi);

        double li = Math.ceil(ri(1000));

        g.printf("%nA quilometragem inicial, final e quantidade de gasolina são, respectivamente: " + qi + ", " + qf + " e " + li + ".%n");
        g.printf("O consumo medio é " + q4qui(qi, qf, li) + "%n");

        //questão 5
        g.printf("%n%nQuestao 5: %n");

        double nu1 = Math.ceil(rr(99999));
        double nu2 = Math.ceil(rr(99999));

        g.printf("%nOs numeros doubles escolhidos foram: " + nu1 + " e " + nu2 + ".%n");

        q5dumb(nu1, nu2, arquivo);
        
        //questão 6
        g.printf("%n%nQuestao 6: %n");
        
        double tr = Math.ceil(rr(10));
        double pr = Math.ceil(rr(10));
        
        g.printf("%nNota do trabalho: " + tr + "%nNota da prova: " + pr + "%n");
        
        double me = q6media(tr, pr);
        
        if (me >= 10) {
            g.printf("%nA média é 10.00%n");
        } else {
            g.printf("%nA média é " + t.format(me) + "%n");
        }
        
        //questão 7
        g.printf("%n%nQuestao 7: %n");
        
        double funcsala[] = new double[NP];
        
        for (int c = 0; c < NP; c++) {
            funcsala[c] = Math.ceil(rr(6999)+1000);
            g.printf("%nFuncionario " + (c + 1) + ": R$"+funcsala[c]);

        }
        
        double volta[] = q7sala(funcsala);
        
        g.printf("%n%nO total a ser pago: " + (volta[0]) + ", e a media dos salarios é: " + (volta[1]) + "\n");
        
        //questão 8
        g.printf("%n%nQuestao 8: %n");
        g.printf("%nValor total das vendas por mes:%n");
        
        double vendas[][] = new double[12][12];
        
        int q = vendas.length;
        
        for (int c = 0; c < q; c++) {
            vendas[0][c] = c + 1;
            
            vendas[1][c] = Math.ceil(rr(6999) + 1000);
            g.printf("%nMes " + (c + 1) + ": R$" + vendas[1][c]);
        }
        
        q8com(vendas);
        
        g.printf("%n%nValores pagos de comissão por mes:%n");
        
        for (int c = 0; c < q; c++) {
            g.printf("%nMes: " + vendas[0][c] + " / Total da comissão: " + t.format(vendas[1][c]));
        }
        
        burblesort(vendas);
        
        g.printf("%n%nValores pagos de comissão do menor para o maior:%n");
       
        for (int c = 0; c < q; c++) {
            g.printf("%nMes: " + (int)vendas[0][c] + " / Total da comissão: " + t.format(vendas[1][c]));
        }
        
        //questão 9
        g.printf("%n%nQuestao 9: %n");
        
        q9leao(vendas);
        
        g.printf("%nOs valores que os funcionarios pagaram de imposto é: %n");
        
        for (int c = 0; c < q; c++) {
            g.printf("%nMes: " + (int)vendas[0][c] + " / Valor liquido é: " + t.format(vendas[1][c]));
        }
        
        //questão 10
        g.printf("%n%nQuestao 10: %n");
        g.printf("%nO peso das pessoas:");
        
        double pesope[][] = new double[NP][2];
        
        for (int c = 0; c < NP; c++) {
            pesope[c][0] = Math.ceil(rr(89) + 50);
            pesope[c][1] = rr(1) + 0.3;
            g.printf("%nPessoa: " + (c + 1) + " / Peso: " + pesope[c][0] + " / Altura: " + pesope[c][1]);
        }
        
        int categoria[] = q10imc(pesope);
        
        g.printf("%n%n" + categoria[0] + " pessoas com magreza grave,%n" + categoria[1] + " pessoas com magreza moderada,%n" + categoria[2] + " pessoas com magreza leve,%n" + categoria[3] + " pessoas com saudável,%n" + categoria[4] + " pessoas com sobrepeso,%n" + categoria[5] + " pessoas com obesidade grau 1,%n" + categoria[6] + " pessoas com obesidade grau 2%ne " + categoria[7] + " pessoas com obesidade grau 3.%n");
        arquivo.close();
    }
}
