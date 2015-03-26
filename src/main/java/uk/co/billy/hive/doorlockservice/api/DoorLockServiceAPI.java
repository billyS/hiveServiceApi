package uk.co.billy.hive.doorlockservice.api;

public interface DoorLockServiceAPI extends Runnable{
public void startService();
	
	public void stopServiceAsync();
	
	public void run();
	
	public void sendCommand(String command);
	
	public void setDoorState(String state);
	
	public String getDoorState();
}
