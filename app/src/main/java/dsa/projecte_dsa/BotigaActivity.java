package dsa.projecte_dsa;



import static dsa.projecte_dsa.Classes.Botiga.getImatgeCamiseta;

import com.squareup.picasso.Picasso;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import dsa.projecte_dsa.Classes.Botiga;

public class BotigaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botiga);

        //Obtenir la llista d'articles de la botiga
        List<Botiga> articles = Botiga.getCamiseta();



        // Referències als elements del layout
        ImageView imageView1 = findViewById(R.id.imageView1);
        TextView descripcio1 = findViewById(R.id.descripcio1);
        TextView preu1 = findViewById(R.id.preu1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        TextView descripcio2 = findViewById(R.id.descripcio2);
        TextView preu2 = findViewById(R.id.preu2);

        ImageView imageView3 = findViewById(R.id.imageView3);
        TextView descripcio3 = findViewById(R.id.descripcio3);
        TextView preu3 = findViewById(R.id.preu3);

        ImageView imageView4 = findViewById(R.id.imageView4);
        TextView descripcio4 = findViewById(R.id.descripcio4);
        TextView preu4 = findViewById(R.id.preu4);

        // Obtenir la URL de la imatge
        String urlImatge1 = getImatgeCamiseta(articles, 1);
        String urlImatge2 = getImatgeCamiseta(articles, 2);
        String urlImatge3 = getImatgeCamiseta(articles, 3);
        String urlImatge4 = getImatgeCamiseta(articles, 4);

        // Carregar la imatge amb Picasso
        Picasso.get().load(urlImatge1).into(imageView1);
        Picasso.get().load(urlImatge2).into(imageView2);
        Picasso.get().load(urlImatge3).into(imageView3);
        Picasso.get().load(urlImatge4).into(imageView4);


        // Establir la descripció de l'article
        descripcio1.setText("Descripció de l'article 1");
        descripcio2.setText("Descripció de l'article 2");
        descripcio3.setText("Descripció de l'article 3");
        descripcio4.setText("Descripció de l'article 4");







        /*
        // Obtenir la llista d'articles de la botiga
        List<Botiga> articles = Botiga.getCamiseta();

        // Obté el layout on vols afegir els articles
        LinearLayout layoutBotiga = findViewById(R.id.layout_botiga);

        // Recorre la llista d'articles i crea vistes per a cada un
        for (Botiga article : articles) {
            // Crea una nova vista per a l'article
            LinearLayout articleLayout = new LinearLayout(this);
            articleLayout.setOrientation(LinearLayout.HORIZONTAL);

            // Crea una imatge per a l'article
            ImageView imageView1 = new ImageView(this);
            // Carrega la imatge des de la URL utilitzant Picasso
            Picasso.get().load(article.getImatge()).into(imageView1;

            // Crea una vista de text per a la descripció i el preu de l'article
            TextView textView1 = new TextView(this);
            String descripcioPreu = article.getDescripció() + " - Preu: " + article.getPreu() + "€";
            textView1.setText(descripcioPreu);

            // Afegeix les vistes al layout de l'article
            articleLayout.addView(imageView1);
            articleLayout.addView(textView1);

            // Afegeix l'article layout al layout de la botiga
            layoutBotiga.addView(articleLayout);*/
        }
    }
}

