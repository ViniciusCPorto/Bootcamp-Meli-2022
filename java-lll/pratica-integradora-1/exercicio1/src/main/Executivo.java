package main;

import java.math.BigDecimal;
import java.util.Locale;

public class Executivo extends ByteBank {

    public Executivo(String name, BigDecimal balance) {
        super(balance, name,"1 - DEPOSITO\n2 - TRANSFERENCIA\nEscreva o serviço deseja realizar ao invés de inserir o número.");
    }

    @Override
    public void metodoTransferencia(String type) {
        if(type.toUpperCase(Locale.ROOT).equals("DEPOSITO")) calculation(type);
        if(type.toUpperCase(Locale.ROOT).equals("TRANSFERENCIA")) calculation(type);
    }

}
