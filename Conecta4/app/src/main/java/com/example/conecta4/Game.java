package com.example.conecta4;

public class Game {
    static final int nFilas = 6;
    static final int nColumnas = 7;
    static final int vacio = 0;
    static final int maquina = 1;
    static final int jugador = 2;
    static final String maqGana = "1111";
    static final String jugaGana = "2222";

    private int turno=jugador;
    private char estado;
    public int tablero[][];

    public Game(int jugador){
        tablero = new int[nFilas][nColumnas];
        for (int i = 0; i< nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                tablero[i][j] = vacio;
            }
        }
        this.estado='J';
        this.turno = jugador;
    }

    public void cambiarTurno() {
        if(turno == jugador) {
            setTurno(maquina);
        } else {
            setTurno(jugador);
        }
    }

    public boolean actualizaTablero(Coordenada coordenada){
        int fila = coordenada.getFila();
        int columna = coordenada.getColumna();
        if(tablero[fila][columna] == vacio){
            tablero[fila][columna] = getTurno();
            return true;
        }
        return false;
    }

    public int filSelect(int columna) {
        int i = nFilas - 1;
        int fil = -1;
        boolean lsel = false;
        while (i >= 0 && !lsel){
            if(tablero[i][columna] == vacio){
                fil = i;
                lsel = true;
            }
            i--;
        }
        return fil;
    }

    public boolean colCompleta(int columna){
        boolean lcompleta = false;

        if(tablero[0][columna]!=vacio){
            lcompleta=true;
        }
        return lcompleta;
    }

    public String fila(Coordenada coordenada){
        String cadena="";
        int f = coordenada.getFila();
        int c;
        for(c=0;c<nColumnas;c++){
            cadena+= Integer.toString(tablero[f][c]) ;
        }
        return cadena;
    }


    public String columna(Coordenada coordenada) {
        String cadena = "";
        int c = coordenada.getColumna();
        int f;
        for (f = 0; f < nFilas; f++) {
            cadena += Integer.toString(tablero[f][c]);
        }
        return cadena;
    }

    public String diagonal1(Coordenada coordenada){
        String cadena = "";
        int c = coordenada.getColumna();
        int f = coordenada.getFila();
        int i = f - Math.min(f,c);
        int j = c- Math.min(f,c);
        while (i<nFilas && j<nColumnas){
            cadena += Integer.toString(tablero[i][j]);
            i++;
            j++;
        }
        return cadena;
    }

    public String diagonal2(Coordenada coordenada){
        String cadena = "";
        int c = 0;
        int f = 0;
        for(f=0; f<nFilas; f++){
            for(c=0; c<nColumnas; c++){
                if(f + c == coordenada.getFila() + coordenada.getColumna()){
                    cadena += Integer.toString(tablero[f][c]);
                }
            }
        }
        return cadena;
    }

    public String tableroToString(){
        String str="";
        for (int i= 0; i<nFilas;i++){
            for (int j= 0; j<nColumnas;j++){
                str+= tablero[i][j];
            }
        }
        return str;
    }

    public void stringToTablero(String str){
        int contador = 0;
        for(int i = 0; i<nFilas;i++){
            for (int j = 0; j < nColumnas; j++) {
                tablero[i][j] = Integer.parseInt(String.valueOf(str.charAt(contador)));
                contador++;
            }
        }
    }

    public int jugadaGanadora(Coordenada coordenada){
        int resultado = -1;
        if (this.estado=='G') return -1;
        String patron = this.getTurno() == maquina ? maqGana:jugaGana;
        if(fila(coordenada).contains(patron)){
            resultado=0;
        }
        if(columna(coordenada).contains(patron)){
            resultado=1;
        }
        if(diagonal1(coordenada).contains(patron)){
            resultado=2;
        }
        if(diagonal2(coordenada).contains(patron)){
            resultado=3;
        }
        return resultado;
    }



    public int getTurno() {
        return turno;
    }

    public static int getNFILAS() {
        return nFilas;
    }

    public static int getNCOLUMNAS() {
        return nColumnas;
    }

    public static int getVACIO() {
        return vacio;
    }

    public static int getMAQUINA() {
        return maquina;
    }

    public static int getJUGADOR() {
        return jugador;
    }

    public static String getMaqGanador() {
        return maqGana;
    }

    public static String getJugGanador() {
        return jugaGana;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }


}
