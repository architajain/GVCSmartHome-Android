package gvc.systems;

import android.app.Activity;
import android.os.Bundle;

import android.bluetooth.*;
import android.view.*;
import android.widget.Button;
import java.io.*;
import java.util.*;

public class GVCBluetoothApp extends Activity
{
    BluetoothSocket gSocket;
    BluetoothAdapter gAdapter;
    BluetoothDevice gDevice;
    OutputStream out;
    
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

	gAdapter = BluetoothAdapter.getDefaultAdapter();
	gDevice = gAdapter.getRemoteDevice("00:06:66:04:A6:84");

	try{
	gSocket = gDevice.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"));
	Thread.sleep(100);
	gSocket.connect();
	Thread.sleep(100);
	out = gSocket.getOutputStream();
	}
	catch(InterruptedException e) {
	}
	catch(IOException e) {
	}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
    }

    public void onStart() {
	super.onStart();
    }
    


    public void sendSignal(View v){
	Button whichButton = (Button)v;
	
	try{
	    if(whichButton.getText().toString().equals("1")) {
		//whichButton.setText("clicked");
		out.write(49);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("2")) {
		//whichButton.setText("clicked");
		out.write(50);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("3")) {
		//whichButton.setText("clicked");
		out.write(51);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("4")) {
		//whichButton.setText("clicked");
		out.write(52);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("5")) {
		//whichButton.setText("clicked");
		out.write(53);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("6")) {
		//whichButton.setText("clicked");
		out.write(54);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("7")) {
		//whichButton.setText("clicked");
		out.write(54);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }
	    if(whichButton.getText().toString().equals("8")) {
		//whichButton.setText("clicked");
		out.write(55);	   
		Thread.sleep(10);
		out.flush();
		Thread.sleep(10);
	    }

	}
	catch(IOException e) {
	}
	catch(InterruptedException e) {
	}
    }
    
    private class Something extends Thread{
	public void run(){
	}
    }
    
}
