package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Main Activity Created");

//        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
//        boolean followed =
        User user = new User(false);

        TextView title = findViewById(R.id.title);
        title.setText("Hello World!");

        TextView lorem = findViewById(R.id.lorem);
        lorem.setText("Lorem ipsum dolor, sit amet consectetur adipisicing elit. Unde facere aliquid quaerat enim excepturi, hic suscipit quam blanditiis eum laborum vero, iure, mollitia recusandae architecto quod porro aperiam rem eveniet.");

        Button followBtn = findViewById(R.id.follow_btn);
        followBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                user.setFollowed(!user.isFollowed());
                followBtn.setText(user.isFollowed()
                        ? "UNFOLLOW"
                        : "FOLLOW"
                );
            }
        });
    }
}