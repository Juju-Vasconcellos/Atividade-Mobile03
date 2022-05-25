package br.com.julieta.atividade03;

import android.os.Bundle;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import br.com.julieta.atividade03.modelos.Aluno;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcView;

    private URL []urls = new URL[10];
    private List<Aluno> alunos;
    private String[] sUrls = {
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-5.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-9.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-10.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-10.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-11.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-12.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-13.jpg",
            "https://icon-library.com/images/avatar-icon-images/avatar-icon-images-14.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        rcView = findViewById(R.id.rvAlunos);
        rcView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        alunos = criaListaAlunos();
        rcView.setAdapter(new MeuAdapter(alunos));
        rcView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                MeuAdapter adapter = (MeuAdapter) rv.getAdapter();
                Integer pos = adapter.getHolder().getLayoutPosition();
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }


    private List<Aluno> criaListaAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Julieta", 1l, sUrls[0]));
        alunos.add(new Aluno("Givanildo", 2l, sUrls[1]));
        alunos.add(new Aluno("José", 3l, sUrls[2]));
        alunos.add(new Aluno("Pedro", 4l, sUrls[3]));
        alunos.add(new Aluno("João", 5l, sUrls[4]));
        alunos.add(new Aluno("Quitéria", 6l, sUrls[5]));
        alunos.add(new Aluno("Jocasta", 7l, sUrls[6]));
        return alunos;
    }

}