package com.integral.eventhelperultimate;

public class BuildController {
	public static final boolean isDummyBuild = true;

	private static boolean internalDummyBuildState() {
		return true;
	}

	public static boolean isDummyBuild() {
		return isDummyBuild;
	}
}
