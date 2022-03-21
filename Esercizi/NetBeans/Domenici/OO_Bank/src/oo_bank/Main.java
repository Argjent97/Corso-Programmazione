/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo_bank;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        ContoCorrenteConEstrattoConto cc = new ContoCorrenteConEstrattoConto("Argjent");
        cc.deposito(400);
        cc.prelievo(250);
        System.out.println("intestatario: " + cc.getIntestatario() + " saldo: " + cc.getSaldo());
        System.out.println(cc.getMovimenti());
    }

}
