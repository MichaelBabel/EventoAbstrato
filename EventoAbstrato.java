import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public abstract class EventoAbstrato implements Evento {

    protected Long criarRegistroHora;
    protected String id;

    public EventoAbstrato(String id) {
        this.criarRegistroHora = new Timestamp(System.currentTimeMillis()).getTime();

        this.id = id;
    }

    @Override
    public Long obterRegistroHora() {
        return this.criarRegistroHora;
    }

    public abstract void processo();
}