public class EventoMudancaSenha extends EventoAbstrato {

    public EventoMudancaSenha(String id) {
        super(id);
    }

    @Override
    public void processo() {
        System.out.println("Cliente " + id + " trocou o seu password. " +
                "Enviando confirmação para o endereço de email cadastrado.");
    }
}