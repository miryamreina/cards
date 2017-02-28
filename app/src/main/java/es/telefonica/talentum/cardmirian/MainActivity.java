package es.telefonica.talentum.cardmirian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import es.telefonica.talentum.cardmirian.managers.CardApiMAnager;
import es.telefonica.talentum.cardmirian.managers.DeckApiManager;
import es.telefonica.talentum.cardmirian.model.Card;
import es.telefonica.talentum.cardmirian.model.Deck;

public class MainActivity extends AppCompatActivity {
    private ImageView cardImage;
    private Deck deck;
    private TextView numberOfCardsInCardInDeck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardImage = (ImageView) findViewById(R.id.activity_main___card_image);
        numberOfCardsInCardInDeck = (TextView) findViewById(R.id.activity_main___card_left_text);



        DeckApiManager apiManager = new DeckApiManager();
        apiManager.setOnNewDeckListener(new DeckApiManager.DeckApiManagerNewDeckListener() {
            @Override
            public void onNewDeck(Deck deckJson) {
                numberOfCardsInCardInDeck.setText(""+deckJson.getRemaining());
                deck = deckJson;

            }
        });

        apiManager.newDeck(this);

        cardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                CardApiMAnager apiManager = new CardApiMAnager();
                apiManager.setOnNewCardListener(new CardApiMAnager.CardApiManagerNewCardListener() {
                    @Override
                    public void onNewCard(Card card) {
                        Picasso.with(view.getContext()).load(card.getImage()).into(cardImage);
                        numberOfCardsInCardInDeck.setText(""+card.getRemainingCard());

                    }
                });

                apiManager.newCard(view.getContext(),deck);



            }
        });


    }
}
