package com.example.t24_graphics;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class FaceView extends View {

    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint yellow = new Paint(); // face
        yellow.setARGB(255, 255, 255, 0);
        yellow.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(100, 100, 300, 300), yellow);

        Paint blue = new Paint(); // eyes
        blue.setARGB(255, 0, 0, 255); 	blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(140, 140, 170, 170), blue);
        canvas.drawOval(new RectF(230, 140, 260, 170), blue);

        Paint black = new Paint(); // nose
        black.setARGB(255, 0, 0, 0); 	black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(190, 180, 210, 200), black);

        Paint red = new Paint(); // mouth
        red.setARGB(255, 255, 0, 0); red.setStyle(Paint.Style.FILL_AND_STROKE);
        //canvas.drawRect(170, 230, 230, 250, red);
        canvas.drawArc(170,230,230,250,0,180,false, red);

}
}
