/*
 */
package com.google.android.c2dm;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


/**
 * Helper class to handle BroadcastReciver behavior.
 * - can only run for a limited amount of time - it must start a real service 
 * for longer activity
 * - must get the power lock, must make sure it's released when all done.
 * 
 */
public class C2DMBroadcastReceiver extends BroadcastReceiver {
    
    @Override
    public final void onReceive(Context context, Intent intent) {
    	Log.d("TEST","ffY");

		  String action = intent.getAction();
		  if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
		    	Log.d("BRECV","YAAAAAAAAAAAAAAAAAAAAY");
		        // To keep things in one place.
		    	
		    	String rid = intent.getExtras().getString("registration_id");		    	
		    	Log.d("BRECV-RID",rid);
		  
		  }
    	
    	
    	
    	// To keep things in one place.
        C2DMBaseReceiver.runIntentInService(context, intent);
        setResult(Activity.RESULT_OK, null /* data */, null /* extra */);        
    }
}
