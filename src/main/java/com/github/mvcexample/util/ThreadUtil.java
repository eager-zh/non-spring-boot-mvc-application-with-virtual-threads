package com.github.mvcexample.util;

public abstract class ThreadUtil {
	
	private ThreadUtil() {
	}
	
	public static String dumpInvocation() {
		final StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
		final String methodName = stackTrace[1].getMethodName();
		final Thread currentThread = Thread.currentThread();
		final String message = "Method " + methodName + " is executed on " + (currentThread.isVirtual() ? "virtual" : "platform")
				+ " thread, name " + currentThread.getName();
		System.out.println(message);
		return message;
	}

}
