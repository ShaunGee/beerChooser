package com.example.beerchooser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // event listener that is called when the find beer button is clicked
    public void findBeer(View view) {

        TextView beerInfo = (TextView) findViewById(R.id.beerInfo);

        //The following two lines of code grab the current value from the spinner, convert it to a
        //string and assign it to the beerChoice variable
        Spinner beerChoiceSpinner = (Spinner) findViewById(R.id.beerChoice);
        String beerChoice = String.valueOf(beerChoiceSpinner.getSelectedItem());


        //This switch statement goes through the beerChoice and executes the relevant case.
        //When a match is made, the function beer info is called where the beer is passed through
        //as a string. The function returns the beer description which is than printed into
        //beerInfo which is the Textview on the mobile app.
        switch (beerChoice) {

            case "Summers":

                beerInfo.setText(getBeerInfo("Summers"));

                break;

            case "Northern":
                beerInfo.setText(getBeerInfo("Northern"));

                break;

            case "Corona":

                beerInfo.setText(getBeerInfo("Corona"));

                break;

            case "Toohys":

                beerInfo.setText(getBeerInfo("Toohys"));

                break;

            case "VB":

                beerInfo.setText(getBeerInfo("VB"));

                break;

            //default is called if an invalid choice is chosen from the spinner. The description
            //that is returned asks the user to choose a beer from the list.
            default:

                beerInfo.setText(getBeerInfo("Unknown"));

        }

    }


    // The function below contains all the beer information. It takes a string as a parameter,
    // compares and chooses the right description through a simple if-else statement and returns
    // the relevant description.
    public String getBeerInfo(String beerName) {
        String description = "";

        String summers = "Brewed with all pale malts for a light gold colour, and a smooth, " +
                "refreshing taste, Byron Bay Brewery Premium Lager is perfect for sunny afternoons";

        String northern = "Great Northern Brewing Co. lager was brewed with an outdoor lifestyle " +
                "in mind. Brewed in Queensland using a light stable hop to avoid the impact of " +
                "sunlight, pale malt and lager yeast to produce a fruity, clean, refreshing lager. " +
                "With its fruity aroma, low bitterness and clean, crisp finish, it’s the ultimate " +
                "refreshment for the Great Northern conditions.";

        String corona = "Corona is lighter in style than traditional beers, with a crisp and " +
                "refreshing taste, imported from Mexico. This lighter style, dry beer has pleasant " +
                "malt and hop notes, with a round dry finish. Regardless of the time of year, " +
                "Corona is best served ice cold, with a wedge of lime that complements and " +
                "intensifies the flavour through the palate.";

        String toohys = "The Tooheys brothers’ pursuit of refreshing beers suited to the " +
                "Australian climate was embodied by the clean, crisp taste of Tooheys Extra " +
                "Dry. Now our skilled brewers have revisited the TED recipe to create a new " +
                "brew that is even cleaner and crisper but the epitome of refreshment. They’ve " +
                "worked their magic behind the scenes so the new TED has 30% less carbs than " +
                "regular beer and 25% less calories. A refreshed taste calls for a refreshed " +
                "appearance so you’ll notice a new look for your favourite beer too. STYLE A " +
                "highly refreshing dry lager with low bitterness and a light malt body.";

        String vb = "Victoria Bitter is a full flavoured, full strength beer; the " +
                "gentle fruitiness of the aroma complements the sweet maltiness " +
                "in the mouth which in turn balances perfectly with the clean hop bitterness" +
                " of the finish. The perfect beer to satisfy a hard earned thirst.";

        String unknown = "Tap the drop down list above to choose from a selection of beers";


        if (beerName == "Summers") {
            description = summers;
        } else if (beerName == "Northern") {
            description = northern;
        } else if (beerName == "Corona") {
            description = corona;
        } else if (beerName == "Toohys") {
            description = toohys;
        } else if (beerName == "VB") {
            description = vb;
        } else {
            description = unknown;
        }

        return description;
    }


}