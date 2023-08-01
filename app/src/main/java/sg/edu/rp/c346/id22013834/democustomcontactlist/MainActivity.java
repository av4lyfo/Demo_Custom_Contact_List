package sg.edu.rp.c346.id22013834.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the ListView
        ListView lvContact = findViewById(R.id.listViewContacts);

        // Create an empty ArrayList to hold contacts
        ArrayList<Contact> alContactList = new ArrayList<>();

        // Create some sample contacts
        Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        Contact item2 = new Contact("Ken", 65, 7654321, 'M');

        // Add contacts to the ArrayList
        alContactList.add(item1);
        alContactList.add(item2);

        // Create the custom adapter, passing context, layout resource, and data
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, alContactList);

        // Bind the adapter to the ListView

        lvContact.setAdapter(adapter);
    }
}
