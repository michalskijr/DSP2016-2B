package edu.mjunior.dsp20162b;

import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.util.List;

import edu.mjunior.dsp20162b.model.Cliente;
import edu.mjunior.dsp20162b.service.ClienteService;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @AfterViews
    public void inicio () {

    }

    @Background
    public void salvar (Cliente c) {
        ClienteService cs = new ClienteService_(this);

        cs.setCliente(c);
    }

    @Background
    public void getClientes () {
        ClienteService cs = new ClienteService_(this);
        List<Cliente> clientes = cs.getClientes();

        Log.d("TEST", clientes.toString());
    }

    @Background
    public void getClientesClick () {
        getClientes();
    }

    @UiThread
    @Click(R.id.btnSalvar)
    public void salvarClick () {
        salvar(getCliente());
        limparForm();
    }
}