/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class TestaConta {

    public static void main(String[] args) {
        
        //criando um objeto
        Conta c1 = new Conta();
        c1.saldo = 9999;
        c1.titular = "John Herbert";
        c1.agencia = "1234";
        c1.numero = "5432";
        
        System.out.println("Saldo de c1: "+ c1.saldo);
        
        Conta c2 = new Conta();
        c2.saldo = 500;
        c2.titular = "Michael Faleiro";
        c2.agencia = "007";
        c2.numero = "4567";
        
        
        

    }

}
