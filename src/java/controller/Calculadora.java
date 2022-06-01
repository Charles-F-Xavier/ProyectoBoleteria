/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author jr972
 */
public class Calculadora {
    private int x;
    private int y;

    public Calculadora(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Calculadora() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int Sumar(){
        return x+y;
    }
}
