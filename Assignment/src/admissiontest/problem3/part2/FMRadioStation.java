package admissiontest.problem3.part2;

public class FMRadioStation {

    private String sing;
    private double frequency;

    public FMRadioStation(String sing, double frequency) throws FMRadioStationException {
        int capitalLatterCount = 0;
        this.sing = sing;
        this.frequency = frequency;
        
        for (int i = 0; i < sing.length(); i++) {
            if (sing.charAt(i) >= 'A' && sing.charAt(i) <= 'Z') {
                capitalLatterCount++;
            }
        }
        if (capitalLatterCount != 4 || sing.length() != 4) {
            throw new FMRadioStationException(sing, frequency);
        }
        if (!(sing.charAt(0) == 'A' || sing.charAt(0) == 'K' || sing.charAt(0) == 'N' || sing.charAt(0) == 'W')) {
            throw new FMRadioStationException(sing, frequency);
        }
        if (!(frequency >= 88.0 && frequency <= 108.0)) {
            throw new FMRadioStationException(sing, frequency);
        }

    }

    @Override
    public String toString() {
        return "FMRadioStation{" + "sing=" + sing + ", frequency=" + frequency + '}';
    }
    
    

}
