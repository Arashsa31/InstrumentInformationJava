package LabProgram215;

//TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
// TODO: Declare private fields
	private int numString, numFret;
	private boolean bool;

// TODO: Define mutator methods - 
//       setNumOfStrings(), setNumOfFrets(), setIsBowed()
	public void setNumOfStrings(int numString) {
		this.numString = numString;
	}

	public void setNumOfFrets(int numFret) {
		this.numFret = numFret;
	}

	public void setIsBowed(boolean bool) {
		this.bool = bool;
	}

// TODO: Define accessor methods - 
//       getNumOfStrings(), getNumOfFrets(), getIsBowed()
	public int getNumOfStrings() {
		return numString;
	}

	public int getNumOfFrets() {
		return numFret;
	}

	public boolean getIsBowed() {
		return bool;
	}

}
