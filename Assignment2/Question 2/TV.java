public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	public TV() {
		this(1, 1, false);
	}
	public TV(int channel, int volumeLevel, boolean on) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void turnOn() {
		this.on = true;
	}
	public void turnOff() {
		this.on = false;
	}
	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			this.channel = newChannel;
		}
	}
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 50) {
			this.volumeLevel = newVolumeLevel;
		}
	}
	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}
	public void channelDown() {
		if (on && channel > 1) {
			channel--;
		}
	}
	public void volumeUp() {
		if (on && volumeLevel < 120) {
			volumeLevel++;
		}
	}
	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
}
