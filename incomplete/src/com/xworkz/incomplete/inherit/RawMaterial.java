package com.xworkz.incomplete.inherit;

public abstract class RawMaterial {
	protected String name;

	protected RawMaterial() {
		System.out.println("invoked RawMaterial Constrcutor");
	}

	// TODO override below method in subclass
	public void delivery() {
		System.out.println("delivery by road");
	}

	public abstract void manufacture();

}
