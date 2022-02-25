public class EventoFaltaPagamento extends EventoAbstrato {

    public EventoFaltaPagamento(String id) {
        super(id);
    }

    @Override
    public void processo() {
        System.out.println("Cliente " + id + " não realizou o pagamento. " +
                "Enviando novamente a fatura para o cliente.");
    }
}