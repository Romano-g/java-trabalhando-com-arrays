package br.com.alura.screenmatch.desafio_001.models;

public class People {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}
}
