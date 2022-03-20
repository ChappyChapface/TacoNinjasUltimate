package net.mcreator.tnunlimited.procedures;

public class PostDragSpawnConditionProcedure {
	public static boolean execute(double x, double z) {
		return z >= Math.abs(3000) && z <= Math.abs(6000) && x >= Math.abs(3000) && x <= Math.abs(6000);
	}
}
