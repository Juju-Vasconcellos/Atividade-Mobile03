package br.com.julieta.atividade03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.julieta.atividade03.modelos.Aluno;


public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.AlunoViewHolder> {

    private List<Aluno> localDataSet;
    private AlunoViewHolder holder;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class AlunoViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;
        private final ImageView imageView;
        private View view;
        private int position;

        public AlunoViewHolder(View view) {
            super(view);
            this.view = view;
            textView = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }

        public void setPosition(int position) {
            this.position = position;
        }

    }

    public MeuAdapter(List<Aluno> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public AlunoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.aluno_row_item, viewGroup, false);
        holder = new AlunoViewHolder(view);
        return holder;
    }

    public AlunoViewHolder getHolder() {
        return holder;
    }

    @Override
    public void onBindViewHolder(AlunoViewHolder viewHolder, final int position) {

        viewHolder.getTextView().setText(localDataSet.get(position).getNome());
        String url = localDataSet.get(position).getImagemURL();
        viewHolder.setPosition(position);
        //Picasso.get().load(url).fit().into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}

