public class EventoTranferenciaConta extends EventoAbstrato {

    public EventoTranferenciaConta(String id) {
        super(id);
    }

    @Override
    public void processo() {
        System.out.println("Cliente " + id + " transferência de serviço." +
                " Enviando aviso ao Controle para remover serviço do antigo" +
                " aparelho e adicionar o serviço no novo aparelho.");
    }
}