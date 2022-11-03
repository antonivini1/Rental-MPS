import java.util.Iterator;

public class ExpensesStatement {

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator rents = tapesRented.iterator();
        String resultad = "Registro de Alugueis de " + getNome() + fimDeLinha;
        while(alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Rent cada = (Rent)alugueis.next();

            // determina valores para cada linha
            switch(cada.getTape().getPriceCode()) {
                case Tape.NORMAL:
                    valorCorrente += 2;
                    if(cada.getDiasAlugada() > 2) {
                        valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                    }
                    break;
                case Tape.LANCAMENTO:
                    valorCorrente += cada.getDiasAlugada() * 3;
                    break;
                case Tape.INFANTIL:
                    valorCorrente += 1.5;
                    if(cada.getDiasAlugada() > 3) {
                        valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            } //switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para Rent de um lan�amento por pelo menos 2 dias
            if(cada.getTape().getPriceCode() == Tape.LANCAMENTO &&
                    cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este Rent
            resultado += "\t" + cada.getTape().getTitle() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodap�
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
}
