package com.spring.common.beans.byautodetect;

public class Panda {

	private KungFu kungFu;

	public Panda(KungFu kungFu) {
		super();
		System.out.println("autowiring by constructor");
		this.kungFu = kungFu;
	}

	public KungFu getKungFu() {
		return kungFu;
	}

	public void setKungFu(KungFu kungFu) {
		System.out.println("autowiring by type");
		this.kungFu = kungFu;
	}

	@Override
	public String toString() {
		return "Panda [kungFu=" + kungFu + "]";
	}

}
