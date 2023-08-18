import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        c1.cadastrar(97865 - 4, "Luan", 004);
        c1.depositar(1000);
        System.out.println("Saldo: " + c1.ConsultarSaldo());
        c1.sacar(2000);
        System.out.println("Saldo: " + c1.ConsultarSaldo());
    }
    }