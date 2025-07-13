package org.edu.ifsc.Java_Grid_F1;

import org.apache.commons.lang3.StringUtils;

public class FormatadorRelatorios {

    private static final int LARGURA_TOTAL = 110;
    private static final String LINHA_DIVISORIA = StringUtils.repeat("-", LARGURA_TOTAL);

    //formatos para diferentes números de colunas
    private static final String FORMATO_2COLUNAS = "| %-30s | %-72s |";
    private static final String FORMATO_3COLUNAS = "| %-8s | %-30s | %-10s |";
    private static final String FORMATO_5COLUNAS = "| %-5s | %-8s | %-25s | %-20s | %-8s |";

    public static void cabecalho(String titulo) {
        System.out.println(LINHA_DIVISORIA);
        System.out.println(StringUtils.center(titulo, LARGURA_TOTAL));
        System.out.println(LINHA_DIVISORIA);
    }

    //metodos para 2 colunas (equipes e pilotos)
    public static void cabecalho2Colunas(String col1, String col2) {
        System.out.printf(FORMATO_2COLUNAS + "%n", col1, col2);
        System.out.println(LINHA_DIVISORIA);
    }

    public static void linha2Colunas(Object col1, Object col2) {
        System.out.printf(FORMATO_2COLUNAS + "%n",
                truncar(col1.toString(), 30),
                truncar(col2.toString(), 72));
    }

    // Métodos para 3 colunas (construtores)
    public static void cabecalho3Colunas(String col1, String col2, String col3) {
        System.out.printf(FORMATO_3COLUNAS + "%n", col1, col2, col3);
        System.out.println(LINHA_DIVISORIA);
    }

    public static void linha3Colunas(Object col1, Object col2, Object col3) {
        System.out.printf(FORMATO_3COLUNAS + "%n",
                truncar(col1.toString(), 8),
                truncar(col2.toString(), 30),
                truncar(col3.toString(), 10));
    }

    //metodos para 5 colunas (resultados de corrida)
    public static void cabecalho5Colunas(String col1, String col2, String col3, String col4, String col5) {
        System.out.printf(FORMATO_5COLUNAS + "%n", col1, col2, col3, col4, col5);
        System.out.println(LINHA_DIVISORIA);
    }

    public static void linha5Colunas(Object col1, Object col2, Object col3, Object col4, Object col5) {
        System.out.printf(FORMATO_5COLUNAS + "%n",
                truncar(col1.toString(), 5),
                truncar(col2.toString(), 8),
                truncar(col3.toString(), 25),
                truncar(col4.toString(), 20),
                truncar(col5.toString(), 8));
    }

    private static String truncar(String texto, int tamanho) {
        if (texto == null) return "";
        return texto.length() > tamanho ? texto.substring(0, tamanho - 3) + "..." : texto;
    }

    public static void rodape() {
        System.out.println(LINHA_DIVISORIA);
        System.out.println();
    }
}