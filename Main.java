public class Main {

    public static void main(String[] args) {
        EventoMudancaSenha eventoUm = new EventoMudancaSenha("568474992");
        EventoTranferenciaConta eventoDois = new EventoTranferenciaConta("8864974485");
        EventoFaltaPagamento eventoTres = new EventoFaltaPagamento("85964752");
        EventoPagamentoRecebido eventoQuatro = new EventoPagamentoRecebido("8864749815");

        Evento[] eventos = {eventoUm, eventoDois, eventoTres, eventoQuatro};

        for (Evento e : eventos) {
            System.out.println(e.obterRegistroHora());
            e.processo();
            System.out.println();
        }
    }
}