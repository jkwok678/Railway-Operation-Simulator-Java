package elements;

public class GapLinkedTrack extends Track {
	boolean[] gapLink = new boolean[9];
	GapLinkedTrack specialLink;

	public GapLinkedTrack(TrackType trackType, int xLocation, int yLocation, boolean electrified, String methodOfElectrification) {
		this.trackType = trackType;
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.electrified = electrified;
		this.methodOfElectrification = methodOfElectrification;
		this.station = false;
		this.stationName = null;

	}
	
	public void setLinks() {
		
		switch (this.trackType) {
		
		case LINKLEFT:
			this.trackLinks[5] = true;

			break;
		
		/*case "Up Left Gap Track": 
			this.trackLinks[8] = true;

            break; 
            */
        case LINKUP: 
        	this.trackLinks[7] = true;
        	
            break; 
        /*case "Up Right Track": 
        	this.trackLinks[6] = true;

            break;
            */
        case LINKRIGHT: 
        	this.trackLinks[3] = true;

            break;
        /*case "Down Right Linked Track": 
        	this.trackLinks[0] = true;

            break; */
        case LINKDOWN: 
        	this.trackLinks[1] = true;

            break;
            
       /* case "Left Down Linked Track": 
        	this.trackLinks[2] = true;

            break;
            */
		}
	}

	public GapLinkedTrack getSpecialLink() {
		return specialLink;
	}

	public void setSpecialLink(GapLinkedTrack specialLink) {
		this.specialLink = specialLink;
	}
	
	

}
