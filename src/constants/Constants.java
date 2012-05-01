package constants;

public class Constants {
	// Total size of the file (probably should be read)
	public static int N = 16; // <- step 2
	// public final static int N = 9; // <- step 1

	public static int M = (int) Math.sqrt(N);
	public static int g = 2; // Length of Group
	public static int numGroups = M / g;
	public static int groupSize = M * (g + 1);

	// compute filter parameters for netid ak883
	public static float fromNetID = 0.388f;
	public static float desiredDensity = 0.59f;
	public static float wMin = 0.4f * fromNetID;
	public static float wLimit = wMin + desiredDensity;

    public final static boolean DEBUG = true;

    public static final String reducer1OutputDir = "data/output/reducer1/";
    public static final String reducer2OutputDir = "data/output/reducer2/";
    public static final String reducer3OutputDir = "data/output/reducer3/";
	public static final String reducer4OutputDir = "data/output/reducer4/";
	public static final String reducer5OutputDir = "data/output/reducer5/";
}
