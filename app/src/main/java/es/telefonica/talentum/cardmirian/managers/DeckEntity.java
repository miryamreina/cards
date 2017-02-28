package es.telefonica.talentum.cardmirian.managers;


import com.google.gson.annotations.SerializedName;

public class DeckEntity {



    @SerializedName("remaining") private int remaining;
    @SerializedName("deck_id") private String deckId;
    @SerializedName("success") private boolean success;
    @SerializedName("shuffled") private boolean shuffled;

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }




    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }



    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isShuffled() {
        return shuffled;
    }

    public void setShuffled(boolean shuffled) {
        this.shuffled = shuffled;
    }
}
