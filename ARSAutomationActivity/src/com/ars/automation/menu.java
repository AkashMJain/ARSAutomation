package com.ars.automation;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;



import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class menu extends Activity {
	BluetoothAdapter mBluetoothAdapter;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    OutputStream mmOutputStream;
    InputStream mmInputStream;
	Editable nameb;
	String blname;
	int stat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.rooms);
	
	  //  final EditText name = (EditText) (findViewById(R.id.editText1));
	    Button ok = (Button) (findViewById(R.id.button1));
	    ok.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			try {
				findBT();
				stat = 1;
			} catch (IOException e) {
				Toast.makeText(menu.this, "Please Connect BT module", Toast.LENGTH_SHORT).show();
			}
				
			}
		});
	
	
	    final ToggleButton light1 = (ToggleButton) findViewById(R.id.toggleButton1);
	    light1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light1.isChecked()) {
					if (stat == 1){
					try {
						String msg="on1";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}else {
					if (stat == 1){
					try {
						String msg="off1";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}
			}
		});
	
	
	    final ToggleButton light2 = (ToggleButton) findViewById(R.id.ToggleButton01);
	    light2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light2.isChecked()) {
					if (stat == 1){
					try {
						String msg="on2";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}else {
					if (stat == 1){
					try {
						String msg="off2";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}
			}
		});
	
	    final ToggleButton light3 = (ToggleButton) findViewById(R.id.ToggleButton02);
	    light3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (light3.isChecked()) {
					if (stat == 1){
					try {
						String msg="on3";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}else {
					if (stat == 1){
					try {
						String msg="off3";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}
			}
		});
	    
	    final ToggleButton ac = (ToggleButton) findViewById(R.id.ToggleButton03);
	    ac.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (ac.isChecked()) {
					if (stat == 1){
					try {
						String msg="on4";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}else {
					if (stat == 1){
					try {
						String msg="off4";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}
			}
		});
	
	
	    final ToggleButton door = (ToggleButton) findViewById(R.id.ToggleButton04);
	    door.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (door.isChecked()) {
					if (stat == 1){
					try {
						String msg="on5";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}else {
					if (stat == 1){
					try {

						String msg="off5";
						int bufferSize = 2048;
						byte[] byteArray = new byte[bufferSize];
						byteArray = (msg+"").getBytes();
						
						mmOutputStream.write(byteArray);
						
					}catch (IOException e) {
						// TODO Auto-generated catch block
						Toast.makeText(menu.this,
								"Connection not established with your home",
								Toast.LENGTH_LONG).show();
						e.printStackTrace();
					}
					} else 
						  Toast.makeText(menu.this,
									"Connection not established with your home",
									Toast.LENGTH_LONG).show();
				}
			}
		});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	void findBT() throws IOException
    {
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
       // if(mBluetoothAdapter == null)
        //{
          //  myLabel.setText("No bluetooth adapter available");
        //}

        if(!mBluetoothAdapter.isEnabled())
        {
            Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBluetooth, 1);
            
        }

        Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if(pairedDevices.size() > 0)
        {
            for(BluetoothDevice device : pairedDevices)
            {
                if(device.getName().equals("HC-05"))//FireFly-B1A7Change to the name of your bluetooth module (Case sensitive) 
                {
                    mmDevice = device;
                    break;
                }
            }
        }
       // myLabel.setText("Bluetooth Device Found");
    

      	UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"); //Standard //SerialPortService ID
       
		mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
		
        mmSocket.connect();
        mmOutputStream = mmSocket.getOutputStream();
        mmInputStream = mmSocket.getInputStream();
       
      //  beginListenForData();

       // myLabel.setText("Bluetooth Opened");
}
	

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// TODO Auto-generated method stub
	super.onCreateOptionsMenu(menu);
	MenuInflater h= getMenuInflater();
	h.inflate(R.menu.hardmenu,menu);
	return true;
	}

	public void helpButtonClick(View view) {
	// TODO Auto-generated method stub
		startActivity(new Intent("com.ars.automation.ABOUT"));
}







}
