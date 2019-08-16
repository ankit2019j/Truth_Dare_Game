package ankit.com.a10_truthdare;

import android.graphics.Path;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView image;
    private int lastdirection;
    private Random random= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        image=findViewById(R.id.imageView);

    }
    public void spin(View view){
        int newdirection=random.nextInt(3600);

        float pivotx=image.getWidth()/2;
        float pivoty=image.getHeight()/2;

        Animation rotate=new RotateAnimation(lastdirection,newdirection,pivotx,pivoty);
        rotate.setDuration(2000);
        rotate.setFillAfter(true);


        image.startAnimation(rotate);



    }
}
