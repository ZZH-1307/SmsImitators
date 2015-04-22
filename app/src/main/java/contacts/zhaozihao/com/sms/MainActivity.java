package contacts.zhaozihao.com.sms;

import android.app.Activity;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    Button send;
    EditText phone;
    EditText body;
    String strbody,strphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = (EditText) findViewById(R.id.phone);
        body = (EditText) findViewById(R.id.body);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strphone = phone.getText().toString().replace(" ","");
                strbody = body.getText().toString().trim();
                if(strphone.equals("")){
                    Toast.makeText(MainActivity.this,"您输入的号码不对哦",Toast.LENGTH_SHORT).show();
                }else if(strbody.equals("")){
                    Toast.makeText(MainActivity.this,"快点输入你要模仿的内容吧",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"您的短信5秒后就会发送到你的手机,请注意查收",Toast.LENGTH_SHORT).show();
                    send(strphone,strbody);
                }

            }
        });
    }

    public void send(final String strphone, final String strbody){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(5 *1000);
                Uri uri = Uri.parse("content://sms/");
                ContentValues values = new ContentValues();
                values.put("address",strphone);
                values.put("type","1");
                values.put("body",strbody);
                getContentResolver().insert(uri,values);

            }
        }).start();


    }

}
