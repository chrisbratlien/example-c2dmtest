package com.example.c2dmtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.c2dm.C2DMessaging;


public class c2dmTest extends Activity {
    /** Called when the activity is first created. */
	
	private boolean updateStatus() {
		/////SharedPreferences prefs = Prefs.get(this);
		return false;
	}
	
	

	public void handleRegistration(Context context, Intent intent) {
	  Bundle b = intent.getExtras();
	  String id = b.getString("registration_id");
		
	  if (b.getString("error") != null) {
	    // Registration failed.  Try again later, with backoff.
	  } else if (id != null) {
	    // Send the registration ID to the app’s server.
	    // Be sure to do this in a separate thread.
	  }
	}	
	
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //TextView tv = new TextView(this);
        //tv.setText("Hello, Android. Now go fuck off!");
		Log.d("MEH","MEH");
        Log.d("MEH",Config.C2DM_SENDER);

        /////final Button registerButton = (Button) findViewById(R.id.button_id);
        
        ///setContentView(tv);
  
        C2DMessaging.register(getApplicationContext(), Config.C2DM_SENDER);
        
  
     /*   
     // Registration ID is compartmentalized per app/device
        Intent regIntent = new Intent(
                "com.google.android.c2dm.intent.REGISTER");
        // Identify your app
        regIntent.putExtra("app",
                PendingIntent.getBroadcast(this, 
                    0, new Intent(), 0));
        // Identify role account server will use to send
        regIntent.putExtra("sender", emailOfSender);
        // Start the registration process
        startService(regIntent);
*/
        
        
        
		///updateStatus();
    }
}