package net.mcreator.tnunlimited.procedures;

public class BleedingActivationProcedure {
	public static boolean execute(double amplifier, double duration) {
		double baseRate = 0;
		double rateWithAmplifier = 0;
		baseRate = 60;
		rateWithAmplifier = baseRate / Math.pow(1.5, amplifier);
		if (Math.floor(rateWithAmplifier) > 0) {
			return duration % Math.floor(rateWithAmplifier) == 0;
		}
		return true;
	}
}
