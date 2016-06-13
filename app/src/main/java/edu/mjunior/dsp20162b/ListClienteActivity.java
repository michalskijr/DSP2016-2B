package edu.mjunior.dsp20162b;

import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import edu.mjunior.dsp20162b.model.Cliente;
import edu.mjunior.dsp20162b.service.ClienteService;

@EActivity(R.layout.activity_list_cliente)
public class ListClienteActivity extends AppCompatActivity {

    private List<Cliente> clientes;

    @ViewById(R.id.lvClientes)
    ListView lvClientes;

    public void

    @UiThread
    @AfterViews
    public void init () {

        ClienteService cs = new ClienteService_(this);
        clientes = cs.getClientes();

        ArrayAdapter<Cliente> aaClientes =
                new ArrayAdapter<Cliente>(this, android.R.layout.simple_list_item_1, clientes);

        lvClientes.setAdapter(aaClientes);
    }

}
