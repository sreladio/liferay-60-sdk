package com.izertis.ipc;

import java.io.Serializable;
import java.util.Random;

public class Pitch implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Pitch uniquePitchInstance;
	private String pitchType;
	private int pitchDifficulty;
	
	private Pitch() {}
	
	public static Pitch getPitchInstance() {
		if(uniquePitchInstance == null) {
			uniquePitchInstance = new Pitch();
		}
		return uniquePitchInstance;
	}
	
	public String getPitchType() {
		return pitchType;
	}
	
	public int getPitchDifficulty() {
		return pitchDifficulty;
	}
	
	public void generatePitch() {
		Random random = new Random(System.currentTimeMillis());
		int pitch = random.nextInt(3) + 1;
		 
		switch(pitch) {
		case 1:
			pitchType = "Fast Ball";
			pitchDifficulty = 1;
			break;
		case 2:
			pitchType = "Curve Ball";
			pitchDifficulty = 2;
			break;
		case 3:
			pitchType = "Slide Ball";
			pitchDifficulty = 3;
			break;
		default:
			pitchType = "Screw Ball";
			pitchDifficulty = 0;
			break;
		}
	}
	
}
