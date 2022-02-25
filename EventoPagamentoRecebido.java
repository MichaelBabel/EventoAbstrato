public class EventoPagamentoRecebido extends EventoAbstrato {

    public EventoPagamentoRecebido(String id) {
        super(id);
    }

    @Override
    public void processo() {
        System.out.println("Cliente" + id + " realizou o pagamento." +
                " Enviando comprovante para o endereço de email cadastrado.");
    }
}